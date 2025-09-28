package org.example.id.ac.polbeng.zulkifli_agus.test_kelas

class Ex6_PersonC(var firstName: String, var lastName: String, var age: Int) {}

fun main(){
    val budi = Ex6_PersonC("Budi", "Gunawan", 21)
    println("Name : ${budi.firstName} ${budi.lastName}")
    println("Age : ${budi.age}")
}

