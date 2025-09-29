package org.example.id.ac.polbeng.zulkifli_agus.test_kelas

open class MyBase {
    open fun think() {
        println("Hey!! i am thinking")
    }
}
class MyDerived : MyBase() {
    override fun think() {
        println("I am from Child")
    }
}
fun main() {
    val myBase = MyBase()
    myBase.think()
    var myDerived = MyDerived()
    myDerived.think()
}