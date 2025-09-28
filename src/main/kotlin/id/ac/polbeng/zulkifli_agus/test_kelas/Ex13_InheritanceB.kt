package org.example.id.ac.polbeng.zulkifli_agus.test_kelas

class Ex13_InheritanceB : Computer {
    val batteryLife : Double

    constructor(name: String, brand: String, batteryLife: Double): super(name, brand) {
        this.batteryLife = batteryLife
    }
    constructor(name: String, brand: String): this(name, brand, 0.0) {}

    fun info() {
        println("Name : $name")
        println("Brand : $brand")
        println("Battery Life : $batteryLife")
    }
}

fun main() {
    val myLaptop = Ex13_InheritanceB("Lenovo Thinkpad", "Lenovo")
    println(myLaptop.info())
}