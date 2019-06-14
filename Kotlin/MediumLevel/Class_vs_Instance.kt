import java.io.*;
import java.util.*;

class Person constructor(age: Int) {
    var initialAge: Int = 0

    init {
        if (age > 0) {
            this.initialAge = age
        } else {
            println("Age is not valid, setting age to 0.")
            this.initialAge = 0
        }
    }

    fun amIOld() {
        when {
            initialAge >= 13 && initialAge < 18 -> println("You are a teenager.")
            initialAge < 13 -> println("You are young.")
            else -> println("You are old.")
        }
    }

    fun yearPasses() {
        initialAge++
    }
}

// do not edit code below!!!

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val T: Int = sc.nextInt()
    for (i in 1..T) {
        var age: Int = sc.nextInt()
        var p: Person = Person(age)
        p.amIOld()
        for (j in 1..3) {
            p.yearPasses()
        }
        p.amIOld()
        println()
    }
    sc.close()
}
