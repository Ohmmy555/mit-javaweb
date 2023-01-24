package Lec04.Leb04;

public class MemberDAO {
    private Connection con;
	public MemberDAO() throws SQLException, ClassNotFoundException{
	Class.forName("com.mysql.cj.jdbc.Driver");
	con = DriverManager.getConnection("jdbc:mysql://localhost/blueshop?characterEncoding=utf-8", "root", "");
	}

public void closeConnection() throws SQLException {
	con.close();
	}

private Member mappingMember(ResultSet resultSet) throws SQLException {
	Member member = new Member();
	member.setUsername(resultSet.getString("username"));
	member.setName( resultSet.getString("name") );
	member.setAddress( resultSet.getString("address") );
	member.setMobile( resultSet.getString("mobile") );
	member.setEmail( resultSet.getString("email") );
	return member;
}

public Member getMember(String username) throws SQLException {
	PreparedStatement pStatement = con.prepareStatement("SELECT * FROM member WHERE username = ?");
	pStatement.setString(1, username);
	
	ResultSet resultSet = pStatement.executeQuery();
	
	if (resultSet.next()) {
		Member member = mappingMember(resultSet); 
		return member; 
		} else {
		return null;
		}
}

public ArrayList<Member> getAllMember() throws SQLException {
	PreparedStatement pStatement = con.prepareStatement("SELECT * FROM member");
	ResultSet resultSet = pStatement.executeQuery();
	ArrayList<Member> memberList = new ArrayList<Member>();
	while (resultSet.next()) {
		Member m2 = mappingMember(resultSet);
		memberList.add(m2);
		}
		return memberList;
		
}

public void createMember (Member member) throws SQLException {
	PreparedStatement pStatement = con.prepareStatement("INSERT INTO member (username, password,name, address, mobile, email) VALUES (?, ?, ?, ?, ?, ?)");
	pStatement.setString(1, member.getUsername() );
	pStatement.setString(2, member.getPassword() );
	pStatement.setString(3, member.getName() );
	pStatement.setString(4, member.getAddress() );
	pStatement.setString(5, member.getMobile() );
	pStatement.setString(6, member.getEmail() );
	
	pStatement.executeUpdate();
}

public void updateMember (Member member) throws SQLException {
	PreparedStatement pStatement = con.prepareStatement("UPDATE member SET password = ?, name = ?,address = ?,mobile = ?,email = ? WHERE username = ?");
	pStatement.setString(1, member.getPassword() );
	pStatement.setString(2, member.getName() );
	pStatement.setString(3, member.getAddress() );
	pStatement.setString(4, member.getMobile() );
	pStatement.setString(5, member.getEmail() );
	pStatement.setString(6, member.getUsername() );
	
	pStatement.executeUpdate();
	}

public void deleteMember (String username) throws SQLException {
	PreparedStatement pStatement = con.prepareStatement("DELETE FROM member WHERE username = ?");
	pStatement.setString(1, username);

	pStatement.executeUpdate();
	}
}
