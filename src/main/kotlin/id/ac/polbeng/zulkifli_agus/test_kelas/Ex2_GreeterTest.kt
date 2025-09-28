package org.example.id.ac.polbeng.zulkifli_agus.test_kelas

/*fun main() {
    val greeter = Ex1_Greeter()
    greeter.greet()
}*/

fun main() {
    val greeter = Ex1_Greeter()
    greeter.greet()
    greeter.text = "Hi"
    greeter.greet("Anton")
    greeter.greet("Budi")
    greeter.text = "Hello programmer"
    println(greeter.with_ret_val("Dono"))
}