package Operators;
//program to demonstrate unary operations in java
class UnaryOperators
{
 public static void main(String ar[])
 {
 byte x=2;
 byte y=3;
 byte p=10;
 byte q=15;

 System.out.println("Unary minus -x:"+(-x));

 System.out.println("post increment x++:"+(x++));
 System.out.println("x value after post increment : "+(x));

 System.out.println("pre increment ++y:"+(++y));
 System.out.println("y value after pre increment : "+(y));

 System.out.println("post decrement p--:"+(p--));
 System.out.println("p value after post decrement : "+(p));

 System.out.println("pre decrement --q:"+(--q));
 System.out.println("q value after pre decrement : "+(q));



 }
}
