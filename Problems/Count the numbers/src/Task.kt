import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val n = sc.nextInt()

    val range = a..b

    var cnt = 0
    range.forEach { if (it % n == 0) cnt++ }

    println(cnt)
}
