/**
 * 
 */
package com.nirmoho.spark.utilities;

import org.apache.spark.api.java.JavaRDD;

/**
 * @author nirmoho-Mac
 *
 */
public class ExerciseUtils {
    
    public static void printStringRDD(JavaRDD<String> stringRDD, int count) {
        
        for ( String s : stringRDD.take(count)) {
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println(s);
        }
        
    }

}
