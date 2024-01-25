package CodingAssignment4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.ArrayList;

public class SplicePlaygroundApplicationTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://qaspliceplygr.ccbp.tech/");
        driver.manage().window().maximize();
        WebElement element1=driver.findElement(By.xpath("//input[starts-with(@id,'startIndex')]"));
        element1.sendKeys("1");
        WebElement element2=driver.findElement(By.xpath("//input[starts-with(@id,'deleteCount')]"));
        element2.sendKeys("0");
        WebElement element3=driver.findElement(By.xpath("//input[starts-with(@id,'itemToAdd')]"));
        element3.sendKeys("Pen");
        WebElement element4=driver.findElement(By.xpath("//button[starts-with(@id,'spliceBtn')]"));
        element4.click();
        WebElement element=driver.findElement(By.xpath("//span[@id='updatedArray']"));
        System.out.println(element.getText());
        if(element.getText().equalsIgnoreCase("[1,\"Pen\",7,3,1,0,20,77]")){
            System.out.println("Updated Array:"+element.getText());
        }else{
            System.out.println("Array not updated as expected");
        }

    }
}

