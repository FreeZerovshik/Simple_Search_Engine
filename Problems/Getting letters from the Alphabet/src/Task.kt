import java.util.Scanner

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val ch = sc.next().first()
    for (c in 'a'..'z') {
        if (ch == c) return
        print(c)
    }
}