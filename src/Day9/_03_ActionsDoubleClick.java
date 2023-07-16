package Day9;

import Utilities.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _03_ActionsDoubleClick extends BaseDriver {
    @Test

    public void Test1(){

        driver.get("https://demoqa.com/buttons");

        WebElement doubleclick = driver.findElement(By.id("doubleClickBtn"));
        Actions actions = new Actions(driver);
//        Action action = actions.moveToElement(doubleclick).doubleClick().build();
//        action.perform();

        Action action = actions.doubleClick(doubleclick).build();
        action.perform();

    }


}
