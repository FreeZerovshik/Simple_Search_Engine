import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    var n = sc.nextInt()

    var num: Int = 1
    while (n > 0){
        repeat(num){
            if (n == 0) return
            print("$num ")
            n--
        }
        num++
    }
}