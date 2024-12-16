package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		//Loading the URL
				driver.get("https://erail.in/");
		      //Maximize the Browser
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.findElement(By.xpath("//button[@class='fc-button fc-cta-consent fc-primary-button']")).click();
				WebElement From = driver.findElement(By.id("txtStationFrom"));
				From.clear();
				From.sendKeys("MAS",Keys.ENTER);
				WebElement To= driver.findElement(By.id("txtStationTo"));
				To.clear();
				To.sendKeys("MDU",Keys.ENTER);
				driver.findElement(By.id("chkSelectDateOnly")).click();
				//Locating the webtable
				WebElement webtable= driver.findElement(By.xpath("//div[@id='divTrainsList']/table[1]"));
				
				//to locate web table
				//List<WebElement> maintable = webtable.findElements(By.xpath("//div[@id='divTrainsList']/table[1]"));
				//to locate the train name column
				
				List<WebElement> trainnames = webtable.findElements(By.xpath("//div[@id='divTrainsList']/table[1]/tbody/tr/td[2]"));
				int trainsize = trainnames.size();
				System.out.println("train size is "+trainsize);
				System.out.println("Train List is:");
				
			    List<String>trainlist = new ArrayList<String>();
				
				for(int i=0;i< trainsize; i++) {
					String text= trainnames.get(i).getText();
					System.out.println(text);
					trainlist.add(text);
					
				}
				
				Set<String> trainset =new LinkedHashSet<String>(trainlist);
				if (trainset.size()== trainlist.size()) {
					System.out.println("No Duplicates found in Trainnames");
				}
				else
				{
					System.out.println("Duplicates found in Trainnames");	
				}
				driver.quit();
				
				}
	
	}
				
				
				


