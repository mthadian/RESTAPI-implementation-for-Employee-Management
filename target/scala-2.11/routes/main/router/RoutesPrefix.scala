
// @GENERATOR:play-routes-compiler
// @SOURCE:E:/GD/html templates/Patrick Mulwa Muthama Technical Interview/2/Restemployee/conf/routes
// @DATE:Mon Apr 03 13:14:27 EAT 2017


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
