package checkout


import scala.collection.mutable.ListBuffer
/**
  * Created by arung on 7/9/2017.
  */
case class checkoutSystem(offers: List[IOffer]) extends checkout.checkout{

  private var items : ListBuffer[IItem] = ListBuffer()

  def Add(items: List[IItem]) : Unit = {
    items.map(i => Add(i))
  }


  def Cost(): BigDecimal = {
    items.map(i => i.price).sum - offers.map(o => o.discount(items.toList)).sum
  }


  def Add(item: IItem) : Unit = {
    item match {
      case Apple => {items += item}
      case Orange => {items += item}
      case _ => {}
    }
  }

  def Items() : Int = {
    items.size
  }
}
