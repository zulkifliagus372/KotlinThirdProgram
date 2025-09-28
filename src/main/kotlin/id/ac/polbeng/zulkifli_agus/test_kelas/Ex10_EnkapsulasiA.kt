package org.example.id.ac.polbeng.zulkifli_agus.test_kelas

class Ex10_EnkapsulasiA(_id: Int, _name: String, _age: Int) {
    val id: Int = _id
        get() = field

    var name: String = _name
        get() = field
        set(value) {
            field = value
        }

    var age: Int = _age
        get() = field
        set(value) {
            field = value
        }
}

fun main() {
    val emp = Ex10_EnkapsulasiA(1101, "Jono", 25)
    println("Id : ${emp.id}, Nama ${emp.name}, Umur ${emp.age}")
}