package week4.day2assignment_10122024;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {
		 // Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Loading the URL
		driver.get("https://www.amazon.in/");
		
        //Maximize the Browser
		driver.manage().window().maximize();
		
		//Adding implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions scroll =new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//a[text()='Conditions of Use & Sale']"));
		scroll.scrollToElement(element).perform();
		String text1 = driver.findElement(By.xpath("//a[text()='Conditions of Use & Sale']")).getText();
		System.out.println("Text1 is : " +text1);
		
		

	}

}
