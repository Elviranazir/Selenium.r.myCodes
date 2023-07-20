package Day12;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class _01_Scroll extends BaseDriver {

    // We use scroll to load more elements on a page

    //  We use JavaScriptExecutor interface
    //  JavascriptExecutor js = (JavascriptExecutor) driver;
    //  js.executeScript("window.scrollTo(0, 3000)")                        -> Scrolls down to 3000th pixel;
    //  js.executeScript("window.scrollBy(0, 3000);")                       -> Scrolls down by 3000 from current point
    //  js.executeScript("window.scrollTo(0, document.body.scrollHeight);") -> Scrolls all the way down to the bottom of the page
    //  js.executeScript("arguments[0].scrollIntoView(true);", element)     -> Scrolls down until the element comes into the view
    //  js.executeScript("arguments[0].click();", element)                  -> Clicks on the element

    // 1. Regular Selenium click
    // 2. Actions click
    // 3. JavaScriptExecutor click


    @Test
    public void ScrollToTest() {
        driver.get("https://p-del.co/");

        MyMethods.myWait(3);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 2000)"); // current position is 0,2000

        MyMethods.myWait(3);

        js.executeScript("window.scrollTo(0, 5000)"); // current position is 0,5000

        MyMethods.myWait(3);

        js.executeScript("window.scrollTo(0, 3000)"); // current position is 0,3000


        waitAndQuit();


    }

    @Test
    public void ScrollByTest() {
        driver.get("https://p-del.co/");

        MyMethods.myWait(3);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 2000)"); // current position is 0,2000

        MyMethods.myWait(3);

        js.executeScript("window.scrollBy(0, 5000)"); // current position is 0,7000

        MyMethods.myWait(3);

        js.executeScript("window.scrollBy(0, -3000)"); // current position is 0,4000


        waitAndQuit();


    }

    @Test
    public void ScrollHeight() {
        driver.get("https://p-del.co/");

        MyMethods.myWait(3);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)"); // Current position is bottom of the page

        MyMethods.myWait(3);

        js.executeScript("window.scrollTo(0, 0)");

        waitAndQuit();


    }

    @Test
    public void ScrollToView() {
        driver.get("https://www.copado.com/robotic-testing");

        WebElement storyElement = driver.findElement(By.xpath("(//a[text()='Read Story'])[1]"));

        MyMethods.myWait(3);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", storyElement);

        waitAndQuit();


    }
}