import com.typesafe.config.ConfigFactory

object Main extends App {
  val config = ConfigFactory.load()
  println(config)
  val appConfig = config.getConfig("user-application")

  val name = appConfig.getString("name")
  val host = appConfig.getString("host")
  val port = appConfig.getInt("port")

  assert(name == "App with resources")
  assert(host == "localhost")
  assert(port == 9000)

  System.err.println(s"name is: $name")
  System.err.println(s"host is: $host")
  System.err.println(s"port is: $port")
}
