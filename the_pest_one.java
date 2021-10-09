package s3;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class the_pest_one {
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://tieba.baidu.com/p/7568202897").get();
        String title = doc.title();
        Element c = doc.getElementById("container");
       Elements d = doc.getElementsByTag("img");
       System.out.println(d);
       int id=0;
        for (Element k : d) {
            String q=k.attr("src");
            char fir = q.charAt(0);
            if(fir!='h' )
            {
                q="https:"+k.attr("src");
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
