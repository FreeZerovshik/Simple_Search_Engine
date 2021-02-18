import java.util.*

fun calcLimit(speed: Int, lim: Int = 60): String {
    return if (speed > lim) "Exceeds the limit by ${speed-lim} kilometers per hour"
    else "Within the limit"
}

fun main(args: Array<String>) {
    // write your code here
    val sc = Scanner(System.`in`)
    val speed = sc.nextInt()
    var limit: Int? = null

    if (sc.hasNextInt()) {
        limit = sc.nextInt()
        println(calcLimit(speed, limit))
    } else {
        println(calcLimit(speed))
    }
}
