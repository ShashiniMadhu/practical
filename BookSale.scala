package Main.scala

object BookSale {
  def bookP(x:Int):Double={x*24.95}

  def discount(p:Double):Double={p*0.4}

  def discountPrice(x: Int): Double ={
    bookP(x) - discount(bookP(x))
  }

  def shipping(x: Int): Double ={
    if (x < 50) x * 3 else (x * 50) + (x - 50) * 0.75
  }

  def wholeSale(x:Int):Double={discountPrice (x) +shipping (x)}

  def main(args: Array[String]): Unit = {
    val Total = wholeSale(60)
    println(f"Whole sale for 60 copies $Total%.2f")
  }

}
