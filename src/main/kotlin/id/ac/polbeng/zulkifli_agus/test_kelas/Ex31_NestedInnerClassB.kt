package org.example.id.ac.polbeng.zulkifli_agus.test_kelas

fun main() {
    val programmer: Human = object : Human {
        override fun think() {
            print("I am an example of Anonymous Inner Class")
        }
    }
    programmer.think()
}
interface Human {
    fun think()
}