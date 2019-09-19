package mikku;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String []args) throws IOException {
		String name;
		String address;
		String contactNumber;
		String email;
		String  proofType;
		String proofId;
		String a;
		int b=0;
		int total=0;
		int d=0;
		String c;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Customer rinu = new Customer();
	do
	{
		b++;
		System.out.println(b);
	System.out.println("Enter Name");
	name=br.readLine();
	System.out.println("Enter Address");
	address= br.readLine();
	System.out.println("Enter Contact Number");
	contactNumber=br.readLine();
	System.out.println("Enter Email");
	email=br.readLine();
	System.out.println("Proof Type");
	proofType=br.readLine();
	System.out.println("Proof Id");
	proofId=br.readLine();
	rinu.setName(name);
	rinu.setAddress(address);
	rinu.setContactNumber(contactNumber);
	rinu.setEmail(email);
	rinu.setProofType(proofType);
	rinu.setProofId(proofId);
	rinu.register();
	System.out.println("Do you need to register one more");
	a=br.readLine();
	
	}while(a.equals("yes"));
	do
	{
		total=0;
	System.out.println("Do you need Ac");
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
	System.out.println("Do you need Double Cot");
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
	System.out.println("Do you need cable connection");
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
	System.out.println("Do you need Wi-Fi");
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
	System.out.println("Do you need Laundry service");
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
	System.out.println("Do you want to proceed");
	a=br.readLine();
	if(a.equalsIgnoreCase("yes"))
		d++;
	rinu.setRoomNo(d);
	}
	while(a.equals("no"));
	rinu.setTotal(total);
	System.out.println("Total amount = "+rinu.getTotal());
	rinu.display();

}}
