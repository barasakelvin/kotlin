class fruits {
    var type=""
    var color=""
    var amount=0
    var quality=""


}

fun main(args: Array<String>) {
    val matunda=fruits()
    matunda.type="banana"
    matunda.color="yellow"
    matunda.amount=10
    matunda.quality="fresh"

    println(matunda.type)
    println(matunda.color)
    println(matunda.amount)
    println(matunda.quality)

    val matunda2=fruits()
    matunda.type="orange"
    matunda.color="orange"
    matunda.amount=20
    matunda.quality="fresh"

    println(matunda.type)
    println(matunda.color)
    println(matunda.amount)
    println(matunda.quality)

    val matunda3=fruits()
    matunda.type="apple"
    matunda.color="red"
    matunda.amount=50
    matunda.quality="fresh"

    println(matunda.type)
    println(matunda.color)
    println(matunda.amount)
    println(matunda.quality)

}