package basePage;

import lib.SDCheckout;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import lib.SDLogin;
import resources.browserConfig;

import java.io.IOException;

public class Validate_Product_Checkout extends browserConfig {

    @Test
    public void validate_Product_Checkout_1() throws IOException, InterruptedException {
        initializeDriver();
        SDLogin.login(driver, "standard_user", "secret_sauce");
        SDCheckout.checkout_Aproduct(driver, "Sauce Labs Backpack", "moahmmad", "hosen", "11433");
        Thread.sleep(2000);
        //ssert.assertEquals(driver.findElement(By.className("complete-header")).getText(), "THANK YOU FOR YOUR ORDER");
    }

}
