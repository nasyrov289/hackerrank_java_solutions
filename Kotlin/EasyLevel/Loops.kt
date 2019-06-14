import java.util.*
import kotlin.text.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()
    for(i in 0..10){
        println("$n x $i = ${n*i}")
    }
}
