import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    val str1 = sc.nextLine()
    val cmd = sc.nextLine()
    val str2 = sc.nextLine()

    print(when (cmd) {
            "equals" -> str1 == str2
            "plus" -> "$str1$str2"
            "endsWith" -> str1.endsWith(str2)
            else -> "Unknown operation"
        }
    )
}
