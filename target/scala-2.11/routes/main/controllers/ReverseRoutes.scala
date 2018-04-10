
// @GENERATOR:play-routes-compiler
// @SOURCE:E:/GD/html templates/Patrick Mulwa Muthama Technical Interview/2/Restemployee/conf/routes
// @DATE:Mon Apr 03 13:14:27 EAT 2017

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseEmployeeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def create(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "employees")
    }
  
    // @LINE:10
    def get(id:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "employees/" + implicitly[PathBindable[Integer]].unbind("id", id))
    }
  
    // @LINE:9
    def list(page:Integer = 1, size:Integer = 3): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "employees" + queryString(List(if(page == 1) None else Some(implicitly[QueryStringBindable[Integer]].unbind("page", page)), if(size == 3) None else Some(implicitly[QueryStringBindable[Integer]].unbind("size", size)))))
    }
  
    // @LINE:14
    def delete(id:Integer): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "employees/" + implicitly[PathBindable[Integer]].unbind("id", id))
    }
  
    // @LINE:12
    def update(): Call = {
    
      () match {
      
        // @LINE:12
        case ()  =>
          import ReverseRouteContext.empty
          Call("PUT", _prefix + { _defaultPrefix } + "employees")
      
      }
    
    }
  
    // @LINE:6
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
  }

  // @LINE:17
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }


}