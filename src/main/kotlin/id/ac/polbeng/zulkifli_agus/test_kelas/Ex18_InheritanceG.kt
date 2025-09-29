package org.example.id.ac.polbeng.zulkifli_agus.test_kelas

open class Base(val name: String) {
    init {
        println("Initializing Base")
    }
    open val size: Int = name.length.also {
        println("Initializing Size in Base : $it")
    }
}

class Ex18_InheritanceG(name: String, val lastName: String) : Base(name.capitalize().also { println("Argument for Base: $it") }) {
    init {
        println("Initializing Derived")
    }
    override val size: Int = (super.size + lastName.length).also {
        println("Intiliazing Size in Derived : $it")
    }
}
fun main() {
    val turunan = Ex18_InheritanceG("Zulkifli", "Agus")
    turunan.size
}