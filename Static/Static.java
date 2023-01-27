package cg.Static;

public class Static {
	static String collagneame = "vignan";
	int StudentRollNO;
	String StudentName ;
	
public Static(int studentRillNO, String studentName) {
		
		StudentRollNO = studentRillNO;
		StudentName = studentName;
	}
	void display()
	{
		System.out.println(collagneame + "  " + StudentRollNO + "  " + StudentName);
	}
public static void main(String[] args){
	Static s1 = new Static(221, "ganga");
	Static s2 = new Static(238, "akhil");
	Static s3 = new Static(225, "sairam");
	Static s4 = new Static(268, "rohit");
	s1.display();
	s2.display();
	s3.display();
	s4.display();
}
}
