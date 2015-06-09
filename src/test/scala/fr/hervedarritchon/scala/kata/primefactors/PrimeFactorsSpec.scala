package fr.hervedarritchon.scala.kata.primefactors

import org.scalatest.{GivenWhenThen, FeatureSpec, Matchers}

/**
 * Created by Hervé Darritchon on 08/06/15.
 *
 */
class PrimeFactorsSpec extends FeatureSpec with GivenWhenThen with Matchers {

  feature("A user can get the list of prime factors from any number greater than 0") {
    scenario("Prime factors is list() for number equal 1") {
      Given("The user want to get the prime factors")
      When("He enters 1 as number")
      val pfList : List[Int] = PrimeFactors.getList(1)
      Then("The list of prime factors should be List()")
      pfList should be (List[Int]())
    }

    scenario("Prime factors is list(1) for number equal 2") {
      Given("The user want to get the prime factors")
      When("He enters 2 as number")
      val pfList : List[Int] = PrimeFactors.getList(2)
      Then("The list of prime factors should be List(2)")
      pfList should be (List[Int](2))
    }

    scenario("Prime factors is list(2) for number equal 3") {
      Given("The user want to get the prime factors")
      When("He enters 3 as number")
      val pfList : List[Int] = PrimeFactors.getList(3)
      Then("The list of prime factors should be List(3)")
      pfList should be (List[Int](3))
    }

    scenario("Prime factors is list(2,2) for number equal 4") {
      Given("The user want to get the prime factors")
      When("He enters 4 as number")
      val pfList : List[Int] = PrimeFactors.getList(4)
      Then("The list of prime factors should be List(2,2)")
      pfList should be (List[Int](2,2))
    }

    scenario("Prime factors is list(5) for number equal 5") {
      Given("The user want to get the prime factors")
      When("He enters 5 as number")
      val pfList : List[Int] = PrimeFactors.getList(5)
      Then("The list of prime factors should be List(5)")
      pfList should be (List[Int](5))
    }

    scenario("Prime factors is list(3,2) for number equal 6") {
      Given("The user want to get the prime factors")
      When("He enters 6 as number")
      val pfList : List[Int] = PrimeFactors.getList(6)
      Then("The list of prime factors should be List(3,2)")
      pfList should be (List[Int](3,2))
    }

    scenario("Prime factors is list(7) for number equal 7") {
      Given("The user want to get the prime factors")
      When("He enters 7 as number")
      val pfList : List[Int] = PrimeFactors.getList(7)
      Then("The list of prime factors should be List(7)")
      pfList should be (List[Int](7))
    }

    scenario("Prime factors is list(2,2,2) for number equal 8") {
      Given("The user want to get the prime factors")
      When("He enters 8 as number")
      val pfList : List[Int] = PrimeFactors.getList(8)
      Then("The list of prime factors should be List(2,2,2)")
      pfList should be (List[Int](2,2,2))
    }

    scenario("Prime factors is list(3,3) for number equal 9") {
      Given("The user want to get the prime factors")
      When("He enters 9 as number")
      val pfList : List[Int] = PrimeFactors.getList(9)
      Then("The list of prime factors should be List(3,3)")
      pfList should be (List[Int](3,3))
    }

    scenario("Prime factors is list(23,3) for number equal 69") {
      Given("The user want to get the prime factors")
      When("He enters 69 as number")
      val pfList : List[Int] = PrimeFactors.getList(69)
      Then("The list of prime factors should be List(23,3)")
      pfList should be (List[Int](23,3))
    }

    scenario("Prime factors is list(11, 7, 5, 5, 3, 3, 2, 2) for number equal 69300") {
      Given("The user want to get the prime factors")
      When("He enters 69300 as number")
      val pfList : List[Int] = PrimeFactors.getList(69300)
      Then("The list of prime factors should be List(11, 7, 5, 5, 3, 3, 2, 2)")
      pfList should be (List[Int](11, 7, 5, 5, 3, 3, 2, 2))
    }

  }


}