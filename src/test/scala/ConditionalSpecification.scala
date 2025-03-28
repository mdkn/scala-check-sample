import org.scalacheck.Prop.{forAll, propBoolean}

object ConditionalSpecification {
  val propMakeList = forAll { (n: Int) =>
    (n >= 0 && n < 10000) ==> (List.fill(n)("").length == n)
  }
}
