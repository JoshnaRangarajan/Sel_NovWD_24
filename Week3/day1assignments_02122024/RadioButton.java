package week3.day1assignments_02122024;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;



public class RadioButton {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		
		//Select 'Your most favourite browser' from the radio buttons
		driver.findElement(By.xpath("(//div[@class='ui-radiobutton-box ui-widget ui-corner-all ui-state-default'])[9]")).click();
		
		//Click on a radio button, then click on the same radio button again to verify that it becomes ‘unselected’.

		driver.findElement(By.xpath("//input[@value='Chennai']/following::div[1]/span")).click();
		driver.findElement(By.xpath("//input[@value='Chennai']/following::div[1]/span")).click();
		
		//Identify the radio button that is initially selected by default.
		boolean selected = driver.findElement(By.xpath("//input[@value='Option3']")).isSelected();
		System.out.println(selected);
		String text = driver.findElement(By.xpath("//input[@value='Option3']//following::label[1]")).getText();
		System.out.println(text);
		
		
		//Check and select the age group (21-40 Years) if not already selected.
		boolean selected1 = driver.findElement(By.xpath("//input[@value='21-40 Years']")).isSelected();
		System.out.println(selected1);
		driver.close();
		
	}

}
