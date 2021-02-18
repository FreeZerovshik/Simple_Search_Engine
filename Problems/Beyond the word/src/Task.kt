import java.util.Scanner

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val str = sc.nextLine()
    for (s in 'a'..'z') {
        if (!str.contains(s)) print(s)
    }
}