//program to demonstrate abstract classes in java
abstract class CGovt
{
void otherdirections()//concrete methods
 {
 System.out.println("I am from otherdirections method");
 }
abstract void actionsTobeTaken(); //abstract method
abstract void actionsTobeTaken1(); //abstract method
}
class AP extends CGovt
{
void actionsTobeTaken1()
{
System.out.println("I am from actionsTobeTaken1 in AP");
}
void actionsTobeTaken()
{
System.out.println("I am from actionsTobeTaken in AP");
}
}
class TG extends CGovt
{
void actionsTobeTaken1()
{
System.out.println("I am from actionsTobeTaken1 in TG");
}
void actionsTobeTaken()
{
System.out.println("I am from actionsTobeTaken in TG");
}
}
class AbsClass
{
public static void main(String ar[])
{
//CGovt cg = new CGovt();
AP ap = new AP();
ap.actionsTobeTaken();
ap.otherdirections();
TG tg = new TG();
tg.otherdirections();
tg.actionsTobeTaken();
}
}