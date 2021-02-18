import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val size  = scanner.nextInt()
    val numbers = IntArray(size)

    for(i in 0..numbers.lastIndex) numbers[i] = scanner.nextInt()

    val n = scanner.nextInt()
    val m = scanner.nextInt()

    if (numbers.contains(n) && numbers.contains(m)) {
        for (i in 0..numbers.lastIndex) {
            if ((i + 1 <= numbers.lastIndex && numbers[i] == n && numbers[i + 1] == m) || (i - 1 >= 0 && numbers[i] == n && numbers[i - 1] == m)) {
                println("NO")
                return
            }
        }
    }

    println("YES")
}