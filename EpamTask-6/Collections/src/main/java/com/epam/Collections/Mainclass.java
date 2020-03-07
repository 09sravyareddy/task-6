package com.epam.Collections;

import java.util.*;
public class Mainclass {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		int che;
		String key,r,element;
		list.add("Sravya");
		list.add("Madhu");
		list.add("Srujana");
		list.add("Diyaa");
		list.add("Deeana");
		list.add("ShinChan");
		list.add("Phani");
		list.add("Prashanth");
		list.add("Sahoo");
		list.add("RichieRich");
		Scanner s=new Scanner(System.in);
		while(true)
		{
			System.out.println("1.Search for an Element\n2.Add Element\n3.Remove Element\n4.Print List\n5.Exit");
			System.out.println("Enter the index of the operation you want to perform:");
			che=s.nextInt();
			if(che==1)
			{
				System.out.println("Enter the name to search:");
				key=s.next();
				if(list.contains(key))
				{
					System.out.println("The Element is found at "+(list.indexOf(key)+1)+" position");
				}
				else
				{
					System.out.println("The Element is not found");
				}

			}
			else if(che==2)
			{
				System.out.println("Enter the element you want to add:");
				element=s.next();
				list.add(element);
				System.out.println("Element added to the list..");

			}
			else if(che==3)
			{
				System.out.println("Enter the element you want to remove from the list:");
				r=s.next();
				list.remove(r);
				System.out.println("Element "+r+" is removed from list succesfully..");
			}
			else if(che==4)
			{
				System.out.println("-----Printing the list:------");
				for(String str : list)
				{
					System.out.println(str);
				}
			}
			else
			{
				System.out.println("Program Exiting!...");
				break;
			}
		}



	}

}
