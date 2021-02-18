import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val str1 = scanner.nextLine()
    val str2 = scanner.nextLine()
    if (str1.toUpperCase() == str2.toUpperCase()) println(true)
    else println(false)
}
