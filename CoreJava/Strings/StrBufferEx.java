package Strings;
//program to demonstrate String Buffer concept
class StrBufferEx
{
 public static void main(String ar[])
 {
 //creating string buffer object
StringBuffer str = new StringBuffer();
System.out.println("str value is"+str);
System.out.println("str value is"+str.hashCode());
//appending values
str.append(10);
 System.out.println("str value is"+str);
 System.out.println("str value is"+str.hashCode());
str.append("hello");
System.out.println("str value is"+str);
System.out.println("str value is"+str.hashCode());
//inserting elements
str.insert(1,"TWG");
System.out.println("str value is"+str);
//deleting
str.delete(2,5);
System.out.println("str value is"+str);
//reverse
str.reverse();
System.out.println("str value is"+str);
 //replace
str.replace(2,4,"ab");
System.out.println("str value is"+str);
 }
}