package example.project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class customer {
	public static void main( String[] args ) throws InterruptedException
    {
		System.out.println( "Hello World!" );
        WebDriverManager.edgedriver().setup();
        WebDriver driver= new EdgeDriver();
        
        driver.get("https://demo.guru99.com/test/delete_customer.php");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name=\"cusid\"]")).sendKeys("401",Keys.ENTER);
//        driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name=\"cusid\"]")).clear();
        driver.findElement(By.xpath("//input[@name=\"cusid\"]")).sendKeys("402",Keys.ENTER);
//        driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
    }
}
