package Day11;

import Utilities.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _03_IFrame extends BaseDriver {

    @Test
    public void iFrameTest() {

        driver.get("https://chercher.tech/practice/frames");
        ////input[@type='text']

        driver.switchTo().frame(0);

        WebElement inputBox = driver.findElement(By.cssSelector("input[type='text']"));
        inputBox.sendKeys("USA");

        driver.switchTo().frame(0);  // we are entering closet
        WebElement checkBox = driver.findElement(By.xpath("//input[@id='a']"));
        checkBox.click();

        driver.switchTo().defaultContent();   // goes directly to the hallway

        driver.switchTo().frame(1);    // entering kids room
        WebElement animalsSelect = driver.findElement(By.id("animals"));
        Select animals = new Select(animalsSelect);     // we should use select, to select from dropdown, it's best practice

        animals.selectByValue("avatar");

//        waitAndQuit();

    }
}