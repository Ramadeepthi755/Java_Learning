package Strings;
//program to demonstrate String methods
class StringEx2{
 public static void main (String ar[])
 {

 String s1 = "Welcome to JAVA Strings class by TWG";
 System.out.println("startsWith result is:"+s1.startsWith("wel"));
 System.out.println("endssWith result is:"+s1.endsWith("TWG"));

 System.out.println("index of e in s1 is :"+s1.indexOf("e"));
 System.out.println("last index of e in s1 is :"+s1.lastIndexOf("e"));
 String s2 = s1.replace('W','e');
 System.out.println("replaced string s2 is :"+s2);
 System.out.println("sub string s1.substring(5) is :"+s1.substring(5));
 System.out.println("sub string s1.substring(5,12) is :"+s1.substring(5,12));
 System.out.println("s1.toLowerCase() is :"+s1.toLowerCase());
 System.out.println("s1.toUpperCase() is :"+s1.toUpperCase());
 System.out.println("s1 is :"+s1);
 System.out.println("s1 trim is :"+s1.trim());
 String res[] = s1.split(" ");
 System.out.println("res array length is:"+res.length);

 for(int i=0;i<res.length;i++)
 System.out.println(res[i]);

 char a[] = new char[100];
 s1.getChars(5,12,a,1);
 System.out.println(a[1]);

 }
}