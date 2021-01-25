package com.jblad.voyager.util

class Processor {
  var myField : Int = 0;


  def this(value : Int) = {
    this();
    this.myField = value;
  }

  def getMyField() : Int = {
    return this.myField;
  }

  def addToMyField(value : Int) {
    this.myField += value;
  }
}
