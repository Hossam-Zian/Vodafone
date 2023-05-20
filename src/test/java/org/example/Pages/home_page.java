package org.example.Pages;
import org.example.StepDefs.hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
public class home_page extends main_page {


    public home_page(WebDriver DS_driver)  {
        super(DS_driver);
    }

    public  void vodafone_shop() {
        String URL =driver.getCurrentUrl();
        Assert.assertEquals(URL,"https://eshop.vodafone.com.eg/shop/");
    }

    public  void switchToEnglishLanguage() {
        hooks.wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[class=\"lang\"]")));
        WebElement language = hooks.driver.findElement(By.cssSelector("[class=\"lang\"]"));
        language.click();
    }
    public  void selectAppleProdcuts() {
        WebElement Apple_prodcuts = hooks.driver.findElement(By.xpath("//a[@href='/shop/shopByBrand/Apple']/div"));
        scrollToElment(Apple_prodcuts);
        Apple_prodcuts.click();
}
}