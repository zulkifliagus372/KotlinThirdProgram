package org.example.id.ac.polbeng.zulkifli_agus.test_kelas

class Ex9_PersonF(val firstName: String, val lastName: String) {
    init {
        println("Sedang inisialisasi wak!")
    }
    constructor(_firstName: String, _lastName: String, _age: Int): this(_firstName, _lastName) {
        println("Name : $_firstName $_lastName")
        println("Age : $_age")
        println()
    }
    constructor(_firstName: String, _lastName: String, _country: String): this(_firstName, _lastName) {
        println("Name : $_firstName $_lastName")
        println("Country : $_country")
        println()
    }
    constructor(_firstName: String, _lastName: String, _age: Int, _country: String): this(_firstName, _lastName, _age) {
        println("Name : $_firstName $_lastName")
        println("Age : $_age")
        println("Country : $_country")
    }
}
fun main() {
    val anton = Ex9_PersonF("Anton", "Sejati")
    val budi = Ex9_PersonF("Budi", "Gunawan", 21)
    val caca = Ex9_PersonF("Caca", "Andika", "Indonesia")
    val dono = Ex9_PersonF("Dono", "Putri", 25, "Indonesia")
}