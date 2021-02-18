package search

import java.io.File
import java.util.*

val scanner = Scanner(System.`in`)
val people = mutableListOf<String>()
var foundPeople = mutableListOf<Int>()
val invertedIndex = mutableMapOf<String, MutableList<Int>>()

fun main(args: Array<String>) {

//    println("Enter the number of people:")
//    val numPeople  = scanner.nextInt()
//
//    println("Enter all people:")


//    repeat(numPeople) {
//        people.add(scanner.nextLine())
//    }
    val filename  = args[args.indexOf("--data")+1]
    var line = 0

    File(filename).forEachLine {
        people.add(line,it)

        it.split(" ").forEach { wrd ->
            if (invertedIndex.containsKey(wrd)) {
                invertedIndex.getValue(wrd).add(line)
            } else {
                invertedIndex[wrd] = mutableListOf(line)
            }

        }
        line++
    }

    while (true) {
        println("\n=== Menu ===\n" +
                "1. Find a person\n" +
                "2. Print all people\n" +
                "0. Exit")
        when (scanner.next()) {
            "0" -> {println("Bye!")
                    return
                    }
            "1" -> addMenu()
            "2" -> printAll()
            else -> println("Incorrect option! Try again.")

        }
        foundPeople.clear()
    }

}

fun printAll(){
    people.forEach { println(it) }
}

fun addMenu() {

    println("Select a matching strategy: ALL, ANY, NONE")

    val strategy = scanner.next()

    println("Enter a name or email to search all suitable people.")

    val searchStr = readLine()!!

    when (strategy) {
        "ANY" -> search(searchStr)
        "ALL" -> search(searchStr, true)
        "NONE" -> search(searchStr)
         else -> println("This is unknown strategy")
    }

    if (strategy != "NONE") printInfo()
    else  printInfo(true)

}

fun printInfo(invert: Boolean = false) {
    if (foundPeople.isNotEmpty()) {
        println("\n ${foundPeople.size} persons found:")
        if (!invert)
            foundPeople.forEach { println(people[it]) }
        else
            people.forEachIndexed { index, s -> if (!foundPeople.contains(index)) println(s)}
    } else {
        println("No matching people found.")
    }
}

fun search(searchStr: String, all: Boolean = false) {
    searchStr.split(" ").forEach {
        invertedIndex.forEach { (key, value) ->
            if (key.equals(it, true)) {
                foundPeople.addAll(value)
            }
        }
    }

    if (foundPeople.isNotEmpty()) {
        if (all) {
            val removeInd = mutableListOf<Int>()

            foundPeople = foundPeople.distinct() as MutableList<Int>
            foundPeople.forEach { p ->
                searchStr.split(" ").forEach {
                    if (!people[p].contains(it)) removeInd.add(p)
                }
            }

            removeInd.forEach { foundPeople.remove(it) }
        }
    }
}

