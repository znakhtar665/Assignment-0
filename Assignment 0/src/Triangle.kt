open class Triangle(_name: String): Shape(_name) {

    var sideA = 0.0
    var sideB = 0.0
    var sideC = 0.0

    fun SetDimensions(a: Double, b: Double, c: Double) {

        this.sideA = a
        this.sideB = b
        this.sideC = c

    }

    override fun printDimensions() {
        println("Sides: $sideA, $sideB, $sideC")

    }

    override fun getArea(): Double {
        val formula = (sideA + sideB + sideC) / 2
        return (Math.sqrt(formula * (formula - sideA) * (formula - sideB) * (formula - sideC)) )
    }





}