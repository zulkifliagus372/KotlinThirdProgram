package org.example.id.ac.polbeng.zulkifli_agus.test_kelas

open class NewRespon {
    open var age: Int = 1
}

class Ex16_InheritanceE {
    var age: Int = 1
        set(value) {
            field = if (value > 0) value else throw IllegalArgumentException("Age can not be negative")
        }
}
fun main() {
    val person = NewRespon()
    person.age = -5

    val checkedPerson = Ex16_InheritanceE()
    checkedPerson.age = -5
}