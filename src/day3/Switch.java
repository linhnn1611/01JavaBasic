package day3;

import java.util.Scanner;

import org.openqa.selenium.By;

public class Switch {
	public static void doExcercise1()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=scan.nextInt();
		switch (n) {
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wesday");
			break;
		case 5:
			System.out.println("Thusday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		case 8:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Nhap lai n");
			break;
		}
	}
	public static void doExcercise2()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter LocatorType:");
		String locatorType=scan.next();
		switch (locatorType) {
		case "id":
			System.out.println("Enter LocatorValue:");
			String locatorValue=scan.next();
			System.out.println("id: By.id " +locatorValue);
			break;
		case "name":
			System.out.println("Enter LocatorValue:");
			String locatorValue1=scan.next();
			System.out.println("name: By.name " +locatorValue1);
			break;
		case "linkText":
			System.out.println("Enter LocatorValue:");
			String locatorValue2=scan.next();
			System.out.println("linkText: By.linkText " +locatorValue2);
			break;
		case "cssSelector":
			System.out.println("Enter LocatorValue:");
			String locatorValue3=scan.next();
			System.out.println("cssSelector: By.cssSelector " +locatorValue3);
			break;
		case "partialLinkText":
			System.out.println("Enter LocatorValue:");
			String locatorValue4=scan.next();
			System.out.println("partialLinkText: By.partialLinkText " +locatorValue4);
			break;
		case "tagName":
			System.out.println("Enter LocatorValue:");
			String locatorValue5=scan.next();
			System.out.println("tagName: By.tagName " +locatorValue5);
			break;
		case "xpath":
			System.out.println("Enter LocatorValue:");
			String locatorValue6=scan.next();
			System.out.println("xpath: By.xpath " +locatorValue6);
			break;
		}
	}
	public  By convertLocator(String locatorType, String locatorValue)
	{
		By result=null;
		switch (locatorType) {
		case ("id"):
		{
			result=By.id(locatorValue);
			break;
		}
		case ("name"):
		{
			result=By.name(locatorValue);
			break;
		}
		case ("linkText"):
		{
			result=By.linkText(locatorValue);
			break;
		}
		case ("cssSelector"):
		{
			result=By.cssSelector(locatorValue);
			break;
		}
		case ("partialLinkText"):
		{
			result=By.partialLinkText(locatorValue);
			break;
		}
		case ("tagName"):
		{
			result=By.tagName(locatorValue);
			break;
		}
		case ("xpath"):
		{
			result=By.xpath(locatorValue);
			break;
		}
		default:
			System.out.println("LocatorType is missing");
		} return result;
		
	}
	

}
