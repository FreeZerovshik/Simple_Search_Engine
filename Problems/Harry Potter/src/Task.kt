import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    println(when(scanner.nextLine()){
        "gryffindor" -> "bravery"
        "hufflepuff" -> "loyalty"
        "slytherin" -> "cunning"
        "ravenclaw" -> "intellect"
        else -> "not a valid house"
    })
}