
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main(message)/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""
    """),format.raw/*4.5*/("""<h1>"""),_display_(/*4.10*/message),format.raw/*4.17*/("""</h1>
    <hr>
    <p>This is a REST API for Employees</p>
    <p>Use the table below for your Rest Client</p>
    <table class="table table-bordered table-hover table-condensed">
        <tr>
            <th>Method</th>
            <th>URI</th>
            <th>Data</th>
            <th>HTTP Code</th>
            <th>Response (in JSON)</th>
        </tr>
        <tr>
            <td>GET</td>
            <td>/employees</td>
            <td></td>
            <td>200</td>
            <td>"""),format.raw/*21.17*/("""{"""),format.raw/*21.18*/(""""data":[],"total":0,"link-self":"/employees""""),format.raw/*21.62*/("""}"""),format.raw/*21.63*/("""</td>
        </tr>
        <tr>
            <td>GET</td>
            <td>/employees/1</td>
            <td></td>
            <td>200</td>
            <td>"""),format.raw/*28.17*/("""{"""),format.raw/*28.18*/(""""id": ,"name": " """"),format.raw/*28.36*/("""}"""),format.raw/*28.37*/("""</td>
        </tr>
        <tr>
            <td>GET</td>
            <td>/employees/id</td>
            <td></td>
            <td>404</td>
            <td>"""),format.raw/*35.17*/("""{"""),format.raw/*35.18*/(""""error":"Not found id""""),format.raw/*35.40*/("""}"""),format.raw/*35.41*/("""</td>
        </tr>
        <tr>
            <td>POST</td>
            <td>/employees</td>
            <td>"""),format.raw/*40.17*/("""{"""),format.raw/*40.18*/(""""name": "new user""""),format.raw/*40.36*/("""}"""),format.raw/*40.37*/("""</td>
            <td>201</td>
            <td>"""),format.raw/*42.17*/("""{"""),format.raw/*42.18*/(""""id": id,"name": "new user""""),format.raw/*42.45*/("""}"""),format.raw/*42.46*/("""</td>
        </tr>
        <tr>
            <td>POST</td>
            <td>/employees</td>
            <td></td>
            <td>400</td>
            <td>"""),format.raw/*49.17*/("""{"""),format.raw/*49.18*/(""""name": ["This field is required"]"""),format.raw/*49.52*/("""}"""),format.raw/*49.53*/("""</td>
        </tr>
        <tr>
            <td>PUT/PATCH</td>
            <td>/employees</td>
            <td>"""),format.raw/*54.17*/("""{"""),format.raw/*54.18*/(""""id": 1,"name": "new name""""),format.raw/*54.44*/("""}"""),format.raw/*54.45*/("""</td>
            <td>200</td>
            <td>"""),format.raw/*56.17*/("""{"""),format.raw/*56.18*/(""""id": 1,"name": "new name""""),format.raw/*56.44*/("""}"""),format.raw/*56.45*/("""</td>
        </tr>
        <tr>
            <td>PUT/PATCH</td>
            <td>/employees</td>
            <td></td>
            <td>400</td>
            <td>"""),format.raw/*63.17*/("""{"""),format.raw/*63.18*/(""""name": ["This field is required"]"""),format.raw/*63.52*/("""}"""),format.raw/*63.53*/("""</td>
        </tr>
        <tr>
            <td>DELETE</td>
            <td>/employees/1</td>
            <td></td>
            <td>200</td>
            <td>"""),format.raw/*70.17*/("""{"""),format.raw/*70.18*/(""""msg":"Deleted 1""""),format.raw/*70.35*/("""}"""),format.raw/*70.36*/("""</td>
        </tr>
        <tr>
            <td>DELETE</td>
            <td>/employees/0</td>
            <td></td>
            <td>404</td>
            <td>"""),format.raw/*77.17*/("""{"""),format.raw/*77.18*/(""""error":"Not found 0""""),format.raw/*77.39*/("""}"""),format.raw/*77.40*/("""</td>
        </tr>
    </table>
    <hr>
    
    <ul>
        <li><h4>Patrick Mulwa Muthama</h4></li>
        
    </ul>
""")))}),format.raw/*86.2*/("""
"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Mon Apr 03 13:14:29 EAT 2017
                  SOURCE: E:/GD/html templates/Patrick Mulwa Muthama Technical Interview/2/Restemployee/app/views/index.scala.html
                  HASH: 9cb610638dc90e338d877f9f5cb83683a7c5530f
                  MATRIX: 745->1|857->18|885->21|906->34|945->36|976->41|1007->46|1034->53|1552->543|1581->544|1653->588|1682->589|1865->744|1894->745|1940->763|1969->764|2153->920|2182->921|2232->943|2261->944|2396->1051|2425->1052|2471->1070|2500->1071|2575->1118|2604->1119|2659->1146|2688->1147|2870->1301|2899->1302|2961->1336|2990->1337|3130->1449|3159->1450|3213->1476|3242->1477|3317->1524|3346->1525|3400->1551|3429->1552|3616->1711|3645->1712|3707->1746|3736->1747|3922->1905|3951->1906|3996->1923|4025->1924|4211->2082|4240->2083|4289->2104|4318->2105|4472->2229
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|35->4|35->4|52->21|52->21|52->21|52->21|59->28|59->28|59->28|59->28|66->35|66->35|66->35|66->35|71->40|71->40|71->40|71->40|73->42|73->42|73->42|73->42|80->49|80->49|80->49|80->49|85->54|85->54|85->54|85->54|87->56|87->56|87->56|87->56|94->63|94->63|94->63|94->63|101->70|101->70|101->70|101->70|108->77|108->77|108->77|108->77|117->86
                  -- GENERATED --
              */
          