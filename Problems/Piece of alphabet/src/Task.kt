import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val str = sc.nextLine()
    if (str.contains(Regex("[A-Z]|[a-z]"))) {
        for (i in 0 until str.lastIndex) {
            if (str[i] + 1 != str[i + 1]) {
                println(false)
                return
            }
        }
    }
    println(true)
}
