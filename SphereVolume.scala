package Main.scala

object SphereVolume {
  def volumeSphere(r:Double):Double={
    (4/3)*math.Pi*r*r*r
  }

  def main(args: Array[String]): Unit = {
    val volume = volumeSphere(10)
    println(f"Volume of sphere is $volume%.2f")
  }

}
