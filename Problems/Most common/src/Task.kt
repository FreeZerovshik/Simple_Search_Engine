import java.util.*

fun main() {
    val words = mutableMapOf<String, Int>()

    val sc = Scanner(System.`in`)
    do {
        val wrd = sc.next()
        if (words.containsKey(wrd)) {
            words[wrd] = words.getValue(wrd) + 1
        } else words[wrd] = 1
    } while (wrd != "stop")

    if (words.size <= 1) {
        print("null")
        return
    }

    var max = 0
    var maxWrd = ""
    for ((k, v) in words) {
        if (max < v) {
            max = v
            maxWrd = k
        }
    }

    print(maxWrd)
}
