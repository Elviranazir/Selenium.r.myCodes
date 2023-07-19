package Day11;

import Utilities.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _02_IFrame extends BaseDriver {

    @Test
    public void iFrameTest() {

        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0);

//        driver.switchTo().frame("frame1");
//
//        WebElement iFrame = driver.findElement(By.id("frame1"));
//        driver.switchTo().frame(iFrame);


        WebElement inputBox = driver.findElement(By.cssSelector("input[type='text']"));
        inputBox.sendKeys("USA");

        driver.switchTo().parentFrame();  // goes one step back
        //driver.switchTo().defaultContent(); // goes to the beginning, to the hallway directly


        //driver.switchTo().frame("frame2");    // using id is slow, by index is much faster
        driver.switchTo().frame(1);  // using index is the fastest way

        WebElement animalsSelect = driver.findElement(By.id("animals"));
        Select animals = new Select(animalsSelect);     // we should use select, to select from dropdown, it's best practice

        animals.selectByValue("avatar");

        //waitAndQuit();

    }
}