package fr.hervedarritchon.scala.kata

import com.typesafe.scalalogging.LazyLogging

/**
 * Created by Hervé Darritchon on 25/05/15.
 *
 */
class Example extends LazyLogging{

  def main(args: Array[String]): Unit = {
    logger.debug("Main start.")
    println("Hello, world!")
    logger.debug("Main stop.")
  }
}