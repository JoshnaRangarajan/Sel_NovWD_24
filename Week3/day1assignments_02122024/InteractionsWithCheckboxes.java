package week3.day1assignments_02122024;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractionsWithCheckboxes {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		//Loading the URL
				driver.get("https://leafground.com/checkbox.xhtml");
				
		      //Maximize the Browser
				driver.manage().window().maximize();
				//to select "Basic Checkbox"
		         driver.findElement(By.xpath("//div[contains(@class,'ui-chkbox-box ui-widget')]")).click();
		         //boolean selected = driver.findElement(By.xpath("//div[contains(@class,'ui-chkbox-box ui-widget')]")).isSelected();
		         //System.out.println(selected);
		         
		         //to select " Notification Checkbox"
		         driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[2]")).click();
		         
                 //Click on your favorite language (assuming it's related to checkboxes).
		         driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[3]")).click();
		         
		         //- Click on the "Tri-State Checkbox.
		         driver.findElement(By.xpath("//div[@data-iconstates='[\"\",\"ui-icon ui-icon-check\",\"ui-icon ui-icon-closethick\"]']")).click(); 
		         
		         //Click on the "Toggle Switch."
		         driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		         
		         //Verify if the Checkbox is disabled.
		         boolean selected = driver.findElement(By.xpath("(//div[contains(@class,'ui-selectbooleancheckbox ui-chkbox')])[3]")).isSelected();
		         System.out.println(selected);
		         
		         //Select multiple options on the page (details may be needed).
		         driver.findElement(By.xpath("//ul[contains(@class,'ui-selectcheckboxmenu-multiple-container ui-widget')]")).click(); 
		         driver.findElement(By.xpath("//div[@class='ui-widget-header ui-corner-all ui-selectcheckboxmenu-header ui-helper-clearfix']//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
		         driver.findElement(By.xpath("//div[@class='layout-main-content']")).click(); 
				driver.quit();
	}

}
