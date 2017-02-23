package example

import org.scalatest._

class HelloSpec extends FlatSpec with Matchers {
  "The Hello object" should "say yo" in {
    Hello.greeting shouldEqual "yo"
  }
}
