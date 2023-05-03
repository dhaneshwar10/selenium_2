package example.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class difber {
	 public static void main( String[] args ) throws InterruptedException
	    {
	        System.out.println( "Hello World!" );
	        WebDriverManager.edgedriver().setup();
	        WebDriverManager.chromedriver().setup();
	        WebDriverManager.firefoxdriver().setup();
	        
	        WebDriver driver= new EdgeDriver();
	        WebDriver driv2= new ChromeDriver();
	        WebDriver dri3= new FirefoxDriver();
	        
	        driver.get("https://www.google.co.in/");
	        driv2.get("https://www.google.co.in/");
	        dri3  .get("https://www.google.co.in/");
	        
	       
	        
	    }
	 
}
