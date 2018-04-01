/**
 * 
 */
package com.nirmoho.spark.utilities;

import java.util.Arrays;
import java.util.List;

import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

/**
 * @author nirmoho-Mac
 *
 */
public class DataResource {
    
    public static JavaRDD<Integer> getCollectionData()  {
        JavaSparkContext spContext = SparkConnection.getContext();
        List<Integer> data = Arrays.asList(10, 20, 15, 5, 35, 80, 65);
        JavaRDD<Integer> collectionData = spContext.parallelize(data);
        collectionData.cache();
        return collectionData;
    }

}
