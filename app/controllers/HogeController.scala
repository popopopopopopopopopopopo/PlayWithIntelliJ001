package controllers

import javax.inject._
import play.api.mvc._

@Singleton
class HogeController @Inject()(cc: ControllerComponents)
  extends AbstractController(cc) {

  def moge = Action {
    Ok(views.html.moge("hoge", "moge"))
  }
}
