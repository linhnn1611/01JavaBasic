package day5HW;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

import org.openqa.selenium.devtools.v101.systeminfo.SystemInfo;

public class JavaBasic {
	public static void doEx1()
	{
		System.out.println("*****");
		System.out.println();
		System.out.println("*****");
		System.out.println();
		System.out.println("*****");
		System.out.println();
		System.out.println("*****");
		System.out.println();
		System.out.println("*****");
		System.out.println();
	}
	public static void doEx2()
	{
		int a=10;
		float b= (float) 12.5;
		String s="Java programming";
		System.out.println(a+", "+b+", and "+s);
	}
	public static void doEx3()
	{
		String s="20";
		int a=Integer.parseInt(s); //convert string s to int a
	}
	public static void doEx4()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Price of laptop:");
		double priceLaptop=scan.nextDouble();
		System.out.print("Price of PC:");
		double pricePC=scan.nextDouble();
		System.out.print("Price of project:");
		double priceProject=scan.nextDouble();
		DecimalFormat formatter= new DecimalFormat("###,###,###");
		double avg=(priceLaptop+pricePC+priceProject)/3;
		System.out.print("The average price of these three products:"+(formatter.format(avg))+" VND");
	}
	public static void doEx5()
	{
		int i=2000;
		NumberFormat currencyFormat=NumberFormat.getCurrencyInstance();
		String s1=currencyFormat.format(i);
		System.out.println("Convert to string: "+s1);
	}
	public static void doEx6()
	{
		String [] s={"Welcome to Java Basic"};
		String count = "_";
		for (int i=0; i<s.length-1;i++)
		{
			if (s[i]==" ")
			{
				s[i]=count;
			}
			if (i==s.length)
			{
				s[i]="";
			}
		}
		System.out.println(s);
	}
}
