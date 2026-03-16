Class A
{
 int p;
 A(){}
 A(int p)
 {
 this.p = p;
 }
}
class B extends A
{
 int q;
 B(){}
 B(int p,int q)
 {
 this.p = p;
 this.q = q;
 }
void add()
 {
 System.out.println("Addition of p,q in class B is:"+(p+q));
 } 
 }
class C extends A
{
 int r;
 C(){}
 C(int p,int r)
 {
 this.p = p;
this.r = r;
 }
void add()
 {
System.out.println("Addition of p,r in class C is:"+(p+r));
 }
}
class HierarchicalEx
{
 public static void main(String ar[])
 {
 B obj1 = new B(45,76);
obj1.add();
 C obj2 = new C(234,657);
obj2.add();
 }
}