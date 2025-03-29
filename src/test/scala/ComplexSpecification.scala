import org.scalacheck.Prop.{all, forAll, propBoolean}
import org.scalacheck.Properties

object ComplexSpecification extends Properties("Complex") {

//  property("propMul") = forAll { (n: Int, m: Int) =>
//    val res = n * m
//    ("evidence = " + res) |: all(
//      "div1" |: m != 0 && m < 100 && n < 100 ==> (res / m == n),
//      "div2" |: n != 0 && m < 100 && n < 100 ==> (res / n == m)
//    )
//  }
}
