package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import play.api.db._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(db:Database, cc: ControllerComponents) extends AbstractController(cc) {

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
//  def index() = Action { implicit request: Request[AnyContent] =>
//    Ok(views.html.index())
//  }
//
//  def explore() = Action { implicit request: Request[AnyContent] =>
//    Ok(views.html.explore())
//  }
//
//  def tutorial() = Action { implicit request: Request[AnyContent] =>
//    Ok(views.html.tutorial())
//  }
  /** establishing the db connection in order to execute queries */
  val connection = db.getConnection()
  val statement = connection.createStatement
  val query = "SELECT * FROM group_44"
  val resultset = statement.executeQuery(query)

  var i = 0
  var indexNoArray = new Array[Int](5)
  var nameArray = new Array[String](5)
  var townArray = new Array[String](5)

  while(resultset.next()){
    indexNoArray(i) = resultset.getInt("Index Number")
    nameArray(i) = resultset.getString("Name")
    townArray(i) = resultset.getString("Home_Town")
    i = i + 1
  }

  /**This is a main home function that passes the data associated within the arrays to the home.scala.html*/
  def home = Action {
    Ok(views.html.home(
      indexNoArray(0), indexNoArray(1), indexNoArray(2), indexNoArray(3),
      nameArray(0), nameArray(1), nameArray(2), nameArray(3),
      townArray(0), townArray(1), townArray(2), townArray(3)
    ))
  }
  
}
