fun main(args: Array<String>) {
    var number=56
    if (number<40){
        println("You dont qualify")
    }else{
        println("you qualify")
    }
    //trial
    var marks=70
    if (marks>0 && marks<=40){
        println("Failed")
    }else if (marks>40 && marks<=60){
        println("passed")
    }else if (marks>60 && marks<=80){
        println("excellent")
    }else if (marks>80 && marks<=100){
        println("distinction")
    }else{
        println("invalid input")
    }
}