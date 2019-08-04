import java.util.*;
class Three1
{
  public static void main(String args[])
  {
     String s1,s2;
    Scanner ob=new Scanner(System.in);
     System.out.print("enter string s1:");
     s1=ob.nextLine();
    Scanner is=new Scanner(System.in);
   System.out.print("enter string s2:");
    s2=is.nextLine();
    int n=s1.compareTo(s2);
   System.out.print(n);
}
}