package Introduction;
//program to demonstrate constructors
class Example
{
 String channel;
 //constructor overloading - same name with diff signatures
 Example()//default constructor
 {
 channel = "Telugu Web Guru";

 }
 //santosh
 Example(String channel) //parameterized constructor
 {//instance variable hiding
 this.channel = channel;//this represents current object variables
 }
}
class ConstEx
{
 public static void main(String ar[])
 {
Example e =new Example();

System.out.println("channel name in e object is:"+e.channel);
 Example e1 =new Example("santosh");
System.out.println("channel name in e1 object is:"+e1.channel);
 }
}