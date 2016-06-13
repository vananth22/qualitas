package com.bigdatanerd.qualitas.core

/**
  * Created by ananth.durai on 6/10/16.
  */
sealed trait ConstraintStatus {
  val message: String
}

case object ConstraintSuccess extends ConstraintStatus {
  override val message: String = "success"
}

case object ConstraintFailure extends ConstraintStatus {
  override val message: String = "Failed"
}


case class ConstraintError(exception: Throwable) extends ConstraintStatus {
  override val message: String = "Error"
}