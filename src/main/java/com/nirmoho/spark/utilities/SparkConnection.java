/**
 * 
 */
package com.nirmoho.spark.utilities;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;

/**
 * @author nirmoho-Mac
 *
 */
public class SparkConnection {
    
    //Set string for app name
    private static String appName = "zeppelin-app";
    
    //Pointer embedded URL 
    private static String sparkMaster = "local[2]";
    
    //Variable to define sparkcontext
    private static JavaSparkContext spContext = null;
    //Variable to hold sparksession
    //private static SparkSession sparkSession = null;
    //private static String tempDir = "/Users/nirmoho-Mac/eclipse-workspace/spark-project/tmp";
    
    private static void getConnection()  {
        
        if(spContext == null)   {
            SparkConf conf = new SparkConf().setAppName(appName).setMaster(sparkMaster);
            spContext = new JavaSparkContext(conf);
            //sparkSession = SparkSession.builder().appName(appName).master(sparkMaster).config("spark.sql.warehouse.dir", tempDir).getOrCreate();        
        }
        
        
    }
    public static JavaSparkContext getContext() {
        
        if(spContext == null)   {
            getConnection();
        }
        return spContext;
    }

}
