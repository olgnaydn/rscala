package org.ddahl.rscala

object Main extends App {

  ScalaServer(args(0), args(1) == "TRUE", args(2) == "TRUE").run()

}
