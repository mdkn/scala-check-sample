import org.scalacheck.Prop.{forAll, propBoolean}
import org.scalacheck.{Gen, Prop, Properties}

object ConditionalSpecification extends Properties("Conditional") {
  property("propReverseList") = forAll { (l: List[String]) => l.reverse.reverse == l }

  property("propConcatString") = forAll { (s1: String, s2: String) =>
    (s1 + s2).endsWith(s2)
  }

  val smallInteger = Gen.choose(0,100)

  property("propSmallInteger") = Prop.forAll(smallInteger) { n =>
    n >= 0 && n <= 100
  }

  property("propMakeList") = forAll { (n: Int) =>
    (n >= 0 && n < 10000) ==> (List.fill(n)("").length == n)
  }
}
