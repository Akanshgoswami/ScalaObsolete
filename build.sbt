name := "DBDA"

version := "0.1"

scalaVersion := "2.11.8"


libraryDependencies ++= Seq("org.apache.spark" %% "spark-sql" % "2.1.0",
 "org.apache.spark" %% "spark-core" % "2.1.0"
// "com.databricks" %% "spark-csv" % "0.1",
// "com.datastax.spark" %% "spark-cassandra-connector" % "2.0.6"
)

