package controllers
import javax.inject._
import play.api._
import play.api.mvc._

@Singleton
class SignupController @Inject() extends Controller {

  def addUser = Action {
    Ok(views.html.profile())
  }

}
