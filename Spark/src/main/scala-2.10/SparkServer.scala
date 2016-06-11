import java.io.File

import spark.{Request, Response, Route}
import spark.Spark._

object SparkServer{

  def main(args: Array[String]) {
    port(8080)

    val path = new File("").getAbsolutePath

    println(path)

    staticFiles.location("main/resources/public")

    get("hello", new Route {
      def handle(request: Request, response: Response): AnyRef = {
        "Hello!"
      }
    })

    redirect.get("/","hello")

  }

}
