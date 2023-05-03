package example.project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class abhibus {
	public static void main( String[] args ) throws InterruptedException
    {
		System.out.println( "Hello World!" );
        WebDriverManager.edgedriver().setup();
        WebDriver driver= new EdgeDriver();
        
        driver.get("https://www.abhibus.com/bus-ticket-booking");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name=\"source\"]")).sendKeys("COIMBATORE",Keys.ENTER);
        driver.findElement(By.xpath("//input[@name=\"destination\"]")).sendKeys("CHENNAI",Keys.ENTER);
        WebElement jou_date=driver.findElement(By.xpath("//input[@name=\"journey_date\"]"));
    }

}
