package Day11;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _01_WaitExample3 extends BaseDriver {
    /**
     * Go to "https://www.demoblaze.com/index.html"
     * Click on Samsung Galaxy s6
     * Click on "Add to Cart"
     * Click on Product Store to go back to the main page
     * Verify that you are on the main page
     **/
    @Test
    public void waitExample(){
        driver.get("https://demoblaze.com/index.html");

        WebElement galaxy = driver.findElement(By.xpath("//a[text()='Samsung galaxy s6']"));
        galaxy.click();

        WebElement addToCart = driver.findElement(By.xpath("//a[text()='Add to cart']"));
        addToCart.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());

        driver.switchTo().alert().accept();

        WebElement goback = driver.findElement(By.className("navbar-brand"));
        goback.click();


        Assert.assertTrue("Test failed", driver.getCurrentUrl().equals("https://demoblaze.com/index.html"));
        waitAndQuit();
    }
}
