package com.nirmoho.spark.first;

import com.nirmoho.spark.utilities.*;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

public class SparkOperationsDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Logger.getLogger("org").setLevel(Level.ERROR);
        Logger.getLogger("akka").setLevel(Level.ERROR);
        JavaSparkContext spContext = SparkConnection.getContext();
        
        //Loading and Storing Data in RDD
        
        //Getting Data from a collection.
        JavaRDD<Integer> collectionData = DataResource.getCollectionData();
        System.out.println("Total Records = " + collectionData.count());
        
        //Getting Data from a File.
        JavaRDD<String> fileData = spContext.textFile("data/auto-data.csv");
        System.out.println("Total Records = " + fileData.count());
        ExerciseUtils.printStringRDD(fileData, 20);
        

    }

}
