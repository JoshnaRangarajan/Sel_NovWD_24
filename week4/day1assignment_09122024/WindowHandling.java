package week4.day1assignment_09122024;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

		public static void main(String[] args) {
			ChromeDriver driver = new ChromeDriver();
			//Loading the URL
					driver.get("http://leaftaps.com/opentaps/control/login");
			      //Maximize the Browser
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
					//Enter the username
					driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
					
					//Enter the password
					driver.findElement(By.id("password")).sendKeys("crmsfa");
					
					//Click the login button
					driver.findElement(By.className("decorativeSubmit")).click();
				
				    //Click the CRMSFA link
					driver.findElement(By.linkText("CRM/SFA")).click();
					
					//Click on the Contacts button
					driver.findElement(By.linkText("Contacts")).click();
					
					//Click on the Merge button
					driver.findElement(By.linkText("Merge Contacts")).click();
					
					//Click on first widget
					driver.findElement(By.xpath("//table[@name='ComboBox_partyIdFrom']//following::a")).click();
					
					//Transfer focus to child window
					//Step1:
					Set<String> allAddresses = driver.getWindowHandles();
					System.out.println("Window addressess are ; "+allAddresses);
					//Step2:
					//Converting set to list
					List<String> allWindowsAddress = new ArrayList<String>(allAddresses);
					System.out.println("List is:  "+allWindowsAddress);
					//Step3:To transfer the driver focus
					driver.switchTo().window(allWindowsAddress.get(1));
					String childTitle = driver.getTitle();
					System.out.println("Child Title is:  "+childTitle);
					
					
					// Click on the first resulting contact.
					driver.findElement(By.linkText("19989")).click();
					
					// Transfer focus to parent window
					driver.switchTo().window(allWindowsAddress.get(0));
					String parentTitle = driver.getTitle();
					System.out.println("Parent Title is:  "+parentTitle);
					
					
					//Click on the widget of the To Contact
					driver.findElement(By.xpath("//table[@id='widget_ComboBox_partyIdTo']//following::a")).click();
					//Step1:
					Set<String> allAddresses1 = driver.getWindowHandles();
					System.out.println("Window addressess are ; "+allAddresses1);
					//Step2:
					//Converting set to list
					List<String> allWindowsAddress1 = new ArrayList<String>(allAddresses1);
					System.out.println("List is:  "+allWindowsAddress1);
					//Transfer focus to child
					driver.switchTo().window(allWindowsAddress1.get(1));
					
					String childTitle1 = driver.getTitle();
					System.out.println("Parent Title is:  "+childTitle1);
					
					
					//Click on the second resulting contact.
					driver.findElement(By.linkText("19990")).click();
					
					//Transfer focus to parent window
					
					//Step1:
					Set<String> allAddresses2 = driver.getWindowHandles();
					System.out.println("Window addressess are ; "+allAddresses2);
					//Step2:
					//Converting set to list
					List<String> allWindowsAddress2 = new ArrayList<String>(allAddresses2);
					System.out.println("List is:  "+allWindowsAddress2);
					//Transfer focus to parent
					driver.switchTo().window(allWindowsAddress2.get(0));
					
					//Click Merge Button
					driver.findElement(By.className("buttonDangerous")).click();
					
					//Transfer focus to Alert
					Alert mergeprompt= driver.switchTo().alert();
					mergeprompt.accept();
					
					//Get Title
					System.out.println(driver.getTitle());
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					

	}

}


