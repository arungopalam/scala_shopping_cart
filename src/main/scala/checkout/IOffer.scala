package checkout

/**
  * Created by arung on 7/10/2017.
  */
trait IOffer {
  def discount(items: List[IItem]): BigDecimal
}
