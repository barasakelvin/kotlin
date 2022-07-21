fun main(args: Array<String>) {
    println("Enter first number:")
    var fNum=Integer.valueOf(readln())

    println("Enter operator:*,/,+,-")
    var operator= readLine()

    println("Enter second number:")
    var lNum=Integer.valueOf(readln())

    if (operator=="+"){
        var ans=fNum +lNum
        println("$fNum + $lNum =" +ans)
    }else if (operator=="*"){
        var ans=fNum *lNum
        println("$fNum * $lNum ="+ans)
    }else if (operator=="-"){
        var ans=fNum-lNum
        println("$fNum-$lNum ="+ans)
    }else if (operator=="/"){
        var ans=fNum /lNum
        println("$fNum /$lNum =" +ans)
    }else{
        println("Invalid operator!!!")
    }


}