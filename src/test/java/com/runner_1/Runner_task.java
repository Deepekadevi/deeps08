package com.runner_1;

import org.junit.BeforeClass;  
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature_1"
,glue = "com\\stepdef_class")
 
 
public class Runner_task {
	
	public static WebDriver driver;
	@BeforeClass
	public static void setup() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		
	}
	
}
