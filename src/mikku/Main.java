package mikku;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String []args) throws IOException {
		int b=0,flag;
		int check;
		int total=0;
		int nonAcRoomSingle=1;
		int acRoomSingle=6;
		int nonAcRoomDouble=11;
		int acRoomDouble=16;
		int choice;
		int noOfRooms;
		String temp;
		String a;
		String c;
		int ar=0;
		int grandTotal;
		int [] rooms=new int[10];
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner s=new Scanner(System.in);
	Customer rinu = new Customer();
	do
	{
		b++;
		System.out.println(b);
	System.out.println("Enter Name");
	rinu.setName(br.readLine());
	System.out.println("Enter Address");
	rinu.setAddress(br.readLine());
	System.out.println("Enter Contact Number");
	rinu.setContactNumber(br.readLine());
	System.out.println("Enter Email");
	rinu.setEmail(br.readLine());
	System.out.println("Proof Type");
	rinu.setProofType(br.readLine());
	System.out.println("Proof Id");
	rinu.setProofId(br.readLine());
	rinu.register();
	System.out.println();
	System.out.println("Do you need to register one more");
	a=br.readLine();
	
	}while(a.equals("yes"));
	do
	{
	System.out.println("Menu\n1. Book\n2. Check Status\n3. Exit\nEnter your choice");
	choice=s.nextInt();
	if(choice==1)
	{
		System.out.println("Number of Rooms Needed");
	noOfRooms=s.nextInt();
	grandTotal=0;
	for(int i=1;i<=noOfRooms;i++)
	{
	System.out.println("\nchoose the services required for Room "+i);
	
	System.out.println("\nDo you need Ac");
	c=br.readLine();
	if(c.equals("yes")) {
		rinu.setAc("AC");
		System.out.println("1000");
		total=total+1000;
	}
	else if(c.equals("no"))
	{
		rinu.setAc("nAC");
		System.out.println("750");
		total=total+750;
	}
	temp=c;
	System.out.println("\nDo you need Double Cot");
	c=br.readLine();
	if(c.equals("yes")) {
		rinu.setCot("Double cot");
		System.out.println("350");
		total=total+350;
	}
	else if(c.equals("no"))
	{
		rinu.setCot("Single cot");
		System.out.println("0");
	}
	System.out.println("\nDo you need cable connection");
	if(temp.equals("yes")&&(c.equals("yes")))
	{
		rooms[ar]=acRoomDouble;
		acRoomDouble++;
	}
	else if((temp.equals("yes"))&&(c.equals("no")))
	{
		rooms[ar]=acRoomSingle;
		acRoomSingle++;
	}
	
else if(temp.equals("no")&&(c.equals("yes")))
	{
		rooms[ar]=nonAcRoomDouble;
		nonAcRoomDouble++;
	}
	else if((temp.equals("no"))&&(c.equals("no")))
	{
		rooms[ar]=nonAcRoomSingle;
		nonAcRoomSingle++;
	}
	c=br.readLine();
	if(c.equals("yes")) {
		rinu.setCable("With cable connection");
		System.out.println("50");
		total=total+50;
	}
	else if(c.equals("no"))
	{
		rinu.setCable("without cable connection");
		System.out.println("0");
	}
	System.out.println("\nDo you need Wi-Fi");
	c=br.readLine();
	if(c.equals("yes")) {
		rinu.setWifi("Wi-Fi needed");
		System.out.println("200");
		total=total+200;
	}
	else if(c.equals("no"))
	{
		rinu.setWifi("Wi-Fi not needed");
		System.out.println("0");
		
	}
	System.out.println("\nDo you need Laundry service");
	c=br.readLine();
	if(c.equals("yes")) {
		rinu.setLaundry("Laundry service needed");
		System.out.println("100");
		total=total+100;
	}
	else if(c.equals("no"))
	{
		rinu.setLaundry("Laundry service not needed");
		System.out.println("0");
	}
	
	rinu.setTotal(total);
	grandTotal=grandTotal+total;
	rinu.setGrandTotal(grandTotal);
	rinu.display();
	System.out.println("Room number is "+rooms[ar]);
	System.out.println("\nTotal amount = "+rinu.getTotal());
	ar++;
	}
	System.out.println("Grand Total = "+rinu.getGrandTotal());
	}
	else if(choice==2)
	{
		System.out.println("Enter Room number");
	check=s.nextInt();
	System.out.println();
	flag=0;
	for(int i=0;i<10;i++)
	{
		if(rooms[i]==check)
		{
			flag=1;
			System.out.println("Room number "+check+" is booked");
			break;
		}
	}
	System.out.println();
	if(flag==0)
		System.out.println("Room number "+check+" is not booked");
	}
	
	}
	while(choice!=3);
	
}
}