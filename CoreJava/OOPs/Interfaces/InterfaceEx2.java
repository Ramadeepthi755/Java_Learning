//program to demonstrate interfaces
interface A{
int p = 10; //static

 void showA();
}
interface B extends A
{
 //int p = 10;
//showA from A
 void showB();
}
class C implements B
{
//int p = 10;
public void showB()
{
    System.out.println("I am showB from class C");
}
public void showA()
{
 System.out.println("I am showA from class C");
}
}
class InterfaceEx2
{
 public static void main(String ar[])
 {
 C ob = new C();
 ob.showA();
 ob.showB();
 System.out.println(ob.p);

 System.out.println(A.p);

 }
}

