package OOPs.Inheritance;
//program to demonstrate single inheritance
class A
{
 int p;

 A(){}

 A(int a)
 {
 p = a;
 }
 void display()
 {
 System.out.println("I am base class method display. My variable p value is:"+p);
 }
}
class B extends A
{
 int q;

 B(){}

 //12 25
 B(int p,int q)
 {
 this.p = p;
 this.q = q;
 }
 void show()
 {
 System.out.println("I am derived class method show.My q value is :"+q);
 }
}
class InheritEx
{
 public static void main(String ar[])
 {
 B obj = new B(12,25);
 obj.show();
 obj.display();
 }
}
