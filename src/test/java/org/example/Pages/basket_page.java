package org.example.Pages;
import org.example.StepDefs.hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class basket_page extends main_page{


    public basket_page(WebDriver DS_driver) {
        super(DS_driver);
    }

    public  void Proceed_to_chechout() {
        hooks.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Proceed to Checkout ']")));
        WebElement Proceed_to_chechout = hooks.driver.findElement(By.xpath("//button[text()='Proceed to Checkout ']"));
         Proceed_to_chechout.click();
    }

    public  WebElement select_city() {
        WebElement select_city = hooks.driver.findElement(By.xpath("//option[text()=' Select City ']//parent::select"));
        return select_city;
    }

    public  WebElement select_area() {
        WebElement select_area = hooks.driver.findElement(By.xpath("//option[text()=' Select area ']//parent::select"));
        return select_area;
    }

    public void Deliver_my_address() {
        WebElement Deliver_my_address = hooks.driver.findElement(By.xpath("//p[text()=\" Deliver to my Address \"]"));
        scrollToElment(Deliver_my_address);
        Deliver_my_address.click();
    }

}
