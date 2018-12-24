package app;



import netscape.javascript.JSObject;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 * Created by FOX_duo on 2017/9/5.
 */

@SpringBootApplication
public class TestMain {

    private  static String url="111";
    private  static String name="111";
    private  static String password="111";
    public static void main(String[] args)

    {
        JSONObject json1= new JSONObject();
        json1.put("type","4");
        json1.put("folder","000");


        JSONObject json2= new JSONObject();
        json2.put("type","5");
        json2.put("folder","666");
        JSONArray jsonArray=new JSONArray();

        jsonArray.put(json1);
        jsonArray.put(json2);



        System.out.println(jsonArray);




    }
}
