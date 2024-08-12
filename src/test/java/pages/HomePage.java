package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class HomePage extends BrowserDriver {
    public static String hamburger_manu_xpath = "//input[@type='checkbox']";
    public static String signIn_link_xpath = "//a[@href='SignIn.html']";


    public static void click_hamburger_menu() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(hamburger_manu_xpath)).click();
    }

    public static void click_signIn_link() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(signIn_link_xpath)).click();
    }
}
