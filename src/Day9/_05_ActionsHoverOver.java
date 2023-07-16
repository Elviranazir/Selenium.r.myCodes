package Day9;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _05_ActionsHoverOver extends BaseDriver {

    @Test

    public void Test1() {

        driver.get("https://www.ebay.com/");
        WebElement electronics = driver.findElement(By.linkText("Electronics"));

        Actions actions = new Actions(driver);
        Action action = actions.moveToElement(electronics).build();
        action.perform();
        MyMethods.myWait(3);
        WebElement headphones = driver.findElement(By.linkText("Headphones"));
        headphones.click();
        String url = driver.getCurrentUrl();
        Assert.assertTrue(url.contains("Headphones"));

        MyMethods.myWait(2);
        waitAndQuit();

    }

}
