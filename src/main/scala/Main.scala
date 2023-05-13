import scala.collection.LinearSeq

object Main {
  val iterators: LinearSeq[Int] = Nil
  @inline def current: Int = iterators.head
  val asString = current.toString
}
