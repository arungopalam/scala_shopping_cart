/**
  * Created by arung on 7/9/2017.
  */
import checkout._
import org.scalatest.FunSuite
import org.scalamock.scalatest.MockFactory

class CheckoutSystemTests extends FunSuite with MockFactory{

  test("Checkout system should sell Apples") {
    val checkoutSystem = new  checkoutSystem()
    checkoutSystem.Add(Apple)

    assert(checkoutSystem.Items() == 1)
  }

  test("Checkout system should sell Oranges") {
    val checkoutSystem = new  checkoutSystem()
    checkoutSystem.Add(Orange)

    assert(checkoutSystem.Items() == 1)
  }

  test("Checkout system should not sell anything else") {
    val checkoutSystem = new  checkoutSystem()
    checkoutSystem.Add(mock[IItem])
    assert(checkoutSystem.Items() == 0)
  }

  test("Apples cost 60 p") {
    assert(Apple.price == 0.60)
  }

  test("Oranges cost 25 p") {
    assert(Orange.price == 0.25)
  }

  test("Checkout system should return total cost") {
    val checkoutSystem = new  checkoutSystem()
    checkoutSystem.Add(Apple)
    checkoutSystem.Add(Orange)
    assert(checkoutSystem.Cost() == 0.85)
  }

  test("Checkout system should scan multiple items") {
    val checkoutSystem = new  checkoutSystem()
    checkoutSystem.Add(List(Apple,Orange,Apple,Apple))
    assert(checkoutSystem.Cost() == 2.05)
  }
}

