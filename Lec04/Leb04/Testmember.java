package Lec04.Leb04;

public class Testmember {
    try {
        MemberDAO memberDAO = new MemberDAO();
        
        //ดึงข้อมูล
//			Member m = memberDAO.getMember("somsak");
//			System.out.println("ชื่อ: "+m.getName());
//			System.out.println("ที่อยู่: "+m.getAddress());
        
        //ดึงข้อมูลทั้งหมด
//			ArrayList<Member> member = memberDAO.getAllMember();
//			for (Member m2 : member) {
//				System.out.println("ชื่อ: "+m2.getName());
//				System.out.println("ที่อยู่: "+m2.getAddress());
//			}
        
        //เพิ่มข้อมูล
//			Member member1 = new Member("supphitan", "ohmmy2001", "สุพพิธาน ภักสวัสดิ์", "182 หมู่ 12 บ.ใหม่โพธิ์ทอง ต.ป่าไม้งาม อ.เมือง จ.หนองบัวลำภู", "06-4880-1344", "supphitan.p@kkumail.com");
//			memberDAO.createMember(member1);
//			System.out.println("เพิ่มข้อมูลสำเร็จ");
//			memberDAO.closeConnection();
        
        //แก้ไขข้อมูล
//			Member member1 = new Member("supphitan", "ohmmy2544", "สุพพิธาน ภักสวัสดิ์", "182 หมู่ 12 บ.ใหม่โพธิ์ทอง ต.ป่าไม้งาม อ.เมือง จ.หนองบัวลำภู", "06-4880-1344", "supphitan.p@kkumail.com");
//			memberDAO.updateMember(member1);
//			System.out.println("แก้ไขข้อมูลสำเร็จ");
//			memberDAO.closeConnection();
        
        //ลบข้อมูล
        memberDAO.deleteMember("supphitan");
        System.out.println("ลบข้อมูลสำเร็จ");
        memberDAO.closeConnection();
        
        
        
        
    } catch (ClassNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
}
}
