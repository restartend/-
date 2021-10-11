package s3;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
//https://www.bilibili.com/video/BV1Bb4y1a7M7?spm_id_from=444.41.0.0
//在这个项目里，我想先简单的获得视频的网址，因为我还没学完css;估计基本上都是照搬test_one的
//失败了，b站的视频使用的是动态，爬虫无法爬取，选用selenium进行新的尝试；
public class text3 {
    public static void main(String[] args) throws IOException {
       // System.out.println("请您输入你想爬取的网址");
        //Scanner in =new Scanner(System.in);
        //String http=in.next();
        String URL="https://www.bilibili.com/video/BV1Bb4y1a7M7?spm_id_from=444.41.0.0";
        Document doc = Jsoup.connect(URL).get();
        Element c = doc.getElementById("app");
        Elements d = c.getElementsByClass("info");
        System.out.println(c);
        System.out.println(d);
    }
}
