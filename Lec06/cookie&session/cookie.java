public class cookie {
    //สร้าง
    String name = request.getParameter("username"); //ดึงค่าจาก GET&POST
Cookie cookie = new Cookie("username", name); //สร้างObject
cookie.setMaxAge(30 * 60); //ตั้งค่าคุกกี้
response.addCookie(cookie); //ส่งค่าการสร้างคุกกี้ไปเครื่องผู้ใช้


//อ่าน
Cookie[] cookies = request.getCookies();
if (cookies != null) {
	for (int i = 0; i < cookies.length; i++) {
	Cookie cookie = cookies[i];
	if (cookie.getName().equals("username")) {
		String userName = cookie.getValue();
		out.println("Hello " + userName);
		break;
		}
	}
}
}
