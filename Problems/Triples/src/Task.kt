import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    val numbers = IntArray(n)
    var tripleCnt = 0

    for (i in 0..numbers.lastIndex) numbers[i] = scanner.nextInt()

    for (i in 0..numbers.lastIndex){
       if(i + 2 <= numbers.lastIndex && numbers[i] + 1 == numbers[i + 1] && numbers[i + 1] + 1 == numbers[i + 2] ) {
           tripleCnt++
       }
    }
    println(tripleCnt)
}
