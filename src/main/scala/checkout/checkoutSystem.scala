package checkout


import scala.collection.mutable.ListBuffer
/**
  * Created by arung on 7/9/2017.
  */
class checkoutSystem extends checkout.checkout{

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
