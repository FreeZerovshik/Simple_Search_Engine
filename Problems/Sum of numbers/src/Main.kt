fun solution(numbers: List<Int>): Int {
    var s = 0
    numbers.forEach { s=s+it }
    return s
}