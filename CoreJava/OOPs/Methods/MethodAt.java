package OOPs.Methods;
//program to demonstrate Methods in java
class ArEx
{
 void printarray()
 {
 for(int i=0;i<10;i++)
 System.out.println(i);

 }
}
class MethodAt
{
 public static void main(String ar[])
 {
 ArEx obj = new ArEx();
obj.printarray();
 }
}