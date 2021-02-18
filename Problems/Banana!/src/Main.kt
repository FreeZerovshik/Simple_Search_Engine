fun solution(strings: MutableList<String>, str: String): MutableList<String> {
    val newStrings = mutableListOf<String>()
    for (s in strings) {
        if (s == str) newStrings.add("Banana")
        else newStrings.add(s)
    }
    return newStrings
}
