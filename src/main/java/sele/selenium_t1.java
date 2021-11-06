package sele;
//借用了一下别人的代码，测试一下selenium是不是安装成功，此外，chromedriver的版本要对应chrome的内核版本，不然就会出错；
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_t1 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.itest.info");

        String title = driver.getTitle();
        System.out.printf(title);

        driver.close();
    }
}