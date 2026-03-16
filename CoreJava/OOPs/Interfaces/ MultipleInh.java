class A
{
 void methodA()
 {
 System.out.println("I am methodA from class A");
 }
}
interface B
{
 void methodB();
}
interface C
{
void methodC();
}
class D extends A implements B,C
{
//methodA from Class A

 public void methodB()
 {
    
System.out.println("I am methodB from class D");
}
public void methodC()
{
System.out.println("I am methodC from class D");
}
}
class MultipleInh
{
 public static void main(String ar[])
 {
 D ob = new D();
 ob.methodA();
 ob.methodB();
 ob.methodC();

 }
}
 
