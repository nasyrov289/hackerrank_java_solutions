import java.io.*;
import java.util.*;

//Kotlin 1.1

interface AdvancedArithmetic {
    fun divisorSum(n:Int):Int {
        return 0
    }
}

// do not edit code above!!!


class Calculator():AdvancedArithmetic {
    override fun divisorSum(n:Int):Int {
        
        var sum = 0
        for (i in 1..n) {
            if (n % i == 0) sum += i
        }
        return sum
    }
}


// do not edit code below!!!

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val n:Int = scan.nextInt()
    scan.close()
    
    val myCalculator:AdvancedArithmetic = Calculator()
    val sum:Int = myCalculator.divisorSum(n)
    
    println("I implemented: ${myCalculator::class.java.getInterfaces()[0].getName()}")
    println("$sum")
}
