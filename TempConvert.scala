package Main.scala

object TempConvert {
  def convert(c:Double):Double={
    c*1.8+32
  }

  def main(args: Array[String]): Unit = {
    val fah = convert(100)
    println(f"Temperature in fahrenheit is $fah%.2f")
  }

}
