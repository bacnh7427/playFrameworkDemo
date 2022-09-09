
package views.html.Home

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._
import scala.jdk.CollectionConverters._

object welcome extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(name: String, last_name: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.35*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Home - Welcome Page</title>
</head>
<body>
 <h1>Welcome """),_display_(/*10.15*/name),format.raw/*10.19*/(""" """),_display_(/*10.21*/last_name),format.raw/*10.30*/(""" """),format.raw/*10.31*/("""to our Website</h1>
</body>
</html>"""))
      }
    }
  }

  def render(name:String,last_name:String): play.twirl.api.HtmlFormat.Appendable = apply(name,last_name)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (name,last_name) => apply(name,last_name)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/Home/welcome.scala.html
                  HASH: e95fb1c2eb58491c2f226f131d62e4bfb28b2577
                  MATRIX: 921->1|1049->34|1079->38|1248->180|1273->184|1302->186|1332->195|1361->196
                  LINES: 27->1|32->1|34->3|41->10|41->10|41->10|41->10|41->10
                  -- GENERATED --
              */
          