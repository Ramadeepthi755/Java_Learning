package Arrays;
//program to demonstrate 3-d arrays in java
class Array3dEx
{
public static void main(String ar[])
{
//creating and inserting elements into an 2d array
int marks[][][] = {
 {{10,9,8,7,8},{7,9,8,7,8},{10,5,9,7,8}},
 {{10,9,8,7,8},{7,9,8,7,8},{10,5,9,7,8}},
 {{10,9,8,7,8},{7,9,8,7,8},{10,5,9,7,8}}


 };
 for(int i=0;i<3;i++) //2-d array index
{
for(int j=0;j<3;j++) //row
 {
 for(int k=0;k<5;k++) //column
 {
System.out.print(marks[i][j][k]+" ");
 }
 }
System.out.println();
}
}
}