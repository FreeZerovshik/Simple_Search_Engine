import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    val box1 = sc.nextLine().split(" ").map { it.toInt() }.toIntArray().sorted()
    val box2 = sc.nextLine().split(" ").map { it.toInt() }.toIntArray().sorted()

    when {
        box1[0] == box2[0] && box1[1] == box2[1] && box1[2] == box2[2] -> println("Box 1 = Box 2")
        box1[0] >= box2[0] && box1[1] >= box2[1] && box1[2] >= box2[2] -> println("Box 1 > Box 2")
        box1[0] <= box2[0] && box1[1] <= box2[1] && box1[2] <= box2[2] -> println("Box 1 < Box 2")
        else -> println("Incomparable")
    }
}