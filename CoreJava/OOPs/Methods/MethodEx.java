package OOPs.Methods;
class Ex{
 int a;
 int b;
 //method overloading - two or more methods in a class having same name with different signature
 void add()//method definition
 {
 System.out.println("addition result is :"+(a+b));

 }

void add(int p)//method definition
 {
 System.out.println("addition result with single int is :"+(p+5));

 } 
 void add(float p)//method definition
 {
System.out.println("addition result with single float is :"+(p+5.5));
 }
void add(float p,float q)//method definition
 {
System.out.println("addition result with single float,float is :"+(p+q));
 }
 void mul()
 {
System.out.println("multiplication result is :"+(a*b));
 }
}
class MethodEx
{
 public static void main(String ar[])
 {
 int p=25;
 int q=30;

 Ex obj1 = new Ex();
 obj1.a=p;
 obj1.b=q;

 obj1.add();//method calling

 obj1.add(10);

 obj1.add(2.4f);
 obj1.add(1.2f,3.4f);



 obj1.mul();
 }
}