import java.util.*;
class Two1
{
  public static void main(String args[])
  {
     String s1,s2,s3;
    Scanner ob=new Scanner(System.in);
     System.out.print("enter string s1:");
     s1=ob.nextLine();
    Scanner is=new Scanner(System.in);
   System.out.print("enter string s2:");
    s2=is.nextLine();
    s3=s1.concat(s2);
   System.out.print(s3);
}
}

   