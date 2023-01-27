package cg;

public class StringConcepts {
	public static void main(String args[]) {
	String txt = "abcdefghijklmnopqrstuvwxyz";
	System.out.println("the count of txt is" +txt.length());
	System.out.println("hello"+txt.toUpperCase()); //convert to upper case
	System.out.println("hello"+txt.toLowerCase()); // lower case
	
	
	String txet = "Please locate where 'locate' occurs!";
	System.out.println(txet.indexOf("locate")); 
	

}
}
