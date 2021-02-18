import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    var balance = sc.nextLine().toInt()
    val payments = sc.nextLine().split(" ")

    payments.forEach {
        balance -= it.toInt()
        if (balance < 0) {
            println("Error, insufficient funds for the purchase. You have ${balance + it.toInt()}, but you need $it.")
            return
        }
    }
    println("Thank you for choosing us to manage your account! You have $balance money.")
}