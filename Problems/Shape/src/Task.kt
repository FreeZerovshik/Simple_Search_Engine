import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    when (sc.nextInt()){
        1 -> println("You have chosen a square")
        2 -> println("You have chosen a circle")
        3 -> println("You have chosen a triangle")
        4 -> println("You have chosen a rhombus")
        else -> println("There is no such shape!")
    }
}