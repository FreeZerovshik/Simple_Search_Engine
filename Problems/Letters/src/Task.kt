import java.util.*

fun main() {
    val letters = mutableMapOf<Int, Char>()
    val sc = Scanner(System.`in`)
    var cnt = 1
    var ch = 'a'
    while (ch != 'z') {
        ch = sc.next().first()
        letters[cnt] = ch
        cnt++
    }
    if (cnt >= 4) {
        print(letters[4])
    } else {
        print("null")
    }
}
