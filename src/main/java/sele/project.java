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
        //进入好看视频页面，并且输入搞笑关键词并且搜索
        WebDriver driver = new ChromeDriver();
        driver.get("https://haokan.baidu.com/?fr=pc_pz");
        WebElement CK = driver.findElement(By.xpath("//input[@id='search_input']"));
        WebElement bottom = driver.findElement(By.xpath("//div[@class='search-btn float-right']"));
        Thread.sleep(1000);
        CK.sendKeys("搞笑");
        bottom.click();
        //进入搞笑界面之后，用数组href抓取每一个视频的链接。
        String[] href=new String[100];
        driver.get(driver.getCurrentUrl());
        for(int i=1;i<10;i++)
        {
        Thread.sleep(1000);
        String Q="//main[@class='layout-content ant-layout-content']//a["+i+"]";
        WebElement address = driver.findElement(By.xpath(Q));
        href[i]=address.getAttribute("href");
        System.out.println(address.getAttribute("href"));
    }
      //以此进入页面，抓取视频
        driver.get(href[1]);
        Thread.sleep(2000);
        WebElement sp = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/video[1]"));
        System.out.println(sp.getAttribute("src"));




    }
}
