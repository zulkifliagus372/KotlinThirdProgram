package org.example.id.ac.polbeng.zulkifli_agus.test_kelas

class Ex8_PersonE {
    var firstName: String
    var lastName: String
    var age: Int = 25
    constructor(_firstName:String, _lastName:String) {
        firstName = _firstName
        lastName = _lastName
    }
    constructor(_firstName:String, _lastName:String, _age:Int): this(_firstName, _lastName) {
        age = _age
    }
    fun cetakInfo() {
        println("Name : ${firstName} ${lastName}")
        println("Age : ${age}")
    }
}

fun main() {
    val anton = Ex8_PersonE("Frank", "Lampard")
    anton.cetakInfo()
    println()
    val budi = Ex8_PersonE("Budi", "Gunawan", 21)
    budi.cetakInfo()
}