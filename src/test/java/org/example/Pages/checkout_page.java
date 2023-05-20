package org.example.Pages;
import org.example.StepDefs.hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.example.StepDefs.hooks.soft;

public class checkout_page extends main_page{

    public checkout_page(WebDriver DS_driver) {
        super(DS_driver);
    }

    public  void enterStreetName() {
        WebElement street_name = hooks.driver.findElement(By.cssSelector("[placeholder=\"Street Name\"]"));
        street_name.sendKeys("King faisel street");
    }
    public  void enterBuildingNumber() {
        WebElement Building_number = hooks.driver.findElement(By.cssSelector("[formcontrolname=\"buildingNumber\"]"));
        Building_number.sendKeys("16");
    }
    public void enterFloorNumber() {
        WebElement floor_number = hooks.driver.findElement(By.cssSelector("[formcontrolname=\"floorNumber\"]"));
         floor_number.sendKeys("5");
}
    public void enterApartNumber() {
        WebElement apart_number = driver.findElement(By.cssSelector("[formcontrolname=\"appartmentNumber\"]"));
         apart_number.sendKeys("582");
    }
    public  void enterLandmark() {
        WebElement landmark = hooks.driver.findElement(By.cssSelector("[formcontrolname=\"landLine\"]"));
         landmark.sendKeys("beside star cafe");
    }
    public  void enterAddressName() {
        WebElement Address_Name = hooks.driver.findElement(By.cssSelector("[formcontrolname=\"addressName\"]"));
         Address_Name.sendKeys("Home");
    }
    public  void shipping_address_button () {

        WebElement shipping_address_button = hooks.driver.findElement(By.xpath("//button[@class='btn checkout-btn btn-red delievry--btn--checkout']"));
        scrollToElment(shipping_address_button);
        shipping_address_button.click();
    }
    public  void personal_info_button () {
        WebElement personal_info_button = hooks.driver.findElement(By.cssSelector("[id=\"shippingAddressContinue\"]"));
        scrollToElment(personal_info_button);
        personal_info_button.click();
    }
    public  void error_message() {
        WebElement error_message= hooks.driver.findElement(By.xpath("//div[text()=\" Please enter a valid name \"]"));
       boolean error = error_message.isDisplayed();
       soft.assertTrue(error);
        soft.assertAll();
    }
}