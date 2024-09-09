class Circle(_name: String): Shape(_name) {

    var radius = 0.0

    fun setDimensions(radius: Double){
        this.radius = radius
    }

    override fun printDimensions() {
        println("Radius $radius")
    }

    override fun getArea(): Double {

        return Math.PI * (2 * radius)
    }

}