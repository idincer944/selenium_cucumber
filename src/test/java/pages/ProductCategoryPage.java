package pages;

import org.openqa.selenium.By;

import static utility.BrowserDriver.driver;

public class ProductCategoryPage {
    public static String product_category_heading_xpath = "//div[@id='SmokeTests']//h3[@id='ShoeType']";

    public static boolean visibility_product_category(){
        return driver.findElement(By.xpath(product_category_heading_xpath)).isDisplayed();
    }
}
