package controllers

import controllers.crudModule._
import play.api._
import play.api.mvc._
import play.api.templates._

object Crud extends CrudMain(PersonController) {
  
}
import play.api.templates._

object PersonController extends CrudController[Person]()(new InMemoryDbManager[Person], PersonFormHandler) {
  override val name = "person"
}


case class Person(name:String, age:Int)

object PersonFormHandler extends FormHandler[Person] {
  
  import play.api.data._
  import play.api.data.Forms._

  val form = Form(
    mapping(
      "name" -> text,
      "age" -> number
    )
    (Person.apply)
    (Person.unapply)
  )
  val fields = form.mapping.key
  
  def createForm:Html = views.html.CreateForm(form)
  def updateForm(id:String, p:Person):Html = views.html.UpdateForm(form)
  
  
  def parseUpdate(request:Request[_]):Person = form.bindFromRequest()(request).get
  def parseCreate(request:Request[_]):Person = parseUpdate(request)
  
  def show(p:Person):Html = Html(p.toString)
  def showAll(l:List[Person]):Html = l.map(show).foldLeft(Html(""))((start, x) => start + x)
}