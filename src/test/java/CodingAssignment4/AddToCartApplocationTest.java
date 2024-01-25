package CodingAssignment4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class AddToCartApplocationTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://qacartpage.ccbp.tech/");
        driver.manage().window().maximize();
        WebElement element1=driver.findElement(By.xpath("//input[@id='cartItemTextInput']"));
        element1.sendKeys("Pencil");
        WebElement element2=driver.findElement(By.xpath("//button[contains(text(),'Add')]"));
        element2.click();
        WebElement element3=driver.findElement(By.xpath("//input[@id='cartItemTextInput']"));
        element3.sendKeys("Mobile");
        WebElement element4=driver.findElement(By.xpath("//button[contains(text(),'Add')]"));
        element4.click();
        WebElement element5=driver.findElement(By.xpath("//input[@id='cartItemTextInput']"));
        element5.sendKeys("Shoes");
        WebElement element6=driver.findElement(By.xpath("//button[contains(text(),'Add')]"));
        element6.click();
        List<WebElement> elementList=driver.findElements(By.xpath("//li[starts-with(@id,'cart')]"));
        if(elementList.size()==3){
            System.out.println("Cart items count is correct");
        }else{
            System.out.println("Cart items count is not correct");
        }
        List<WebElement> elist= driver.findElements(By.xpath("//li[contains(@id,'cart-item')]"));
        ArrayList<String> al= new ArrayList();
        al.add("Pencil");
        al.add("Mobile");
        al.add("Shoes");
        System.out.println(al);
        for( int i=0;i<al.size();i++){
            if(elist.get(i).getText().equalsIgnoreCase(al.get(i))){
                System.out.println("order is matched"+al.get(i));
            }else{
                System.out.println(" order is not matched");
            }
        }

    }
}
