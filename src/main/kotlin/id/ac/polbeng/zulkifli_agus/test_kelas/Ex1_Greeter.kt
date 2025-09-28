package org.example.id.ac.polbeng.zulkifli_agus.test_kelas

/*class Ex1_Greeter {
    fun greet() {
        println("Hello object world!")
    }
}*/

class Ex1_Greeter {
    var text: String = ""
    fun greet() {
        println("Hello object world!")
    }
    fun greet(name: String) {
        println("$text $name")
    }
    fun with_ret_val(name: String): String {
        return "$text $name"
    }
}