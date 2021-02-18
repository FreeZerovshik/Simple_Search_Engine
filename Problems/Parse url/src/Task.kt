import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val url = sc.nextLine()

    val param = url.substring(url.indexOf('?') + 1).split("&")
    var pass: String = ""
    for (par in param) {
        if (par.last() == '=') {
            println("${par.replace("="," : ")}not found")
        } else {
            println(par.replace("=", " : "))
        }
        if (par.contains("pass")) pass = "password : ${par.substring(par.indexOf("=") + 1)}"
    }
    println(pass)
}
