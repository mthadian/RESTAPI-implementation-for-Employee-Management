
// @GENERATOR:play-routes-compiler
// @SOURCE:E:/GD/html templates/Patrick Mulwa Muthama Technical Interview/2/Restemployee/conf/routes
// @DATE:Mon Apr 03 13:14:27 EAT 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  EmployeeController_1: controllers.EmployeeController,
  // @LINE:17
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    EmployeeController_1: controllers.EmployeeController,
    // @LINE:17
    Assets_0: controllers.Assets
  ) = this(errorHandler, EmployeeController_1, Assets_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, EmployeeController_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.EmployeeController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employees""", """controllers.EmployeeController.list(page:Integer ?= 1, size:Integer ?= 3)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employees/$id<[0-9]+>""", """controllers.EmployeeController.get(id:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employees""", """controllers.EmployeeController.create()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employees""", """controllers.EmployeeController.update()"""),
    ("""PATCH""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employees""", """controllers.EmployeeController.update()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employees/$id<[0-9]+>""", """controllers.EmployeeController.delete(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_EmployeeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_EmployeeController_index0_invoker = createInvoker(
    EmployeeController_1.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeController",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_EmployeeController_list1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employees")))
  )
  private[this] lazy val controllers_EmployeeController_list1_invoker = createInvoker(
    EmployeeController_1.list(fakeValue[Integer], fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeController",
      "list",
      Seq(classOf[Integer], classOf[Integer]),
      "GET",
      """ Routes API Rest""",
      this.prefix + """employees"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_EmployeeController_get2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employees/"), DynamicPart("id", """[0-9]+""",false)))
  )
  private[this] lazy val controllers_EmployeeController_get2_invoker = createInvoker(
    EmployeeController_1.get(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeController",
      "get",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """employees/$id<[0-9]+>"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_EmployeeController_create3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employees")))
  )
  private[this] lazy val controllers_EmployeeController_create3_invoker = createInvoker(
    EmployeeController_1.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeController",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """employees"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_EmployeeController_update4_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employees")))
  )
  private[this] lazy val controllers_EmployeeController_update4_invoker = createInvoker(
    EmployeeController_1.update(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeController",
      "update",
      Nil,
      "PUT",
      """""",
      this.prefix + """employees"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_EmployeeController_update5_route = Route("PATCH",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employees")))
  )
  private[this] lazy val controllers_EmployeeController_update5_invoker = createInvoker(
    EmployeeController_1.update(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeController",
      "update",
      Nil,
      "PATCH",
      """""",
      this.prefix + """employees"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_EmployeeController_delete6_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employees/"), DynamicPart("id", """[0-9]+""",false)))
  )
  private[this] lazy val controllers_EmployeeController_delete6_invoker = createInvoker(
    EmployeeController_1.delete(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeController",
      "delete",
      Seq(classOf[Integer]),
      "DELETE",
      """""",
      this.prefix + """employees/$id<[0-9]+>"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_Assets_versioned7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned7_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_EmployeeController_index0_route(params) =>
      call { 
        controllers_EmployeeController_index0_invoker.call(EmployeeController_1.index())
      }
  
    // @LINE:9
    case controllers_EmployeeController_list1_route(params) =>
      call(params.fromQuery[Integer]("page", Some(1)), params.fromQuery[Integer]("size", Some(3))) { (page, size) =>
        controllers_EmployeeController_list1_invoker.call(EmployeeController_1.list(page, size))
      }
  
    // @LINE:10
    case controllers_EmployeeController_get2_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_EmployeeController_get2_invoker.call(EmployeeController_1.get(id))
      }
  
    // @LINE:11
    case controllers_EmployeeController_create3_route(params) =>
      call { 
        controllers_EmployeeController_create3_invoker.call(EmployeeController_1.create())
      }
  
    // @LINE:12
    case controllers_EmployeeController_update4_route(params) =>
      call { 
        controllers_EmployeeController_update4_invoker.call(EmployeeController_1.update())
      }
  
    // @LINE:13
    case controllers_EmployeeController_update5_route(params) =>
      call { 
        controllers_EmployeeController_update5_invoker.call(EmployeeController_1.update())
      }
  
    // @LINE:14
    case controllers_EmployeeController_delete6_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_EmployeeController_delete6_invoker.call(EmployeeController_1.delete(id))
      }
  
    // @LINE:17
    case controllers_Assets_versioned7_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned7_invoker.call(Assets_0.versioned(path, file))
      }
  }
}