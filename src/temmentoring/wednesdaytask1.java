package temmentoring;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


//1) Go to the amazon.com
//2) Locate the menus; Gift Card, Registry and Sell. (Use only CSS Selector)
//3) Get the text of these webelements
public class wednesdaytask1 extends BaseDriver {
    public static void main(String[] args) {

        driver.get("https://www.amazon.com/");



        WebElement giftCard = driver.findElement(By.cssSelector("a[data-csa-c-slot-id=\"nav_cs_14\"]"));
        System.out.println(giftCard.getText());
        giftCard.click();

        WebElement register = driver.findElement(By.cssSelector("a[href=\"/gp/browse.html?node=16115931011&ref_=nav_cs_registry\"]"));
        System.out.println(register.getText());
        register.click();


        MyMethods.myWait(1);
        driver.quit();




    }
}
