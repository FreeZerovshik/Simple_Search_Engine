enum class Rainbow(val color: String) {
    RED("red"),
    ORANGE("orange"),
    YELLOW("yellow"),
    GREEN("green"),
    BLUE("blue"),
    INDIGO("indigo"),
    VIOLET("violet");

    companion object {
        fun findByColor(name: String?): String {
            for (enum in Rainbow.values()) {
                if (name == enum.color) return "true"
            }
            return "false"
        }
    }
}

fun main(){
    val color = readLine()
    println(Rainbow.findByColor(color))
}
