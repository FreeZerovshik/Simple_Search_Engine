enum class DangerLevel(val num: Int) {
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    fun getLevel() = num
}
