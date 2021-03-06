package com.datascience.education.tutorial.lecture4

import org.scalatest._
import org.scalatest.{FunSuite, Matchers}

import scala.Option
import scala.Some
import scala.None

import SafeDivision._

class SafeDivisionSpec extends FunSuite with Matchers {

  // test("safeDivInt(5, 0) should be None") {
  //   safeDivInt(5, 0) should be (None)
  // }

  // test("safeDivInt(5, 2) should be Some(2)") {
  //   safeDivInt(5, 2) should be (Some(2))
  // }

  // // https://docs.oracle.com/javase/7/docs/api/java/lang/Double.html
  // test("safeDiv catches Double.POSITIVE_INFINITY") {
  //   safeDiv(5, 0) should be (None)
  // }
  // test("safeDiv catches Double.NEGATIVE_INFINITY") {
  //   safeDiv(-5, 0) should be (None)
  // }
  // test("safeDiv catches Double.NaN") {
  //   safeDiv(0, 0) should be (None)
  // }

  // val l1 = (6 to 11).toList
  // val l2 = (2 to 7).toList
  // val fracsSuccessful: List[(Int, Int)] = l1.zip(l2)

  // // http://www.scalatest.org/user_guide/using_matchers#checkingAnObjectsClass
  // test(s"All of these fractions {$fracsSuccessful} are real numbers, so the traversal should succeed") {
  //   val out: Option[List[Double]] = traverseFractions(fracsSuccessful)
  //   out shouldBe a [Some[_]]
  // }

  // val l3 = (6 to 11).toList
  // val l4 = (-3 to 2).toList
  // val fracsFailing: List[(Int, Int)] = l3.zip(l4)
  
  // test(s"One of these fractions {$fracsFailing} is not a real number, so the traversal should fail") {
  //   val out: Option[List[Double]] = traverseFractions(fracsFailing)
  //   out shouldBe (None)
  // }

  
}
