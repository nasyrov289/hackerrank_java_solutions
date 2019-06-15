import java.util.*


abstract class Book(title: String, author: String) {

    abstract fun display()
}


class MyBook(var title: String, var author: String, private val price: Int) : Book(title, author) {
    override fun display() {
        println("Title: $title\nAuthor: $author\nPrice: $price")
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val title: String = scan.nextLine()
    val author: String = scan.nextLine()
    val price: Int = scan.nextInt()

    scan.close()
    val b: Book = MyBook(title, author, price)
    b.display()
}
