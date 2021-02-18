import java.util.*

fun main() {
    // write your code here
    val sc = Scanner(System.`in`)
    val str = sc.nextLine()

    var prevSym = str.first()
    var cnt = 0
    str.forEach {
        if (prevSym == it) cnt++
        else {
            print("$prevSym$cnt")
            prevSym = it
            cnt = 1
        }
    }
    print("$prevSym$cnt")
}
