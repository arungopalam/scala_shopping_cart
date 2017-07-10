package checkout

/**
  * Created by arung on 7/10/2017.
  */
class ThreeForPriceOfTwoOranges extends IOffer
{
  def IsOrange(x: IItem): Boolean = x match {
    case Orange => true
    case _ => false
  }

  def discount(items: List[IItem]): BigDecimal =
  {
    val oranges = items.filter { x => IsOrange(x) }
    return math.floor(oranges.size / 3) * Orange.price
  }
}