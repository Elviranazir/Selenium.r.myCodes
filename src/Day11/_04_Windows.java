package Day11;

import Utilities.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _04_Windows extends BaseDriver {

    @Test
    public void windowsTest() {
        driver.get("https://www.selenium.dev/");
        String windowId =  driver.getWindowHandle();
//        System.out.println(windowId);


        WebElement watchVideoLink = driver.findElement(By.xpath("//a[text()='Watch the Videos']"));
        watchVideoLink.click();

        Set<String> windowIds = driver.getWindowHandles();

        for (String id : windowIds){
            if (!id.equals(windowId)){
                driver.switchTo().window(id);
            }
        }

        System.out.println("driver.getTitle() = " + driver.getTitle());
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        driver.close();
        driver.switchTo().window(windowId);

        System.out.println("driver.getTitle() = " + driver.getTitle());
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

    }
}

