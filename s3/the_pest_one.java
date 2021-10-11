package s3;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class the_pest_one {
    public static void main(String[] args) throws IOException {
        System.out.println("请您输入你想爬取的网址");
        Scanner in =new Scanner(System.in);
        String http=in.next();
        Document doc = Jsoup.connect(http).get();
        String title = doc.title();
        Element c = doc.getElementById("container");
       Elements d = doc.getElementsByTag("img");
       System.out.println(d);
       int id=0;
        for (Element k : d) {
            String q=k.attr("src");
            System.out.println(q);
            char fir = q.charAt(0);
           if(fir!='h' ) {
               q = "https:" + k.attr("src");
           }
            System.out.println(q);
            URL url= new URL(q);
            id++;
            URLConnection urlConnection= url.openConnection();
            InputStream o=urlConnection.getInputStream();
            OutputStream p=new FileOutputStream("G:\\sad\\e\\"+id+".jpg");
            int temp=0;
            while ((temp=o.read())!=-1){
                p.write(temp);
            }
            p.close();
            o.close();
        }

    }
}
