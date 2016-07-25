package org.flightdelay.predict.main

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import scala.io.Source

object Prediction {
  
    def main(args: Array[String]){
      
      val sc = new SparkContext(new SparkConf().setAppName("Flight prediction linear regression SGD").setMaster("local"))
      val dataAsArray = Source.fromFile("/data/FlightDelays.txt").getLines().toArray
      
      
      
    }
}