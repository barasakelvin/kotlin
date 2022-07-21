//inheritance
//parent class
open class Iamtheparent {
    val num1=100
    var jina="Kelvin"
    var miaka=20
}
//child class inheriting characters from the parent
class child1:Iamtheparent(){
    fun display(){
        println("My number is $num1")
    }

}
class child2:Iamtheparent(){
    fun display(){
        println("My name is $jina")
    }
}
class child3:Iamtheparent(){
    fun display(){
        println("My age is $miaka years")
    }
}

fun main(args: Array<String>) {
    val myobj=child1()
    println(myobj.display())
    val obj=child2()
    println(obj.display())
    val obje=child3()
    println(obje.display())
}