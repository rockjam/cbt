import cbt._
class Build(val context: Context) extends BuildBuild{

  override def dependencies =
    super.dependencies :+
      BuildDependency(new File(context.cbtHome + "/plugins/scalajs"))
}
