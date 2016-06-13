package com.bigdatanerd.qualitas.core

import java.lang.reflect.Field

import com.bigdatanerd.qualitas.verify.JavaReview

object QualitasEngine {


  def main(args: Array[String]) {
    /* val runtime = scala.reflect.runtime.universe
     val m = runtime.runtimeMirror(getClass.getClassLoader)
     val classMirror: runtime.ClassMirror = m.reflectClass(m.classSymbol(classOf[Review])) */

    val fields: Array[Field] = classOf[JavaReview].getDeclaredFields

    for (field: Field <- fields) {
      println(field)
    }

    /* val methods : Array[Method] = classOf[Review].getDeclaredMethods

     for(method : Method <- methods) {
       println(method)
     } */


  }


}
