package week3.day1assignments_02122024;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundButtonInteraction {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		//Loading the URL
				driver.get("https://leafground.com/button.xhtml");
				
		      //Maximize the Browser
				driver.manage().window().maximize();
				
				//Click on the button with the text ‘Click and Confirm title.’
				driver.findElement(By.xpath("//span[@class='ui-button-text ui-c'][1]")).click();
				
				//Verify that the title of the page is ‘dashboard.’
				String titleOfPage = driver.getTitle();
				System.out.println("Page Title is :   " +titleOfPage);
				
				driver.navigate().back();
				
				//Check if the button with the text ‘Confirm if the button is disabled’ is disabled.
				boolean enabled = driver.findElement(By.xpath("//button[@disabled='disabled']")).isEnabled();
				System.out.println(enabled);
				
				
				//Find and print the position of the button with the text ‘Submit.’
				Point position = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt94']")).getLocation();
				System.out.println(position);
				
				//Find and print the background color of the button with the text ‘Find the Save button color.’
				String cssValue = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt96']")).getCssValue("background-color");
				System.out.println("Css Value is " +cssValue);
				
				//Find and print the height and width of the button with the text ‘Find the height and width of this button.’
				Dimension size = driver.findElement(By.xpath("//button[@name='j_idt88:j_idt98']")).getSize();
				System.out.println(size);
				
				//Close the browser window.	
				driver.close();
				
				
				
				
				
				
				
				
	}

}
