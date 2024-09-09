fun main() {

    val square: Square = Square("Square")
    val circle: Circle = Circle("Circle")
    val Triangle: Triangle = Triangle("Triangle")
    val equilateralTriangle: EquilateralTriangle = EquilateralTriangle("EquilateralTriangle")

    println("Enter Length and height for the square: ")
    val length = readLine()!!.toDouble()
    val height = readLine()!!.toDouble()
    square.setDimensions(length, height)

    println("Enter radius for the circle:")
    val radius = readLine()!!.toDouble()
    circle.setDimensions(radius)

    println("Enter 3 sides for the triangle:")
    val a = readLine()!!.toDouble()
    val b = readLine()!!.toDouble()
    val c = readLine()!!.toDouble()
    Triangle.SetDimensions(a, b, c)

    println("Enter side for the equilateral triangle:")
    val side = readLine()!!.toDouble()
    equilateralTriangle.setDimensions(side)

    // Print dimensions and area
    val shapes = listOf(square, circle, Triangle, equilateralTriangle)
    for (shape in shapes) {
        println("Shape: ${shape.name}")
        shape.printDimensions()
        println("Area: ${shape.getArea()}")
        println()
    }
}