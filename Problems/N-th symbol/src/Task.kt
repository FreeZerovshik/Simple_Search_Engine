import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val inString = scanner.nextLine()
    val num = scanner.nextInt()
    println("Symbol # $num of the string \"$inString\" is '${inString[num - 1]}'")
}
