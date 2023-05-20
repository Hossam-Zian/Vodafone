package org.example.Pages;
import org.example.StepDefs.hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class product_page extends main_page
{

    public product_page(WebDriver DS_driver) {
        super(DS_driver);
    }

    public void select_prodcuts() {
        hooks.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Magic Keyboard for iPad Pro 11 inch Black']")));
        WebElement select_prodcuts = hooks.driver.findElement(By.xpath("//span[text()='Magic Keyboard for iPad Pro 11 inch Black']"));
        select_prodcuts.click();
}
     public  void add_to_basket() {
         hooks.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()=\" 667 EGP \"]")));
         WebElement add_to_basket = hooks.driver.findElement(By.cssSelector("[class=\"addToBasket-btn\"]"));
         add_to_basket.click();
}
}