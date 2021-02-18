import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    val numbers = IntArray(n)
    var maxNum = Int.MIN_VALUE
    var maxIdx: Int = 0
    for (idx in 0..numbers.lastIndex) {
        numbers[idx] = scanner.nextInt()
        if (maxNum < numbers[idx]) {
            maxNum = numbers[idx]
            maxIdx = idx
        }
    }
    println(maxIdx)
}
