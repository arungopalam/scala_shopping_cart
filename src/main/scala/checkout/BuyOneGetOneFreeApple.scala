package checkout

/**
  * Created by arung on 7/10/2017.
  */
case class BuyOneGetOneFreeApple() extends IOffer{
  def IsApple(x: IItem): Boolean = x match {
    case Apple => true
    case _ => false
  }

  def discount(items: List[IItem]): BigDecimal =
  {
    val apples = items.filter { x => IsApple(x) }
    val floor = math.floor(apples.size / 2)
    return floor * Apple.price
  }
}
