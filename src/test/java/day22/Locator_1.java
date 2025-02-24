package day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_1 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/" );
		
		//name
		driver.findElement(By.name("q")).sendKeys("shoes");
		Thread.sleep(5000);
		
		driver.findElement(By.name("q")).clear();
		Thread.sleep(5000);

		//linktext
		//xdriver.findElement(By.linkText("Mobiles")).click();
		
		//partiallinktext
	    //driver.findElement(By.partialLinkText("Mob")).click();
		
		//className Example1
		//driver.findElement(By.className("_2GaeWJ")).click();
		
		//className Example2
		List<WebElement> images2 = driver.findElements(By.className("_2GaeWJ"));    
		System.out.println("total number of images having same class attribute value "+images2.size());
		
		//classname Example3
		List<WebElement> links2 = driver.findElements(By.className("_1ch8e_"));    //o/p is 9
		System.out.println(links2.size());
		
		
		//tagname
		List<WebElement> links1 = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links on the webpage is "+ links1.size());
		
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Total number of images on the webpage is "+ images.size());
		

		
		List<WebElement> aa = driver.findElements(By.name("q"));         // o/p is 1
		System.out.println(aa.size());
	
		int a = 10;
        int b = 10;

        // Using unary operators
        System.out.println((a++));
        System.out.println((++a));

        System.out.println("Postdecrement : " + (b--));
        System.out.println("Predecrement : " + (--b));
	}

}
