package com.bigdatanerd.qualitas.core


import com.bigdatanerd.qualitas.core.Constraint.ConstraintFunc


/**
  * Created by ananth.durai on 6/10/16.
  */
trait Constraint {

  val func : ConstraintFunc

}

object Constraint {

  type ConstraintFunc = (String) => ConstraintResult[Constraint]

}
