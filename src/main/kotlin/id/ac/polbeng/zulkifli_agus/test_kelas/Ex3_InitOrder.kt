package org.example.id.ac.polbeng.zulkifli_agus.test_kelas

class Ex3_InitOrder(name: String) {
    val firstProperty = "First Property : $name".also ( :: println )
    init {
        println("First initializer block that prints ${name}")
    }
    val secondProperty = "Second Property : ${name.length}".also(::println)
    init {
        println("Second initializer block that prints ${name.length}")
    }
}

fun main() {
    val initOrder = Ex3_InitOrder("RPL")
}