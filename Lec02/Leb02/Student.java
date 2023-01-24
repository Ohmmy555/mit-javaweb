package Lec02.Leb02;

    public class Student extends Person {
        private String studentID;
        
        public Student(String fullname,int age,String gender,String studentID) {
            super.setFullname(fullname);
            super.setYaer(age);
            super.setGender(gender);
            this.studentID = studentID;
        }
        
        public Student() {
            super();
            this.studentID = "ไม่มีรหัสนักศึกษา";
        }
    
        public String display() {
            return super.display() + " รหัสนักศึกษา : " + studentID;
        }
    
        public String getStudentID() {
            return studentID;
        }
    
        public void setStudentID(String studentID) {
            this.studentID = studentID;
        }
        
        
    }

