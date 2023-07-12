package temmentoring;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class wednesdaymentoring {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tesla.com/");
        driver.manage().window().maximize();
        //<a href="https://www.tesla.com/" class="kk99" id="uh7" name="bb95"> TESLA <a/>

        WebElement element = driver.findElement(By.cssSelector("a[id='uh7']"));
        WebElement element2 = driver.findElement(By.cssSelector("a[name='bb95']"));
        WebElement element3 = driver.findElement(By.cssSelector("a#uh7")); //id yerine # yazilabilir o zaman bu sekilde  yazmak yeterlidir





    }
}
