import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

   println( when (sc.nextInt()){
        1 -> "move up"
        2 -> "move down"
        3 -> "move left"
        4 -> "move right"
        0 -> "do not move"
        else -> "error!"
    }
   )
}