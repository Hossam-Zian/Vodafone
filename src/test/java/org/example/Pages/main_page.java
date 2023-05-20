package org.example.Pages;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class main_page
{
    static WebDriver driver;

    main_page(WebDriver DS_driver)
    {
        driver = DS_driver;
    }
    public void scrollToElment(WebElement element)
    { JavascriptExecutor j = (JavascriptExecutor) driver; j.
     executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'})", element); }
}
