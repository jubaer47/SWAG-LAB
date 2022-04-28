package lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SDCheckout {

    public static void checkout_Aproduct(WebDriver driver, String givenText, String firstname, String lastname, String zipcode) throws InterruptedException {
        List<WebElement> elements = driver.findElements(By.className("inventory_item_name"));
        for (WebElement element : elements) {
            String text = element.getText();
            if (text.equalsIgnoreCase(givenText)) {
                element.click();
                break;
            }
            Thread.sleep(2000);
            driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
            driver.findElement(By.id("shopping_cart_container")).click();
            driver.findElement(By.id("checkout")).click();
            driver.findElement(By.id("first-name")).sendKeys(firstname);
            driver.findElement(By.id("last-name")).sendKeys(lastname);
            driver.findElement(By.id("postal-code")).sendKeys(zipcode);
            driver.findElement(By.id("continue")).click();
            driver.findElement(By.id("finish")).click();


        }

    }


}




