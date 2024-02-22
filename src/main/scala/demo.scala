import org.apache.spark.sql.SparkSession

object sparkDemo{
  def main(args: Array[String]): Unit ={
    var spark = SparkSession.builder()
      .master("local[1]")
      .appName("DemoEngineering")
      .getOrCreate()

    print(spark.sparkContext.appName)
  }

}