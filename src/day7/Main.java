package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		submitSuccessfully();
	//	checkBox();

	}
	public static void submitSuccessfully()
	{
		//open browser
		System.setProperty("webdriver.chrome.driver", "/Users/nguyennhatlinh/Downloads/06_AutoationProject/01Tools/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		//get link
		driver.get("https://demoqa.com/");
		//mo rong kich thuoc trinh duyet
		driver.manage().window().maximize();
		//scoll xuong
		JavascriptExecutor jse6 = (JavascriptExecutor) driver;
		jse6.executeScript("window.scrollBy(0,250)", "");
		//chon element box
		driver.findElement(By.xpath("//h5[text()='Elements']")).click();
//		driver.findElement(By.xpath("//span[text()='Text Box']")).click();
//		driver.findElement(By.id("userName")).sendKeys("Linh");
//		driver.findElement(By.id("userEmail")).sendKeys("Linh@gmail.com");
//		driver.findElement(By.id("currentAddress")).sendKeys("Ha Noi");
//		driver.findElement(By.id("permanentAddress")).sendKeys("Viet Nam");
//		driver.findElement(By.id("submit")).click();
//		
//		
//		String name=driver.findElement(By.id("name")).getText();
//		String actualName=name.substring(name.lastIndexOf(":")+1, name.length());
//		System.out.println(actualName);
//		if(actualName.equals("Linh"))
//		{
//			System.out.println("Pass");
//		} else
//		{
//			System.out.println("Fail");
//		}
//		
//		
//		String email=driver.findElement(By.id("email")).getText();
//		String actualmail=email.substring(email.lastIndexOf(":")+1, email.length());
//		System.out.println(actualmail);
//		if(actualmail.equals("Linh@gmail.com"))
//		{
//			System.out.println("Pass");
//		} else
//		{
//			System.out.println("Fail");
//		}
//		
//		
//		String cadd=driver.findElement(By.xpath("//p[@id='currentAddress']")).getText();
//		String actualcadd=cadd.substring(cadd.lastIndexOf(":")+1, cadd.length());
//		System.out.println(actualcadd);
//		if(actualcadd.equals("Ha Noi"))
//		{
//			System.out.println("Pass");
//		} else
//		{
//			System.out.println("Fail");
//		}
//		
//		
//		String padd=driver.findElement(By.xpath("//p[@id='permanentAddress']")).getText();
//		String actualpadd=padd.substring(padd.lastIndexOf(":")+1, padd.length());
//		System.out.println(actualpadd);
//		if(actualpadd.equals("Viet Nam"))
//		{
//			System.out.println("Pass");
//		} else
//		{
//			System.out.println("Fail");
//		}
		
		
	//	WebDriver driver=new ChromeDriver();
	//}
	//public static void checkBox()
		driver.findElement(By.xpath("//span[text()='Check Box']")).click();
		driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/span[1]/label[1]/span[1]/*[1]")).click();
		String a1=driver.findElement(By.xpath("//span[contains(text(),'You have selected :')]")).getText();
		String a2=driver.findElement(By.xpath("//span[contains(text(),'home')]")).getText();
		String a3=driver.findElement(By.xpath("//span[contains(text(),'desktop')]")).getText();
		String a4=driver.findElement(By.xpath("//span[contains(text(),'notes')]")).getText();
		String a5=driver.findElement(By.xpath("//span[contains(text(),'commands')]")).getText();
		String a6=driver.findElement(By.xpath("//span[contains(text(),'documents')]")).getText();
		String a7=driver.findElement(By.xpath("//span[contains(text(),'workspace')]")).getText();
		String a8=driver.findElement(By.xpath("//span[contains(text(),'react')]")).getText();
		String a9=driver.findElement(By.xpath("//span[contains(text(),'angular')]")).getText();
		String a10=driver.findElement(By.xpath("//span[contains(text(),'veu')]")).getText();
		String a11=driver.findElement(By.xpath("//span[contains(text(),'office')]")).getText();
		String a12=driver.findElement(By.xpath("//span[contains(text(),'public')]")).getText();
		String a13=driver.findElement(By.xpath("//span[contains(text(),'private')]")).getText();
		String a14=driver.findElement(By.xpath("//span[contains(text(),'classified')]")).getText();
		String a15=driver.findElement(By.xpath("//span[contains(text(),'general')]")).getText();
		String a16=driver.findElement(By.xpath("//span[contains(text(),'downloads')]")).getText();
		String a17=driver.findElement(By.xpath("//span[contains(text(),'wordFile')]")).getText();
		String a18=driver.findElement(By.xpath("//span[contains(text(),'excelFile')]")).getText();
		String a=a1.concat(" ").concat(a2).concat(" ").concat(a3).concat(" ").concat(a4).concat(" ").concat(a5).concat(" ").concat(a6).concat(" ").concat(a7).concat(" ").concat(a8).concat(" ").concat(a9).concat(" ").concat(a10).concat(" ").concat(a11).concat(" ").concat(a12).concat(" ").concat(a13).concat(" ").concat(a14).concat(" ").concat(a15).concat(" ").concat(a16).concat(" ").concat(a17).concat(" ").concat(a18);
		System.out.println(a);
		String b="You have selected : home desktop notes commands documents workspace react angular veu office public private classified general downloads wordFile excelFile";
		if (a.equals(b))
		{
			System.out.println("Pass");
		}else 
			{System.out.println("Fail");}
		driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/span[1]/button[1]/*[1]")).click();
		String s1= driver.findElement(By.xpath("//svg[text()='rct-icon-check']")).getText();
		System.out.println(s1);
	}

}
