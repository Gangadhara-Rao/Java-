package cg;

public class Strings {
	
		public static void main(String args[])
		{
		String str1 = new String("Rock");
		String str2 = new String("Roll");
		String str3 = new String("rock");
		String str4 = new String("Rock");
		String str5 = new String("Roll");
		//comparing the strings
		System.out.println("Comparing " + str1 + " and " + str2 + " : " + str2.equals(str2));
		System.out.println("Comparing " + str3 + " and " + str4 + " : " + str3.equals(str4));
		System.out.println("Comparing " + str4 + " and " + str5 + " : " + str4.equals(str5));
		System.out.println("Comparing " + str1 + " and " + str4 + " : " + str1.equals(str4));
		System.out.println("Comparing " + str1 + " and " + str1 + " : " + str1.equals(str1));
		}
		}


