package fr.hervedarritchon.scala.kata.primefactors

/**
 * Created by Hervé Darritchon on 08/06/15.
 *
 */
object PrimeFactors {

  def iter(i: Int, index: Int, acc: List[Int]): List[Int] = {
    index <= i match {
      case false => acc
      case true => (i % index) == 0 match {
        case true => iter (i/index,index,index :: acc)
        case false => iter (i,index+1,acc)
      }
    }
  }

  def getList(i: Int): List[Int] = {
    iter(i, 2, List())
  }

}
