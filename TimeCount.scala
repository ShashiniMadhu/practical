package Main.scala

object TimeCount {
  def easyPace(x: Int): Int = {8 * x}

  def Tempo(m: Int): Int = {7 * m}

  def Total(x: Int, m: Int): Int = 2 * easyPace(x) + Tempo(m)

  def main(args: Array[String]): Unit = {
    val Distance = Total(2,3)
    println(f"Total time is $Distance miniutes")
  }

}
