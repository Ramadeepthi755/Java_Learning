package Strings;
//program to check whether a string is immutable or not
class StrCheck
{
public static void main(String ar[])
{
String str = new String("Hello");
System.out.println("initially str value is:"+str);
System.out.println("initially hashcode is:"+str.hashCode());
str = "Hi";
System.out.println("After update str value is:"+str);
System.out.println("after update hashcode is:"+str.hashCode());
str = "Welcome";
System.out.println("After 2nd update str value is:"+str);
System.out.println("after 2nd update hashcode is:"+str.hashCode());
}
}