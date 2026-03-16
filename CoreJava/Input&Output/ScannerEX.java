//program to demonstrate reading input from keyboard using Scanner
import java.util.*;
class ScannerEX
{
public static void main(String ar[])
 {
 //connect input stream with the keyboard
 Scanner sc=new Scanner(System.in);


 //read input Now
 System.out.println("Please enter your name");
 String name = sc.next();

 //display the string
 System.out.println("Hello "+name+", Welcome to TWG");
 sc.close();
 }
}