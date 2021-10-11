package s3;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
import org.jsoup.nodes.Element;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
//这个java文件，我尝试了一下获得文本文件。
public class test_two {
    public static void main(String[] args) throws IOException {
        System.out.println("请您输入你想爬取的网址");
        Scanner in = new Scanner(System.in);
        String http = in.next();
        Document doc = Jsoup.connect(http).get();
        int bq=0;
        Elements q = doc.getElementsByTag("p");
        System.out.println(q);
        File f=new File("G:\\sad\\e\\bq.txt");
       FileWriter FW=new FileWriter(f);

        for (Element K:q) {
         ;
            String i = K.text();
            FW.write(i);

        }FW.close();
        //for (Element K : q) {

           // bq++;
          //  InputStream o =K;
           // OutputStream p = new FileOutputStream("G:\\sad\\e\\" + bq + ".txt");
          ////  int temp = 0;
          //  while ((temp = o.read()) != -1) {
             //   p.write(temp);
           // }
           // p.close();
          //  o.close();
       // }
    }
}