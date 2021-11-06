package sele;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import javax.swing.*;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.lang.String;
public class selenium_t2 {
    public static void main(String[] args)throws Exception{
        selenium_t2 test=new selenium_t2();
        Scanner in=new Scanner(System.in);
        int b=in.nextInt();
        //test.get();
        /*while(b==1)
        {
            test.click();
           int c=in.nextInt();
            if(c==2){
               test.actiono();
            }
            b=in.nextInt();
            c=in.nextInt();
        }*/


    }
   public void click(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.baidu.com");
        WebElement CK= driver.findElement(By.id("kw"));
        WebElement bottom= driver.findElement(By.id("su"));
        CK.sendKeys("起飞");
        bottom.click();



    }
   /* public void actiono(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.baidu.com");
        WebElement CK= driver.findElement(By.id("kw"));
        WebElement bottom= driver.findElement(By.id("su"));
        CK.sendKeys("起飞");
        bottom.click();
        WebElement search_setting = driver.findElement(By.linkText("设置"));
        Actions action=new Actions(driver);
        action.clickAndHold(search_setting).perform();
    }*/
   /* public void get()throws Exception{
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.baidu.com/s?ie=UTF-8&wd=%E4%B8%89%E7%99%BE%E8%8B%B1%E9%9B%84");
        WebElement CK= driver.findElement(By.xpath("//*[@id='wrapper']/div/div/div/div/div/div/div[@class='c-abstract']"));
        WebElement bottom= driver.findElement(By.id("su"));
        CK.sendKeys("起飞");
        //bottom.click();
        Thread.sleep(2000);
            WebElement result = driver.findElement(By.className("c-border"));
        System.out.println(result.getTagName());
            //div嵌套div似乎是不可爬取的


    }*/
}
