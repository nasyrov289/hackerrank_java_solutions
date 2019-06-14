import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*


fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()
    for (i in arr.size - 1 downTo 0) {
        println("${arr[i]}")
    }
}
