package sele;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import javax.swing.*;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.lang.String;
public class text1 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver a=new ChromeDriver();
        a.get("https://www.baidu.com");

        System.out.println("Search before================");

        //获取当前的 title 和 url
        System.out.printf("title of current page is %s\n", a.getTitle());
        System.out.printf("url of current page is %s\n", a.getCurrentUrl());

        //百度搜索
        WebElement search = a.findElement(By.id("kw"));
        search.sendKeys("300英雄");
        search.sendKeys(Keys.ENTER);
        Thread.sleep(2000);

        System.out.println("Search after================");

        //获取当前的 title 和 url
        System.out.printf("title of current page is %s\n", a.getTitle());
        System.out.printf("url of current page is %s\n", a.getCurrentUrl());

        //获取第一条搜索结果的标题
        WebElement result = a.findElement(By.xpath("//div[@id='content_left']/div/div"));
        System.out.println(result.getText());


    }
}