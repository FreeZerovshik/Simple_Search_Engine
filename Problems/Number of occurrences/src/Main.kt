fun solution(strings: List<String>, str: String): Int {
    var cnt = 0
    strings.forEach { if (it == str) cnt++ }
    return cnt
}
