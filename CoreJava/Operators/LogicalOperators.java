package Operators;
//program to demonstrate logical operations in java
class LogicalOperators
{
 public static void main(String ar[])
 {
 byte x=10;
 byte y=20;
 byte z=30;

 if(x<y && x<z)
 System.out.println("x is smaller than y,z");


 if(x<y || x<z)
 System.out.println("x is smaller than either y or z or both");

 if(!(x==y))
 System.out.println("x and y values are not the same");


 }
}