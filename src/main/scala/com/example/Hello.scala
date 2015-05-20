package com.example

import com.typesafe.scalalogging._

object Hello extends LazyLogging{


  def main(args: Array[String]): Unit = {
    logger.debug("Main start.")
    println("Hello, world!")
    logger.debug("Main stop.")
  }
}
