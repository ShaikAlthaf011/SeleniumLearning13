package CodingAssignment4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DestinationSearchTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://qadest.ccbp.tech");
        driver.manage().window().maximize();
        //TestCase:1
       List<WebElement> element=driver.findElements(By.xpath("//li[@class='destination-item']"));
       if(element.size()==12){
           System.out.println("Destination Count is Correct");
       }else{
           System.out.println("Destination Count is Incorrect");
       }
       //Testcase:2
        WebElement element1=driver.findElement(By.xpath("//input[@class='search-input']"));
       element1.sendKeys("io");
       List<WebElement>element2=driver.findElements(By.xpath("//li[@class='destination-item']"));
       if(element2.size()==4){
           System.out.println("Destinations count is correct");
       }else{
           System.out.println("Destinations count is Incorrect");

       }
        List<WebElement>element3=driver.findElements(By.xpath("//li[@class='destination-item']"));
        System.out.println(element3.size());
        for(int i=0;i<element3.size();i++){
            System.out.println(element3.get(i).getText());
        }
        element1.clear();
        //testcase3:
        WebElement el2=driver.findElement(By.xpath("//input[@class='search-input']"));
        el2.sendKeys("ion");
   List<WebElement> element8=driver.findElements(By.xpath("//li[@class='destination-item']"));

   if(element8.size()==3){
       System.out.println("Destination Count is Correct");
   }else{
       System.out.println("Destination count is Incorrect");
   }
   List<WebElement> element9=driver.findElements(By.xpath("//li[@class='destination-item']"));
    for(int i=0;i<element9.size();i++){
        System.out.println(element9.get(i).getText());
    }
      driver.quit();
       }

   }


