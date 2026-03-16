//program to demonstrate interfaces in java
interface A
{
int p = 10; //static and final variables
//abstract methods
void show();
void display();

}
class B implements A
{
 public void show()
{
System.out.println("I am show method in B");
}
public void display()
{
System.out.println("I am display method in B");
}
}
class InterfaceEx
{
 public static void main(String ar[])
 {
B ob = new B();
ob.show();
ob.display();
 }
}
