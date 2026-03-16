package Arrays;
//program to demonstrate single dimensional arrays
class ArrayEx
{
public static void main(String ar[])
{
//creating an array
int marks[] = new int[5];
//inserting elements into array
marks[0]=10;
marks[1]=9;
marks[2]=7;
marks[3]=8;
marks[4]=9;
//printing elements from the array
System.out.println("marks[3]:"+marks[3]);
//printing all elements
for(int i=0;i<marks.length;i++)
{
System.out.println(marks[i]);
}
}
}