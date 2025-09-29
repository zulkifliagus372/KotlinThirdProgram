package org.example.id.ac.polbeng.zulkifli_agus.test_kelas

open class Rectangle {
    open fun draw() {
        println("From Base Class Rectangle")
    }
}
interface Polygon {
    fun draw() {
        println("From interface Polygon")
    }
}

class Square() : Rectangle(), Polygon {
    override fun draw() {
        super<Rectangle>.draw()
        super<Polygon>.draw()
    }
}
fun main() {
    val square = Square()
    square.draw()
}