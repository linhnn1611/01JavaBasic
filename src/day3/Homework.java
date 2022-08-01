package day3;

import java.sql.Date;
import java.text.DateFormat;
import java.util.Calendar;

public class Homework {
	public static void doEx1() 
	{
		int x=(int) (Math.random()*7000);
		System.out.println("Yourname_"+x);
	}
	public static void doEx2()
	{
		Calendar cal=Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR)+","+cal.get(Calendar.MONTH)+","+cal.get(Calendar.DATE)+","+cal.get(Calendar.HOUR)+","+cal.get(Calendar.MINUTE));
	}	
	public static void doEx4()
	{
		Calendar cal=Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR)+"-"+cal.get(Calendar.MONTH)+"_"+cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.DATE)+"-"+cal.get(Calendar.MONTH)+"_"+cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.YEAR)+"-"+cal.get(Calendar.MONTH)+"_"+cal.get(Calendar.DATE)+" "+cal.get(Calendar.HOUR)+":"+cal.get(Calendar.MINUTE)+":"+cal.get(Calendar.SECOND));
		System.out.println(cal.get(Calendar.HOUR)+":"+cal.get(Calendar.MINUTE)+"."+cal.get(Calendar.SECOND)+"."+cal.get(Calendar.MILLISECOND));
		System.out.println(cal.get(Calendar.YEAR)+"-"+cal.get(Calendar.MONTH)+"_"+cal.get(Calendar.DATE)+" "+cal.get(Calendar.HOUR)+":"+cal.get(Calendar.MINUTE)+"."+cal.get(Calendar.SECOND)+"."+cal.get(Calendar.MILLISECOND));
		System.out.println(cal.get(Calendar.YEAR)+"-"+cal.get(Calendar.MONTH)+"_"+cal.get(Calendar.DATE)+" "+cal.get(Calendar.HOUR)+":"+cal.get(Calendar.MINUTE)+"."+cal.get(Calendar.SECOND)+"."+cal.get(Calendar.MILLISECOND)+" +0100");
	}
}
