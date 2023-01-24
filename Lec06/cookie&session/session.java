package Lec06.cookie&session;

public class session {
    //สร้าง
    HttpSession session = request.getSession(); //สร้างเซคชั่นเมื่อมีการเชื่อมต่อ
session.setAttribute("username", username); //กำหนดชื่อและข้อมูอ่

//อ่าน
String name = (String)session.getAttribute("firstname");
}
