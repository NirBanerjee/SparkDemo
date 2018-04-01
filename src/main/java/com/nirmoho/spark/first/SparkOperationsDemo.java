package com.nirmoho.spark.first;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.spark.api.java.JavaSparkContext;

public class SparkOperationsDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Logger.getLogger("org").setLevel(Level.ERROR);
        Logger.getLogger("akka").setLevel(Level.ERROR);
        JavaSparkContext spContext = SparkConnection.getContext();
        

    }

}
