package week4.day3;

public class Students {

	public void getStudentInfo(int Id) {
		System.out.println("Student id:"+Id);	
	}
	
	public void getStudentInfo(int Id,String name) {
		
		System.out.println("Student id:"+Id+" "+"Student name:"+name);
	
}
	public void getStudentInfo(String email,long phonenumber) {
		System.out.println("Student email:"+email+" "+"Student phonenumber:"+phonenumber);
	}
	
	public static void main(String[] args) {
		Students std = new Students();
		std.getStudentInfo(17);
		std.getStudentInfo(17, "Divya");
		std.getStudentInfo("dp29", 23456789);
	}
}
