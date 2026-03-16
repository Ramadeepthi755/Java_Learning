package Strings;
//program to demonstrate String methods
class StringEx{
 public static void main(String ar[])
 {
 //create a string
 String s = "Welcome to";
 String s1 = s.concat(" Telugu Web Guru");
 System.out.println("Concatenated String is:"+s1);
 String s2 = "Welcome to Telugu Web Guru";
 char c = s2.charAt(2);
 System.out.println("Character at index 2 in string s2 is :"+c);
 int len = s2.length();
 System.out.println("Length of a String is:"+len);
 String s3 = "welcome to Telugu Web Guru";
 System.out.println("compare to result is :"+s3.compareTo(s2));
 System.out.println("compare to ignore case result is :"+s3.compareToIgnoreCase(s2));
 System.out.println("equals result is :"+s3.equals(s2));
 System.out.println("equalsIgnoreCase result is :"+s3.equalsIgnoreCase(s2));
 }
}