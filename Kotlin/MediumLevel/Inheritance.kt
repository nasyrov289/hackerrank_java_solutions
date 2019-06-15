import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*


open class Person(firstName: String, lastName: String, identification: Int) {
    val firstName: String = firstName
    val lastName: String = lastName
    val identification: Int = identification

    fun printPerson() {
        println("Name: $lastName, $firstName\nID: $identification")
    }
}

// do not edit code above!!!

class Student(firstName: String, lastName: String, id: Int, testScores: IntArray) : Person(firstName, lastName, id) {

    var testScores = testScores
    fun calculate(): Char {
        var total = 0

        for (testScore in testScores) total += testScore

        val avg = total / testScores.size

        if (avg in 90..100) return 'O'
        if (avg in 80..89) return 'E'
        if (avg in 70..79) return 'A'
        if (avg in 55..69) return 'P'
        return if (avg in 40..54) 'D' else 'T'
    }
}

// do not edit code below!!!

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val firstName: String = scan.next()
    val lastName: String = scan.next()
    val id: Int = scan.nextInt()

    val numScores: Int = scan.nextInt()
    val testScores: IntArray = IntArray(numScores)

    for (i in 0..numScores - 1) {
        testScores[i] = scan.nextInt()
    }

    scan.close()

    val s: Student = Student(firstName, lastName, id, testScores)
    s.printPerson()
    println("Grade: ${s.calculate()}")
}
