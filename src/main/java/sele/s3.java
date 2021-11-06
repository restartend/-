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
public class s3 {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.get("https://haokan.baidu.com/web/search/page?query=%E8%B5%B7%E9%A3%9E");
        System.out.println("以下是文本");
        Thread.sleep(1000);
        WebElement A=driver.findElement(By.xpath("//main[@class='layout-content ant-layout-content']//a[1]"));
        System.out.println(A.getAttribute("outerHTML"));
        System.out.println("以上是文本");
    }
}
