package org.example.id.ac.polbeng.zulkifli_agus.test_kelas

class Ex7_PersonD {
    var firstName: String
    var lastName: String
    var age:Int
    constructor(_firstName: String, _lastName: String, _age: Int) {
        firstName = _firstName
        lastName = _lastName
        age = _age
    }
}

fun main() {
    val budi = Ex7_PersonD("Budi", "Gunawan", 21)
    println("Name : ${budi.firstName} ${budi.lastName}")
    println("Age : ${budi.age}")
}