package com.app.dbda
import org.apache.spark.sql.SparkSession

class SparkUtility {


  def getSparkContext(): SparkSession =
  {
    val spark = SparkSession.builder.master("local[1]").appName("sparkRdd")
//      .config("spark.cassandra.connection.host",cassHostName)
      //.config("spark.closure.serializer","org.apache.spark.serializer.JavaSerializer")
      .config("spark.rdd.compress", "true")
      .config("spark.io.compression.codec", "snappy")
      .config("executor-memory",1)
      .config("spark.submit.deployMode","client")/////////
      .config("executor-cores", 1)
      //.config("spark.driver.memory", "0g")
      .config("num-executors",1)
      .getOrCreate()
    return spark;
  }



}
