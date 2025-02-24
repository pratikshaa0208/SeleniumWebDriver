package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector {

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.nopcommerce.com/");
	   /*
	    driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("mobiles");
	OR
		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("mobiles"); 
        */
		
		/*
		 driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("mobiles");
	OR
	     driver.findElement(By.cssSelector(".search-box-text")).sendKeys("mobiles");	 
		 */
		
		/*
		 driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("mobiles");
	OR 
	     driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("mobiles");
	    */
		
		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("mobilr");
	     
	}

}
