package com.stepdef_class_2;




import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.runner_2.Runner_task_2;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdef_class_2 {

	public static WebDriver driver = Runner_task_2.driver;
	
	

@Given("User Launch the Automation Practice Application")
public void user_launch_the_automation_practice_application() {
   
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
}
@When("User click the ratio button In Radio Button Example Field")
public void user_click_the_ratio_button_in_radio_button_example_field() {
    
	 driver.findElement(By.name("radioButton")).click();
}
@And("User Enter Type of Select Countries In Suggession Class Example Field")
public void user_enter_type_of_select_countries_in_suggession_class_example_field() {
   
	driver.findElement(By.id("autocomplete")).sendKeys("India");
}
@And("User Select Option In Dropdown Example Field")
public void user_select_option_in_dropdown_example_field() {
    
	WebElement dropdown = driver.findElement(By.name("dropdown-class-example"));
	 Select option = new Select(dropdown);
	 option.selectByIndex(2);
}
@Then("Click Option In Checkbox Example Filed")
public void click_option_in_checkbox_example_filed() {
    
	driver.findElement(By.id("checkBoxOption2")).click();
}

@When("I click on open Window button")
public void i_click_on_open_window_button() {
   driver.findElement(By.id("openwindow")).click();
}

@And("User Find the handle of the new window and back to parent window")
public void user_find_the_handle_of_the_new_window_and_back_to_parent_window() {
	String win = driver.getWindowHandle();
    String title = driver.switchTo().window(win).getTitle();
    System.out.println(title);
  Set<String> wind = driver.getWindowHandles();
    
   for (String str : wind) {
		driver.switchTo().window(str).getTitle();
		
	}
   driver.switchTo().window(win).getTitle();
   
}

@Then("user refresh The parent page")
public void user_refresh_the_parent_page() {
	driver.navigate().refresh();
    
}
@When("I click on open Tab button")
public void i_click_on_open_tab_button() {
 WebElement element = driver.findElement(By.xpath("//a[text()='Open Tab']"));
     
     element.click();
}
@When("User Find the handle of the new tab and back to parent tab")
public void user_find_the_handle_of_the_new_tab_and_back_to_parent_tab() {
	String win = driver.getWindowHandle();
    String title = driver.switchTo().window(win).getTitle();
    System.out.println(title);
  Set<String> wind = driver.getWindowHandles();
    
   for (String str : wind) {
		driver.switchTo().window(str).getTitle();
		
	}
   driver.switchTo().window(win).getTitle();
}
@Then("user refresh The parent tab")
public void user_refresh_the_parent_tab() {
   driver.navigate().refresh();
}
@When("I Enter Username In Switch To Alert Example Field")
public void i_enter_username_in_switch_to_alert_example_field() {
    
	driver.findElement(By.name("enter-name")).sendKeys("deeps2345");
}
@When("I Click On Alert Button")
public void i_click_on_alert_button() {
    
	driver.findElement(By.id("alertbtn")).click();
}
//@When("I Handel Alert Funtionality")
//public void i_handel_alert_funtionality() {
    
//}
@Then("I Switch to Alert Accept")
public void i_switch_to_alert_accept() {
	driver.switchTo().alert().accept();
}

@When("I Enter Username In Switch To Alert Field")
public void i_enter_username_in_switch_to_alert_field() {
	driver.findElement(By.name("enter-name")).sendKeys("deeps2345");
}

@And("I Click On confirm Button")
public void i_click_on_confirm_button() {
	driver.findElement(By.id("confirmbtn")).click();
}
@Then("I Switch to Alert Confirm")
public void i_switch_to_alert_confirm() {
	driver.switchTo().alert().dismiss();
}
@When("User get row and get text")
public void user_get_row_and_get_text() {
	System.out.println("==Row==");
    WebElement Row = driver.findElement(By.xpath("//table[@id='product']/tbody/tr[4]/td[2]"));
    System.out.println(Row.getText());
}
@When("User get Colume and get text")
public void user_get_colume_and_get_text() {
	 System.out.println("==colume==");
	    WebElement colume = driver.findElement(By.xpath("//table[@id='product']/tbody/tr[4]/td[1]"));
	    System.out.println(colume.getText());
}

@Then("User Get single particular data")
public void user_get_single_particular_data() {
    
	 System.out.println("==single particular data==");
	    WebElement single = driver.findElement(By.xpath("//table[@id='product']/tbody/tr[3]/td[3]"));
	    System.out.println(single.getText());
}
@When("I Enter Username In Element Displayed field")
public void i_enter_username_in_element_displayed_field() {
   
	driver.findElement(By.id("displayed-text")).sendKeys("deeps");
}

@When("I Hied Username In Element Displayed field")
public void i_hied_username_in_element_displayed_field() {
    
	driver.findElement(By.id("hide-textbox")).click();
}

@Then("I show Username In Element Displayed field")
public void i_show_username_in_element_displayed_field() {
    
	driver.findElement(By.id("show-textbox")).click();
}

@When("I Fix row and get text")
public void i_fix_row_and_get_text() {
	System.out.println("==Row==");
    WebElement Row = driver.findElement(By.xpath("//table[@id='product']/tbody/tr[6]/td[4]"));
    System.out.println(Row.getText());
}

@When("I Fix Colume and get text")
public void i_fix_colume_and_get_text() {
   
	 System.out.println("==colume==");
	    WebElement colume = driver.findElement(By.xpath("//table[@id='product']/thead/tr[1]/th[3]"));
	    System.out.println(colume.getText());
}

@Then("I Fix single particular data")
public void i_fix_single_particular_data() {
    
	 System.out.println("==single particular data==");
	    WebElement single = driver.findElement(By.xpath("//table[@id='product']/tbody/tr[4]/td[4]"));
	    System.out.println(single.getText());
	
}
@When("I click Mouse Hover and perform action")
public void i_click_mouse_hover_and_perform_action() throws AWTException {

	JavascriptExecutor js = (JavascriptExecutor) driver;
	// scroll down
	js.executeScript("window.scrollBy(0,800)");

	
	
	
    Actions act = new Actions(driver);
	WebElement sell = driver.findElement(By.id("mousehover"));

    act.moveToElement(sell).perform();
    

    Robot r = new Robot();
    
    r.keyPress(KeyEvent.VK_DOWN);
   r.keyRelease(KeyEvent.VK_DOWN);
       r.keyPress(KeyEvent.VK_ENTER);
      r.keyRelease(KeyEvent.VK_ENTER);
      
}
@When("I Click The Top In Mouse hover field")
public void i_click_the_top_in_mouse_hover_field() {
      driver.findElement(By.xpath("//a[text()='Top']")).click();
      
      
}
@Then("I scroll down The page")
public void i_scroll_down_the_page() {

	JavascriptExecutor js = (JavascriptExecutor) driver;
	// scroll down
	js.executeScript("window.scrollBy(0,1300)");
}
}






