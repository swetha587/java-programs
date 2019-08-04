import java.util.*;
class Revr1
{
  public static void main(String args[])
  {
    String s,v="";
  Scanner ob=new Scanner(System.in);
  System.out.print("enter string:");                                     
  s=ob.nextLine();
  int length=s.length();
  for(int i=length-1;i>=0;i--)
   v=v+s.charAt(i);             
  System.out.print("reverse of the string is="+v);
}
}