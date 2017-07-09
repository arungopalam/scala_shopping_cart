package checkout


import scala.collection.mutable.ListBuffer
/**
  * Created by arung on 7/9/2017.
  */
class checkoutSystem extends checkout.checkout{
  def Add(items: List[IItem]) : Unit = {
    items.map(i => Add(i))
  }


  def Cost(): BigDecimal = {
    items.map(i => i.price).sum
  }


  private var items : ListBuffer[IItem] = ListBuffer()

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
