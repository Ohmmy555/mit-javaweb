package Lec05.Lab05;

public class ServletFrom {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		if(username.length() == 10 && password.equals("1234")) {
				out.println("<html><body style='color: green;'>");
				out.println("เข้าสู่ระบบสำเร็จ");
				out.println("</html></body>");
			}else {
				out.println("<html><body style='color: red;'>");
				out.println("เข้าสู่ระบบไม่สำเร็จ");
				out.println("</html></body>");
			}
		
	}
}
