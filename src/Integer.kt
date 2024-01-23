class Integer {
    fun Integer10(a: Int){
        println("Integer10")
        val vohid = a % 10;
        val dahi = (a / 10) % 10;
        println(vohid)
        println(dahi)
        println()
    }

    fun Integer11(a: Int){
        println("Integer11")
        val vohid = a % 10;
        val dahi = (a / 10) % 10;
        val sadi = a / 100;
        println(vohid + dahi + sadi)
        println(vohid * dahi * sadi)
        println()
    }

    fun Integer12(a: Int){
        println("Integer12")
        val vohid = a % 10;
        val dahi = (a / 10) % 10;
        val sadi = a / 100;
        println((vohid * 10 + dahi) * 10 + sadi)
        println()
    }
}