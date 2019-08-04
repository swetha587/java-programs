import java.util.*;
class revfun
{
    public static void main(String args[])
{
  System.out.print("enter string to reverse:");
  Scanner ob=new Scanner(System.in);
  String s=ob.nextLine(); 
   StringBuilder sb=new StringBuilder(s);
   System.out.println("reversed string is=");
    System.out.print(sb.reverse().toString());
}
}