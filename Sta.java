import java.io.*;
import java.util.*;
class Stack
{
  int size=5,ele,i;
  int s[]=new int[size],top=-1;
  {
	  System.out.println("**STACK USING ARRAY**");
  }
  void push()
  {
	  if(top==size-1)
	  {
		  System.out.println("stack is full,you cant insert an element");
	  }
	  else
	  {
		  System.out.println("which element do you want to enter:");
		  Scanner sc=new Scanner(System.in);
		  ele=sc.nextInt();
		  top++;   
		  s[top]=ele;
		  System.out.println("inserted successfully");
	  }
  }
  void pop()
  {
	  if(top==-1)
	  {
		  System.out.println("stack is empty,you cant delete");
	  }
	  else
	  {
		  System.out.println("popped element is"+s[top]);
		  top--;
	  }
  }
  void display()
  {
	  if(top==-1)
	  {
		  System.out.println("stack is empty,you cant display");
	  }
	  else
	  {
		  System.out.println("stack elements are:");
		  for(i=top;i>=0;i--)
			  System.out.println(s[i]);
	  }
  }
}
class St
{
	public static void main(String[] args)
	{
		char c;
		 int ch;
		 Stack ob=new Stack();
		 do
		 {
			 System.out.println("\n1.push\n 2.pop\n 3.display");
			 System.out.println("enter your choice:");
			 Scanner sc=new Scanner(System.in);
			 ch=sc.nextInt();
			 switch(ch)
			 {
				 case 1:ob.push();
				        break;
				 case 2:ob.pop();
				        break;
				 case 3:ob.display();
				        break;
				 default:System.out.println("invalid option");
			        	 break;
			 }
			 System.out.println("do you want to continue(y/n)");
			 c=sc.next().charAt(0);
		 }while(c=='y'||c=='Y');
	}
}
	