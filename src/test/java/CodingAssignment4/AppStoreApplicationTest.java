package CodingAssignment4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AppStoreApplicationTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qaappstore.ccbp.tech");
        driver.manage().window().maximize();
        //Appcount Each Tab
        //TestCase:1
        WebElement el1 = driver.findElement(By.xpath("//button[contains(text(),'Social')]"));
        el1.click();
        List<WebElement> list = driver.findElements(By.xpath("//li[@class='app-item']"));
        if (list.size() == 10) {
            System.out.println("Social apps count is correct");
        } else {
            System.out.println("Social apps count is Incorrect");
        }
        //TestCase:2
        WebElement el2= driver.findElement(By.xpath("//button[contains(text(),'Games')]"));
        el2.click();
        List<WebElement>list1=driver.findElements(By.xpath("//li[@class='app-item']"));
        if(list1.size()==10){
            System.out.println("Gaming apps count is correct");
        }else{
            System.out.println("Gaming apps count is Incorrect");
        }
        //TestCase:3
        WebElement el3= driver.findElement(By.xpath("//button[contains(text(),'News')]"));
        el3.click();
        List<WebElement>list2=driver.findElements(By.xpath("//li[@class='app-item']"));
        if(list2.size()==10){
            System.out.println("News apps count is correct");
        }else{
            System.out.println("News apps count is incorrect");
        }
        //Testcase:4
        WebElement el4=driver.findElement(By.xpath("//button[contains(text(),'Food')]"));
        el4.click();
        List<WebElement>list3=driver.findElements(By.xpath("//li[@class='app-item']"));
        if(list3.size()==10){
            System.out.println("Food apps count is correct");
        }else{
            System.out.println("Food apps count is incorrect");
        }
        //Test functionality :2
        WebElement el5=driver.findElement(By.xpath("//button[contains(text(),'News')]"));
        el5.click();
        WebElement el6=driver.findElement(By.xpath("//input[@class='search-input']"));
        el6.sendKeys("News");
        List<WebElement>list4=driver.findElements(By.xpath("//li[@class='app-item']"));
        if(list4.size()==7){
            System.out.println("News apps count is correct");
        }else{
            System.out.println("News apps count is incorrect");
        }
    List<WebElement> list5=driver.findElements(By.xpath("//li[@class='app-item']"));
        for(int i=0;i<=list5.size();i++){
            System.out.println(list5.get(i).getText());
        }
        driver.quit();
        }
    }
