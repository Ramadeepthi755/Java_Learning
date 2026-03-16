package Arrays;

//program to demonstrate 2-d arrays in java
class Array2dEx
{
public static void main(String ar[])
{
//creating and inserting elements into an 2d array
int marks[][] = {{10,9,8,7,8},{7,9,8,7,8},{10,5,9,7,8}};
 for(int i=0;i<3;i++) //rows
{
for(int j=0;j<5;j++) //columns
 {
 System.out.print(marks[i][j]+"\t");
 }
System.out.println();
}
}
}