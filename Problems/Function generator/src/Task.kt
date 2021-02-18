fun identity(x: Int) = x
fun half(x: Int) = x / 2
fun zero(x: Int) = 0

fun generate(functionName: String): (Int) -> Int {
    return when (functionName) {
        "identity" -> ::identity
        "half"  -> ::half
        else -> ::zero
    }
}
