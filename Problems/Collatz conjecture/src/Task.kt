import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    var n = sc.nextInt()
    print("$n ")
    while (n != 1){
        if (n % 2 == 0) n /= 2
        else n = n * 3 +1

        print("$n ")
    }
}