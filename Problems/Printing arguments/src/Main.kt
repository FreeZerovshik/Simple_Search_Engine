fun main(args: Array<String>) {
    if (args.size != 3) {
        println("Invalid number of program arguments")
        return
    }
    var cnt = 1
    for (v in args) {
        println("Argument $cnt: $v. It has ${v.length} characters")
        cnt++
    }
}
