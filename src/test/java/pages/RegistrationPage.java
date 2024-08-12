package pages;

import org.openqa.selenium.By;

import static utility.BrowserDriver.driver;

public class RegistrationPage {
    public static String registration_heading_xpath = "//h1[normalize-space()='User Registration Page']";

    public static String visibility_registration_heading(){
        return driver.findElement(By.xpath(registration_heading_xpath)).getText();
    }
}
