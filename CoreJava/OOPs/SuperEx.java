class A
{
 int p = 10; //member variables

 void show() //member methods
 {
 System.out.println("class A:"+p);
 }

}
class B extends A
{
//p=10,show() --> from class A
int q = 20;
int p = 45;

void show(){

 super.show();

 System.out.println("Class B:"+super.p);
 System.out.println("Class B:"+p);
 System.out.println("Class B:"+q);

 }

}
class SuperEx
{
public static void main(String ar[])
{
    B obj = new B();
 obj.show();


 }
}