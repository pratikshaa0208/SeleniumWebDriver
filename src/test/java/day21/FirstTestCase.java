package day21;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException
	{
		
	//	ChromeDriver driver = new ChromeDriver();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	
	 String actualTitle = driver.getTitle();
	 System.out.println(actualTitle);
	 String expectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
       
	 if(actualTitle.equals(expectedTitle))
	 {
		 System.out.println("Testcase Passed");
	 }
	 else
	 {
		 System.out.println("Testcase Failed");
	 }
	 
     Thread.sleep(2000);
	 driver.close();
	
	 }

}
