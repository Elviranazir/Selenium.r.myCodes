package Day9;

import Utilities.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _08_ActionsSendKeys extends BaseDriver {
    @Test
    public void test1() {

        driver.get("https://demoqa.com/auto-complete\n");

        WebElement inputbox = driver.findElement(By.id("autoCompleteMultipleContainer"));
       // inputbox.sendKeys("John");

        Actions actions = new Actions(driver);
        Action action = actions.moveToElement(inputbox).click().keyDown(Keys.SHIFT).sendKeys("a").keyUp(Keys.SHIFT)
                        .sendKeys("ohn").build();
        action.perform();

        waitAndQuit();
    }
}
