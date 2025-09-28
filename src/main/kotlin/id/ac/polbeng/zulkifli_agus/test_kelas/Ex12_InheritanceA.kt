package org.example.id.ac.polbeng.zulkifli_agus.test_kelas

open class Computer(val name: String, val brand: String) {

}

class Ex12_inheritanceA(name: String, brand: String, val batteryLife: Double): Computer(name, brand) {
    fun info() {
        println("Name : $name")
        println("Brand : $brand")
        println("Battery Life : $batteryLife")
    }
}
fun main() {
    val myLaptop = Ex12_inheritanceA("Lenovo Thinkpad x260", "Lenovo", 2.5)
    println(myLaptop.info())
}