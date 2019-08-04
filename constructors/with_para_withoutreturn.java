//function without parameters,with out return  value
class test
{
int a;
int b;
test()
{
a=10;
System.out.println(a);
}
void display(int x)
{
a=x;
System.out.println(a);
}
}
class test_code
{
public static void main(String[] args)
{
test ob=new test();
ob.display();
//System.out.print(c);
}
}