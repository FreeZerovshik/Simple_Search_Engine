import java.util.Scanner

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val ships = sc.nextLine().split(" ").map { it.toInt() }.toIntArray()
    val arrX = mutableListOf(1, 2, 3, 4, 5)
    val arrY = mutableListOf(1, 2, 3, 4, 5)

    for (idx in ships.indices step 2) {
        arrX.remove(ships[idx])
        arrY.remove(ships[idx + 1])
    }

    var strX = ""
    var strY = ""
    arrX.forEach { strX += "$it " }
    arrY.forEach { strY += "$it " }

    println(strX.trim())
    println(strY.trim())
}
