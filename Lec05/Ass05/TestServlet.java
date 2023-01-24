package Lec05.Ass05;

public class TestServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        try {
        ProductDAO productDAO = new ProductDAO();
        String id = request.getParameter("id");
        Product product = productDAO.getProduct(Integer.parseInt(id));
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = response.getWriter();
        out.println("ชื่อสินค้า: " + product.getProductName() + "<br>");
        out.println("รายละเอียดสินค้า " + product.getProductDetail() + "<br>");
        out.println("ราคาสินค้า: " + product.getPrice());
        } catch (Exception e) {
        e.printStackTrace();
        }
        }
}
