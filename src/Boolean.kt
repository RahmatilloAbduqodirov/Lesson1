class Boolean {
    fun Boolean10(a: Int, b: Int){
        println("Boolean10")
        println((a % 2 != 1) xor (b % 2 != 1))
        println()
    }

    fun Boolean11(a: Int, b: Int){
        println("Boolean11")
        println((a % 2) == (b % 2))
        println()
    }

    fun Boolean12(a: Int, b: Int, c: Int){
        println("Boolean12")
        println(a > 0 && b > 0 && c > 0)
        println()
    }
}