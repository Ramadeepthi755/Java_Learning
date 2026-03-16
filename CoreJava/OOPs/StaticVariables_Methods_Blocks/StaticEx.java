package OOPs.StaticVariables_Methods_Blocks;
//program to demonstrate static variables and static methods
class JavaClass
{
 String name; //instance variable
void listen()//instance method
{
System.out.println(name+" is listening the class");
}
static String board;//static variable
static void teaching() //static method
 {
 System.out.println("Santosh is teaching static keyword concept on"+board+" board");
 }
}
class StaticEx
{
 public static void main(String args[])
 {
 JavaClass santosh = new JavaClass();
 santosh.name = "Santosh Raju";
 santosh.listen();

 JavaClass.board="White";
 JavaClass.teaching();
 }
static{
System.out.println("I am static block");
}
}