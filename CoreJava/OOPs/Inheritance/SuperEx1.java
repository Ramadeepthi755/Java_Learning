class A{

 int p,q,r;
 A(){}
 A(int p,int q,int r)
 {
 this.p = p;
 this.q = q;
 this.r = r;
 }
}
class B extends A{
//p,q,r --> from A
int s,t;
B(){}
// 11 22 33 44 55
B(int p,int q,int r,int s,int t)
{
super(p,q,r);//calling super class constructor
this.s = s;
this.t = t;
}
void add()
{
 System.out.println(p+q+r+s+t);
}
}
class SuperEx1{
public static void main(String ar[])
{
 B obj = new B(11,22,33,44,55);
 obj.add();
}
}
