fun solution(numbers: List<Int>, number: Int): MutableList<Int> {
    val newNumber = mutableListOf<Int>()
    newNumber.addAll(numbers)
    newNumber.add(number)
    return newNumber
}