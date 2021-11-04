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
public class project {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.get("https://haokan.baidu.com/?fr=pc_pz");
        //WebElement kk = driver.findElement(By.className("search-wrap float-left"));
        WebElement CK = driver.findElement(By.xpath("//input[@id='search_input']"));
        WebElement bottom = driver.findElement(By.xpath("//div[@class='search-btn float-right']"));
        Thread.sleep(1000);
        CK.sendKeys("起飞");
        bottom.click();
        Thread.sleep(1000);
        System.out.println(driver.getCurrentUrl());
        //int mark[10];
        /*for(int time=0;time<=7;time++)
        {
            WebElement address = adTWO.findElement(By.xpath("//main[@class='layout-content ant-layout-content']//a[1]"));
            System.out.println(address.getClass());
        }*/
    }
}
