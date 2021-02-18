import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val name = scanner.next().first()
    val lname = scanner.next()
    val age = scanner.nextInt()
    println("$name. $lname, $age years old")
}