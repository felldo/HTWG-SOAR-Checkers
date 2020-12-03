package aview

import controller.Controller
import util.Observer

case class GUI(controller: Controller) extends UI with Observer {
  controller.add(this)

  def run(): Unit = {
  }

  override def update(): Unit = {
    println("GUI not implemented yet")
  }
}
