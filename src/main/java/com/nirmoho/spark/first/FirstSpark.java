/**
 * 
 */
package com.nirmoho.spark.first;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;


/**
 * @author nirmoho-Mac
 *
 */
public class FirstSpark {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String appName = "zeppelin-app";
        String sparkMaster = "local[2]";
        
        JavaSparkContext spContext = null;
     
        SparkConf conf = new SparkConf().setAppName(appName).setMaster(sparkMaster);
        
        spContext = new JavaSparkContext(conf);
        JavaRDD<String> tweetsRDD = spContext.textFile("data/movietweets.csv");
        
        
        
        //Print few Lines
        for(String str : tweetsRDD.take(5)) {
            System.out.println(str);
        }
        
        //Print count
        System.out.println("Total Tweets in File = " + tweetsRDD.count());
        
        //Convert to upperCase
        JavaRDD<String> ucRDD = tweetsRDD.map(str -> str.toUpperCase());
        
        //Print lines again
        for(String str : ucRDD.take(5)) {
            System.out.println(str);
        }
        
        spContext.close();
        
        while(true) {
            try {
                Thread.sleep(10000);
            }   catch (InterruptedException e)  {
                e.printStackTrace();
            }
        }
        
        

    }

}
