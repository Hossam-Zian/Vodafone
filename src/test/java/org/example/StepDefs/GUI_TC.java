package org.example.StepDefs;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Select;
import io.cucumber.java.en.When;
import org.example.Pages.basket_page;
import org.example.Pages.checkout_page;
import org.example.Pages.product_page;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.example.Pages.home_page;

public class GUI_TC {

    home_page HomePage =new home_page(hooks.driver);
    product_page ProductPage =new product_page(hooks.driver);
    checkout_page CheckOut =new checkout_page(hooks.driver);
    basket_page BasketPage =new basket_page(hooks.driver);


    @Given("user navigate to Vodafone shop site")
    public void user_navigate_to_Vodafone_shop_site()  {

        HomePage.vodafone_shop();
    }
    @And("Select language as English.")
    public void selectLanguageAsEnglish() 
    {
        HomePage.switchToEnglishLanguage();
    }
    @And("move to Brand section and select Iphone.")
    public void goToShopByBrandSectionAndSelectIphone()
    {
        HomePage.selectAppleProdcuts();
    }


    @When("Select any of returned iphone mobiles.")
    public void selectAnyOfReturnedIphoneMobiles()
    {
        ProductPage.select_prodcuts();
    }
        @And("Press add to cart.")
    public void pressAddToCart()
    {
        ProductPage.add_to_basket();
    }
    @And("Press Proceed to Checkout.")
    public void pressProceedToCheckout()
    {
     BasketPage.Proceed_to_chechout();
    }
    @And("Select Delivery Options as Cairo Ain Shams.")
    public void selectDeliveryOptionsAsCairoAinShams()
    {
        Select city=new Select(BasketPage.select_city());
        city.selectByVisibleText(" Cairo ");
        Select area=new Select(BasketPage.select_area());
        area.selectByVisibleText("Ain Shams");

   }

    @And("Select Deliver to My Address.")
    public void selectDeliverToMyAddress()
    {
        hooks.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[text()=\" Deliver to my Address \"]")));
        BasketPage.Deliver_my_address();
    }
    @And("Add address details.")
    public void addAddressDetails()
    {
        CheckOut.enterStreetName();
        CheckOut.enterBuildingNumber();
        CheckOut.enterFloorNumber();
        CheckOut.enterApartNumber();
        CheckOut.enterLandmark();
        CheckOut.enterAddressName();
    }

    @And("confirm shipping address.")
    public void pressContinue() {

        CheckOut.shipping_address_button();
    }
    @And("Leave Personal info Tab empty.")
    public void leavePersonalInfoTabEmpty() {
    }
    @And("confirm personal info.")
    public void confirmPersonalInfo()
    {
        CheckOut.personal_info_button();
    }
    @Then("an error message returned from Full Name field.")
    public void anErrorMessageReturnedFromFullNameField()
    {
     CheckOut.error_message();
    }

}


