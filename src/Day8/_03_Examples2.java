package Day8;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Go to https://www.facebook.com/
 * Click on Create New Account
 * Enter name, lastname and email
 * Verify that an input is displayed that says enter your email again
 * and it was not there at the beginning
 * Re-enter your email
 * Create a password
 * Select date of birth
 * Select Gender
 * And Verify it is selected
 **/
public class _03_Examples2 extends BaseDriver {
    @Test
    public void test1(){

        driver.get("https://www.facebook.com/");
        WebElement createaccount = driver.findElement(By.cssSelector("" +
                "" +
                "" +
                "" +
                "" +
                ""));
        createaccount.click();

        WebElement firstname= driver.findElement(By.cssSelector("input[id^='u_2'][id*='_b_']"));
        firstname.sendKeys("jhdjdjd");
        WebElement lastname =driver.findElement(By.cssSelector("input[id^=\"u_2\"][id*=\"_d_\"]"));
        lastname.sendKeys("kjdklda");

        WebElement gmail =driver.findElement(By.cssSelector("input[id^='u_'][id*='g']"));

        WebElement comf =driver.findElement(By.cssSelector("//input[@name=\"reg_email_confirmation__\"] "));
        Assert.assertFalse(comf.isDisplayed());
        WebElement password =driver.findElement(By.xpath("//input[@id=\"password_step_input\"]"));
        password.sendKeys("dasc424asA");



        MyMethods.myWait(1);
        driver.quit();



    }
}
