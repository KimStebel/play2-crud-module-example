package controllers

import controllers.crudModule._
import play.api._
import play.api.mvc._

object Crud extends CrudMain(PersonController) {
  
}