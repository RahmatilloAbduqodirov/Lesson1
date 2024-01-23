class Begin {
    fun Begin10(a: Int, b: Int) {
        println("Begin10")
        println(Math.pow((a+b).toDouble(), 2.0))
        println(Math.pow((a-b).toDouble(), 2.0))
        println(Math.pow((a*b).toDouble(), 2.0))
        println(Math.pow((a/b).toDouble(), 2.0))
        println()
    }

    fun Begin11(a: Int, b: Int) {
        println("Begin11")
        println(Math.abs(a+b))
        println(Math.abs(a-b))
        println(Math.abs(a*b))
        println(Math.abs(a/b))
        println()
    }

    fun Begin12(a: Int, b: Int) {
        println("Begin12")
        var c = Math.sqrt(((a * a) + (b * b)).toDouble())
        var p = a + b + c
        println("Гипотенуза: ${c}")
        println("периметр: ${p}")
        println()
    }
}