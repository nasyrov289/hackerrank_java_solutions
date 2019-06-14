import java.util.*
import kotlin.io.*

import kotlin.text.*


fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val N = scan.nextLine().trim().toInt()
    when {
        N % 2 != 0 -> print("Weird")
        N <= 5 -> print("Not Weird")
        N <= 20 -> print("Weird")
        else -> {
            print("Not Weird")
        }
    }
}
