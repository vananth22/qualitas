package com.bigdatanerd.qualitas.core



/**
  * Created by ananth.durai on 6/10/16.
  */
trait ConstraintResult[+C <: Constraint] {
  val constraint: C
  val status: ConstraintStatus
  val message: String

}
