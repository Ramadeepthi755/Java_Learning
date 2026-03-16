package OOPs;
class human
{
 //instance variables
 String name;
 int age;
 //instance methods
 void talk(){
 System.out.println(name+" is talking");
 }
 void walk(){
 System.out.println(name+" is walking");
 }
}
//driver class
class ObjEx
{
public static void main(String ar[])
{
//creating santosh object
human santosh = new human();
santosh.name="Santosh Raju";
santosh.age=35;
santosh.talk();
santosh.walk();
human suresh = new human();
suresh.name="Suresh Kumar";
suresh.talk();
suresh.walk();
}
}