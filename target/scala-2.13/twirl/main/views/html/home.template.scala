
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

object home extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template12[Int,Int,Int,Int,String,String,String,String,String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(NO1:Int, NO2:Int, NO3:Int, NO4:Int, name1:String, name2:String, name3:String, name4:String, town1:String, town2:String, town3:String, town4:String ):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""

"""),format.raw/*4.1*/("""<html>
    <head>
        <title>Home</title>
    </head>
    <Body>
        <table border = "2">
            <tr>
                <th>Index Number</th>
                <th>Name</th>
		        <th>Home_Town</th>
            </tr>
            <tr>
                <td>"""),_display_(/*16.22*/NO1),format.raw/*16.25*/("""</td>
                <td>"""),_display_(/*17.22*/name1),format.raw/*17.27*/("""</td>
		        <td>"""),_display_(/*18.16*/town1),format.raw/*18.21*/("""</td>
            </tr>
            <tr>
                <td>"""),_display_(/*21.22*/NO2),format.raw/*21.25*/("""</td>
                <td>"""),_display_(/*22.22*/name2),format.raw/*22.27*/("""</td>
                <td>"""),_display_(/*23.22*/town2),format.raw/*23.27*/("""</td>
            </tr>
            <tr>
                <td>"""),_display_(/*26.22*/NO3),format.raw/*26.25*/("""</td>
                <td>"""),_display_(/*27.22*/name3),format.raw/*27.27*/("""</td>
                <td>"""),_display_(/*28.22*/town3),format.raw/*28.27*/("""</td>
            </tr>
            <tr>
                <td>"""),_display_(/*31.22*/NO4),format.raw/*31.25*/("""</td>
                <td>"""),_display_(/*32.22*/name4),format.raw/*32.27*/("""</td>
                <td>"""),_display_(/*33.22*/town4),format.raw/*33.27*/("""</td>
            </tr>
        </table>
    </Body>
</html>
"""))
      }
    }
  }

  def render(NO1:Int,NO2:Int,NO3:Int,NO4:Int,name1:String,name2:String,name3:String,name4:String,town1:String,town2:String,town3:String,town4:String): play.twirl.api.HtmlFormat.Appendable = apply(NO1,NO2,NO3,NO4,name1,name2,name3,name4,town1,town2,town3,town4)

  def f:((Int,Int,Int,Int,String,String,String,String,String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (NO1,NO2,NO3,NO4,name1,name2,name3,name4,town1,town2,town3,town4) => apply(NO1,NO2,NO3,NO4,name1,name2,name3,name4,town1,town2,town3,town4)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/home.scala.html
                  HASH: 7e743ef5e25cf479bd64c04c5439daadc12193cb
                  MATRIX: 794->1|1037->151|1065->153|1360->421|1384->424|1438->451|1464->456|1512->477|1538->482|1627->544|1651->547|1705->574|1731->579|1785->606|1811->611|1900->673|1924->676|1978->703|2004->708|2058->735|2084->740|2173->802|2197->805|2251->832|2277->837|2331->864|2357->869
                  LINES: 21->1|26->2|28->4|40->16|40->16|41->17|41->17|42->18|42->18|45->21|45->21|46->22|46->22|47->23|47->23|50->26|50->26|51->27|51->27|52->28|52->28|55->31|55->31|56->32|56->32|57->33|57->33
                  -- GENERATED --
              */
          