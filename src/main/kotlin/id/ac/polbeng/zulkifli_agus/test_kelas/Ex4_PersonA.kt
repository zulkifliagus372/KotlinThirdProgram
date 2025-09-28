package org.example.id.ac.polbeng.zulkifli_agus.test_kelas

class Ex4_PersonA(_firstName: String, _lastName: String, _age: Int) {
    var firstName: String
    var lastName: String
    var age: Int
    init {
        firstName = _firstName
        lastName = _lastName
        age = _age
    }
}

fun main() {
    val budi = Ex4_PersonA("Budi", "Gunawan", 21)
    println("Name : ${budi.firstName} ${budi.lastName}")
    println("Age : ${budi.age}")
}