/**
 * 
 */
package com.LockedMe.VirtualKey.project;

/**
 * @author SURA KUSALA
 *
 */
import java.io.*;
import java.util.*;
import java.nio.*;
public class LockedMeFileOptions {
	public   void  LockedMeFileOptions()
	{
	int input1=-1;
		do
		{
	System.out.println("===================================================================================================");
	System.out.println();

		 System.out.println("                                              Welcome To  Your Repository Creation of File Operations	");
	System.out.println();
	System.out.println("===================================================================================================");

	System.out.printf("\n1. Add File \n2. Search File \n3. Delete File \n4. Go Back to Main Menu  \n0. Exit \n");

		Scanner sc1 = new Scanner(System.in);
		System.out.println("\n ***********************Enter your option from the above File  Menu:********************");
		input1 = sc1.nextInt();
		switch (input1) 
		{

	case 1:
	CreateFile();
	break;
	case 2:
	SearchFile();
	break;

	case 3:
	 DeleteFile();
	break;
	case 4:
	LockedMeMenuOptions lm=new LockedMeMenuOptions();
	lm.LockedMeMenuOptions();
	break;


	default :
	                System.out.println("****Thanks For Visiting****");
			System.out.println("-----------Stay Safe !! Visit Again!!------------");






	}


	}while(input1!=0);


	}
	static void CreateFile()
	{
	Scanner s=new Scanner(System.in);
	System.out.println("---------------------Enter The Your File Name -------------------  ");
	String filename=s.nextLine().toLowerCase();
	File fd=new File("./main/",filename);

	if(fd!=null)
	{				//add file
		try
		{
		boolean res1=fd.createNewFile();
		if(res1)
		{
		System.out.println("The Created File Name is  " +fd.getName());
		System.out.println("The Createed file location is "+fd.getAbsolutePath());
		System.out.println("============@@The File is created  Succesfully@@========== ");
		}else
		{
		System.out.println("---------------The File already created------------------ ");
		}
		}
		catch(Exception e)
		{
		System.out.println("The exception" +e.getClass());
		System.out.println("The exception occured" +e.getMessage());
		}
	}else
	{
	System.out.println("************The Filenot found**************");
	}
	}



	static void SearchFile()
	{
	System.out.println("Enter the name of the File to Search: ");
	Scanner sc5=new Scanner(System.in);
	String name1 = sc5.nextLine().toLowerCase();
	File filename2 = new File("./main/",name1);
	if(filename2.isFile())
	{
	System.out.println("The Searched File Name is  " +filename2.getName());
	System.out.println("The searched file location is "+filename2.getAbsolutePath());
	}else
	{
	System.out.println("The file not found");
	}
	}




	static void DeleteFile()
	{
	//delete file
	Scanner sc4=new Scanner(System.in);
	System.out.println("=================Enter the File or Folder name and filetype to Delete:=================== ");
	String n1 = sc4.nextLine().toLowerCase();
	File filename1 = new File("./main/",n1);
	if (filename1.delete())
	{
	System.out.println("The deleted file "+filename1.getAbsolutePath());
	System.out.println();
	System.out.println("===============@@@             File deleted successfully                  @@@==============");
	System.out.println();
	} else {
	System.out.println();
	System.out.println("**********Failed to delete the File*****************");
	System.out.println();
	}
	}





}
