import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    if ((n > -15 && n <= 12)|| (n in 15..16) || (n >= 19 && n < Int.MAX_VALUE) ) println("True")
    else println("False")
}