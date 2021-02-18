import java.util.*

fun main(args: Array<String>) {
    var age = 5
    var passed = 100_000
    var maxSpeed = 120
    var trans = 0

    val scanner = Scanner(System.`in`)

    when (scanner.next()) {
        "old" -> age = scanner.nextInt()
        "passed" -> passed = scanner.nextInt()
        "speed" -> maxSpeed = scanner.nextInt()
        "auto" -> trans = scanner.nextInt()
        else -> println("Incorrect option! Try again.")
    }

    println(carPrice(age, passed, maxSpeed, trans))
}

fun carPrice(p_age: Int = 5, p_passed: Int = 100_000, p_maxSpeed: Int = 120, p_trans: Int = 0): Int {

    var finishPrice: Int = 20_000

    finishPrice -= p_age * 2000

    if (p_maxSpeed > 120) {
        finishPrice += (p_maxSpeed - 120) * 100
    } else {
        finishPrice -= (120 - p_maxSpeed) * 100
    }

    finishPrice -= (p_passed/10000) * 200

    if (p_trans > 0) finishPrice += 1500
    return finishPrice
}