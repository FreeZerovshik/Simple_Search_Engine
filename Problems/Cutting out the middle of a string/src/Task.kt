import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val str = sc.nextLine()
    var str2 = ""
    if (str.length % 2 == 0) {
        str2 = str.substring(0, str.length/2-1) + str.substring(str.length/2+1)
    } else {
        str2 = str.substring(0, str.length/2) + str.substring(str.length/2+1)
    }

    println(str2)
}