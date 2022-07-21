fun emobilis(){
    var num1=47
    var num2=94
    println("The sum of $num1 and $num2 is " +(num1 + num2))
}
fun myname(name:String,age:Int,status:String){
    var name="Kelvin"
    println("My name is $name and am $age years old and am currently $status")
}
fun matunda(type:String,producer:String,amount:Int){
    println("This is $type juice produced by $producer and it costs $amount shillings")

}

//calling the function
fun main(args: Array<String>) {
    emobilis()
    myname("Kelvin",20,"broke")
    matunda("orange","Kelvin juice company",30)

    print("Enter a positive integer number: ")
    val number: Int=Integer.valueOf(readLine())
    val factorial=fact(number)
    println("Factorial of $number =$factorial")


}
//recursive function
fun fact(num: Int): Int{
    return if (num == 1){
        num
    }
    else{
        //function fact() calling itself
        num *fact(num -1)
    }
}