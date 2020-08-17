// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/ryoko/app/play-samples-play-scala-hello-world-tutorial 2/conf/routes
// @DATE:Mon Aug 17 17:03:47 JST 2020


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
