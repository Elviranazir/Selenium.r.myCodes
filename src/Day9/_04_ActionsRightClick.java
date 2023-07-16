package Day9;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _04_ActionsRightClick extends BaseDriver {
    @Test

    public void Test1(){

        driver.get("https://demoqa.com/buttons");

        WebElement rightClickBtn = driver.findElement(By.id("rightClickBtn"));

        Actions actions = new Actions(driver);
//        Action action = actions.moveToElement(rightClickBtn).contextClick().build();
//        action.perform();

        Action action = actions.contextClick(rightClickBtn).build();
        action.perform();

        // actions.contextClick(rightClickBtn).build().perform();  can perform the action once

        action.perform();  // we can perform the same action multiple times

        waitAndQuit();



    }


}

