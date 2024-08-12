package pages;

import org.openqa.selenium.By;

import static utility.BrowserDriver.driver;

public class SignInPage {
    public static String username_text_xpath = "//input[@id='usr']";
    public static String password_text_xpath = "//input[@id='pwd']";
    public static String login_btn_xpath = "//input[@value='Login']";
    public static String registration_btn_xpath = "//button[@id='NewRegistration']";

    public static void sendKeys_username(){
        driver.findElement(By.xpath(username_text_xpath)).sendKeys("hello");

    }
    public static void sendKeys_password(){
        driver.findElement(By.xpath(password_text_xpath)).sendKeys("hello");

    }
    public static void click_login_btn(){
        driver.findElement(By.xpath(login_btn_xpath)).click();

    }
    public static void click_new_registration_btn(){
        driver.findElement(By.xpath(registration_btn_xpath)).click();

    }
}

