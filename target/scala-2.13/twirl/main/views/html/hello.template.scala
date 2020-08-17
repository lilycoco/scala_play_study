
package views.html

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
import play.api.mvc._
import play.api.data._

object hello extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Hello")/*1.15*/ {_display_(Seq[Any](format.raw/*1.17*/("""
  """),format.raw/*2.3*/("""<section id="content">
    <div class="wrapper doc">
      <article>
        <h1>Hello World</h1>
      </article>  
      <aside>
        """),_display_(/*8.10*/commonSidebar()),format.raw/*8.25*/("""
      """),format.raw/*9.7*/("""</aside>
    </div>
  </section>
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-08-17T17:03:47.810642
                  SOURCE: /Users/ryoko/app/play-samples-play-scala-hello-world-tutorial 2/app/views/hello.scala.html
                  HASH: 9d1e34273f58948b95fdabcc34c720b14238f369
                  MATRIX: 811->1|832->14|871->16|900->19|1066->159|1101->174|1134->181
                  LINES: 26->1|26->1|26->1|27->2|33->8|33->8|34->9
                  -- GENERATED --
              */
          