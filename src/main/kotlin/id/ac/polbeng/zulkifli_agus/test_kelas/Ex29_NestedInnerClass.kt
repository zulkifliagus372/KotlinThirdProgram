package org.example.id.ac.polbeng.zulkifli_agus.test_kelas

class Outer {
    val a = "Outside Nested class."
    class Nested {
        val b = "Inside Nested class."
        fun callMe() = "function call from inside Nested class."
    }
}
fun main(args: Array<String>) {
    println(Outer.Nested().b)

    val nested = Outer.Nested()
    println(nested.callMe())
}