import java.io.*;
import java.util.*;
class Student
{
	static int i=0;
	String name;
	double marks;
	int rno;
	static void display(Student s)
	{
		System.out.println("name of the student is: "+s.name);
		System.out.println("marks of the student is: "+s.marks);
		System.out.println("roll number of student is "+s.rno);
		System.out.println("\n");
	}
}
class Sm
{
	static
	{
		System.out.println("student management system");
	}
	public static void main(String args[])
	{
		int ch,r=0,n,j,c;
		Student s[]=new Student[10];
		for(j=0;j<10;j++)
			s[j]=new Student();
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("\n1.insert student record\n2.display student record\n3.search student record\n");
			System.out.println("enter your choice");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:n=Student.i;
				System.out.println("enter student name");
				s[Student.i].name=sc.next();
				System.out.println("enter student marks");
				s[Student.i].marks=sc.nextDouble();
				s[Student.i].rno=Student.i+1;
				Student.i=(Student.i)+1;
				break;
				case 2:for(int k=0;k<Student.i;k++)
				{
					Student.display(s[k]);
				}
				break;
				case 3:
				int cnt=0;
				System.out.println("enter the roll number you want to search: ");
				r=sc.nextInt();
				for(int k=0;k<Student.i;k++)
				{
					if(s[k].rno==r)
					{
						cnt++;
						if(r==0)
						System.out.println("record is not found");
					else
						System.out.println("record is found");
					}
				}
				if(cnt==0)
					System.out.println("record is not found");
				break;
				default:System.out.println("choose valid option");
				break;
			}
			System.out.println("do you want to continue (1/0)");
			c=sc.nextInt();
		}while(c==1);
	}
}