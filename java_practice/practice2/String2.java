package practice2;

import java.util.Scanner;



class Student
{
	int rollno[]=new int[10];
	String name[]=new String[10];
	String city[]=new String[10];
	String mob[]=new String[10];
	int i=0;
	Scanner sc=new Scanner(System.in);

public void inputData()
	{
		System.out.println("Enter rollno: ");
		rollno[i]=sc.nextInt();
		System.out.println("Enter Name: ");
        name[i]=sc.next();
        System.out.println("Enter city: ");
        city[i]=sc.next();
        ++i;
	}
	



public void showInfo()
{
	System.out.println("rollno\tname\tcity");
	System.out.println("---------------------------------------");
	for(int k=0;k<i;k++)
	{
	  System.out.println(rollno[k]+"\t"+name[k]+"\t"+city[k]+"\t");	
	}
}

public void updateData()
{
System.out.println("Enter the student rolln0: ");
int rno=sc.nextInt();
for(int k=0;k<i;++k)
   {
	if(rno==rollno[k])
	{
		System.out.println("1. "+name[k]+"\t2.Exit");
		System.out.println("Select any choice to upadte");
		int n1=sc.nextInt();
		switch(n1)
		{
			case 1:
			System.out.println("Enter New Name: ");
			String name1=sc.next();
			name[k]=name1;
			System.out.println("Record updated..");
			break;
			//
		}
	}
  }
}

public void deleteData()
{
	System.out.println("Enter the student rolln0: ");
	int rno=sc.nextInt();
	for(int k=0;k<i;++k)
	   {
		if(rno==rollno[k])
		{
			
			System.out.println("1. "+name[k]+"\t2.Exit");
			
			for(int j=k;j<i;j++) {
				rollno[j]= rollno[j+1];
				--i;
			}
			System.out.println("record deleted");
			
		}
		else {
			System.out.println("There ios no such record present in the database");
		}
	  }
}
}
class String2
{
	public static void main(String [] args)
	{
		Student s=new Student();
		while(true)
		{
          System.out.println("1. Input Data");
          System.out.println("2. Show Info");
          System.out.println("3. Update Data");
          System.out.println("4. Delete Data");
          System.out.println("5. Exit Data");
          int ch=new java.util.Scanner(System.in).nextInt();
          switch (ch)
          {
          case 1: s.inputData();
          	      break;
          case 2: s.showInfo();
          	      break;
          case 3: s.updateData();
          	      break;
          case 4: s.deleteData();
          	      break;
          case 5: s.inputData();
          	      break;	      	      


          }
		}
	}
}



