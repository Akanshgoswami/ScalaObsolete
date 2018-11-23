package com.app.dbda
import org.apache.spark.sql.SparkSession





object Collection  {
  def main(args: Array[String]): Unit = {

    val sc= new SparkUtility
    var spark:SparkSession=sc.getSparkContext()
/*    var df = spark.read.option("multiline", "true")
      .json("/home/hduser/DATA/DATASET/iris.json" )*/
    //df.show(false)

var df = spark.read.format("csv")
    .option("header","true")
    .option("inferschema","true")
    .csv("file:////home/hduser/DATA/DATASET/DataSet/SFFoods/businesses_plus.csv")
  .rdd
// To show the Schema of a file.
// df.printSchema()
// df.show(10,true)
//df.take(5).foreach(println)
//    var comp= new ComputationClass

//      df.filter(r=> comp.CountOfCities(df)).foreach(println)
//df.map(row=>(row.getString(3),row.getString(0),row.schema))
//  ************************************Spark Core Transformation Functions*************************************************
//    Map
//
    val first= df.map(r=> r.getString(1))
//    first.filter(_!=null).map(_.length).filter(_>=12).collect().take(6).foreach(println)
//    first.filter(_!=null).map(_.length).filter(row=>((row>12)&&(row<19))).collect().take(6).foreach(println)
//    first.filter(_!=null).map(_.length).filter(_>=12).collect().take(6).foreach(println)
//    first.filter(_!=null).mapPartitions(l=>l.filter(row=>row.length>12)).collect().take(6).foreach(println)


//    val A= spark.sparkContext.parallelize(List("dog", "salmon", "salmon", "rat", "elephant"),3)
//    val B= A.map(_.concat("ConCatination"))
//    val C= A.map(_.length)
//    A.zip(C).map(l=>l.swap).filter(l=>(l._1>3)).collect().foreach(println)
//
    val seq:Seq[String]=Seq("dog", "salmon", "salmon", "rat")
//    spark.sparkContext.parallelize(seq,2).countByValue().foreach(println)
//    spark.sparkContext.parallelize(seq,2).countByValue().map(l=>l._1).foreach(println)
//    spark.sparkContext.parallelize(seq,2).countByValue().map(l=>l._2).foreach(println)
//    spark.sparkContext.parallelize(seq,2).flatMap(l=>l.substring(3)).take(10).foreach(println)
//    spark.sparkContext.parallelize(seq,3).mapPartitions(l=>l.map(l=>l.length)).foreach(println)
//    spark.sparkContext.parallelize(seq,3).mapPartitions(l=>l.filter(r=>r.length>4)).foreach(println)
//    spark.sparkContext.parallelize(seq,3).mapPartitions(l=>l.filter(r=>r.length>4)).foreach(println)

//    var ll=spark.sparkContext.parallelize(seq,3).mapPartitionsWithIndex((r,l)=>{
//      (println("Index of the partation"+r))
////      val Ite:List[String]= Ite.toList
////      Ite.filter(row=>row.length>4)
//      l.map(_.length).filter(_>=3)
//    })
//      .foreach(println)


  }


}
