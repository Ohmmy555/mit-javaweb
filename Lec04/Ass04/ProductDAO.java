package Lec04.Ass04;

public class ProductDAO {
    private Connection con;
	
	public ProductDAO() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost/blueshop?characterEncoding=utf-8", "root", "");
		}
	
	public void closeConnection() throws SQLException {
		con.close();
		}
	
	private Product mappingProduct(ResultSet resultSet) throws SQLException {
		Product product = new Product();
		product.setPid( resultSet.getInt("pid") );
		product.setProductName( resultSet.getString("pname") );
		product.setProductDetail( resultSet.getString("pdetail") );
		product.setPrice( resultSet.getInt("price") );
		return product;
	}
	
	
	// Method ข้อมูลจากฐานข้อมูล
	public Product getProduct(int pid) throws SQLException {
		PreparedStatement pStatement = con.prepareStatement("SELECT * FROM product WHERE pid = ?");
		pStatement.setInt(1, pid);
		
		ResultSet resultSet = pStatement.executeQuery();
		
		if (resultSet.next()) { // ถ้าพบข้อมูล
			Product product = mappingProduct(resultSet); // น าผลลพั ธท์ ฐี่ านขอ้ มลู สง่ กลบัแปลงเป็น object
			return product; // สง่ กลบั เป็น javabean
			} else { // ถ้าไม่พบข้อมูล
			return null;
			}
	}
	
	public ArrayList<Product> getAllProduct() throws SQLException {
		PreparedStatement pStatement = con.prepareStatement("SELECT * FROM product");
		ResultSet resultSet = pStatement.executeQuery();
		ArrayList<Product> productList = new ArrayList<Product>();
		while (resultSet.next()) {
			Product p2 = mappingProduct(resultSet); // แปลงข้อมูลเป็ น javabean
			productList.add(p2); // เก็บ javabean ในอาร์เรย์
			}
			return productList; // สง่ อารเรย์ก ์ ลับ
			
	}
	
	
	
	// Method เพิ่มข้อมูลลงในฐานข้อมูล
	public void createProduct (Product product) throws SQLException {
		// เตรยีมคา สง่ั SQL
		PreparedStatement pStatement = con.prepareStatement("INSERT INTO product (pname, pdetail, price) VALUES (?, ?, ?)");
		pStatement.setString(1, product.getProductName() );
		pStatement.setString(2, product.getProductDetail() );
		pStatement.setInt(3, product.getPrice() );
		
		pStatement.executeUpdate();
	}
	
	// Method อัปเดตข้อมูล
	public void updateProduct (Product product) throws SQLException {
		// เตรยี มคา สง่ั SQL
		PreparedStatement pStatement = con.prepareStatement("UPDATE product SET pname = ?, pdetail = ?,price = ? WHERE pid = ?");
		pStatement.setString(1, product.getProductName() );
		pStatement.setString(2, product.getProductDetail() );
		pStatement.setInt(3, product.getPrice() );
		pStatement.setInt(4, product.getPid() );
		// สง่ คา สง่ั SQL ไปยังฐานข้อมูล
		pStatement.executeUpdate();
		}
	
	
	// Method ลบข้อมูล
	public void deleteProduct (int id) throws SQLException {
		// เตรยีมคา สง่ั SQL
		PreparedStatement pStatement = con.prepareStatement("DELETE FROM product WHERE pid = ?");
		pStatement.setInt(1, id);
		// สง่ คา สง่ั SQL ไปยังฐานข้อมูล
		pStatement.executeUpdate();
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ProductDAO productDAO = new ProductDAO(); // สร้าง object DAO
			
			//ดึงข้อมูลทีละตัว
			Product p = productDAO.getProduct(1); // เรียกเมธอดจาก DAO
			System.out.println(p.getProductName() + " ราคา " + p.getPrice() + " บาท"); // น าผลลัพธ์มาแสดง
			//ดึงข้อมูลมาเก็บที่ Array แล้ววนลูปออกมา
			ArrayList<Product> products = productDAO.getAllProduct(); // เรียกเมธอดจาก DAO
			for (Product p2 : products) {
			System.out.println(p2.getProductName() + " ราคา " + p2.getPrice() + " บาท"); // น าผลลัพธ์มาแสดง
			}			
			//เรียกใช้การเพิ่มข้อมูล
			Product product1 = new Product(0, "นาฬิกา", "ดูเวลา", 350);
			// เรียกเมธอดจาก DAO
			productDAO.createProduct(product1);
			productDAO.closeConnection(); // การเพิ่ม/ลบ/แก้ไข ต้องปิดการติดต่อฐานข้อมูลเสมอ
			// อัปเดตข้อมูล
			// เตรียม product object ที่จะน าไปแก้ไขในฐานข้อมูล
			Product product2 = new Product(17,"รถยนต์","ขับขี่",10000);
			// เรียกเมธอดจาก DAO
			productDAO.updateProduct(product2);
			productDAO.closeConnection();
			
			// ลบข้อมูล
			productDAO.deleteProduct(17);
			productDAO.closeConnection();
			
			} catch (Exception e) {
			e.printStackTrace();
			}
	}
}
