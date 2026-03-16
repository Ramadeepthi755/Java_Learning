//program to demonstrate reading input from keyboard
import java.io.*;
class ReadInput
{
public static void main(String ar[]) throws IOException
 {
 //connect input stream with the keyboard
 InputStreamReader obj=new InputStreamReader(System.in);

 //connect BufferedReader with the obj
 BufferedReader br = new BufferedReader(obj);

 //read input Now
 System.out.println("Please enter your name");
 String name = br.readLine();

 //display the string
 System.out.println("Hello "+name+", Welcome to TWG");
 }
}