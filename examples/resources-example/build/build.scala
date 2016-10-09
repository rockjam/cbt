import cbt._

class Build(val context: Context) extends BaseBuild with UberJar {

  override def projectName = "resources-example"

  override def dependencies = super.dependencies ++
    Resolver( mavenCentral ).bind(
      MavenDependency("com.typesafe", "config", "1.3.1")
    )

  def name: String = projectName
  def defaultVersion: String = "0.0.1"
  def groupId(): String = "com.github.rockjam"
}
