val lambda: (Long, Long) -> Long = { a: Long, b: Long ->
                var c: Long =1
                for (x in a..b) {
                    c *= x
                }
                c
}