package Main.scala

object DiskArea {
  def Area(r:Double):Double={
    math.Pi*r*r
  }

  def main(args:Array[String]):Unit={
    val area=Area(5)
    println(f"Area is $area%.2f")
  }

}
