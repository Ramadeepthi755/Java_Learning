package Final_KeyWord;

class A
{
 final void show()
 {
 System.out.println("I am show method from A");
 }
}
class B extends A
{


}
class finalmethod
{
 public static void main(String ar[])
 {
 B ob = new B();
 ob.show();
 }
}
