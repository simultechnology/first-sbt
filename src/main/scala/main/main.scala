/**
  * Created by zdc on 2016/06/02.
  */

case class Person(name: String, age: Int)

object main {
  val hoge: Person = new Person("hoge", 11)
  def main(args: Array[String]) = println(hoge.age)
}
