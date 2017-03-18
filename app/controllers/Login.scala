package controllers
import javax.inject._
import play.api._
import play.api.mvc._

@Singleton
class Login @Inject() extends Controller{

  def processForm = Action {
    Ok(views.html.profile())
  }

}
