package org.example.id.ac.polbeng.zulkifli_agus.test_kelas

import java.security.PrivateKey

private class privateExample {
    private val i = 1
    private fun doSomething() {
        println("Welcome to Private Access!")
        println("Private Access : $i")
    }
    fun calldoSomething() {
        doSomething()
    }
}
open class C {
    protected val i = 1
}
class D : C() {
    fun getValue() : Int {
        println("Welcome to Proctected Access!")
        return i
    }
}
class internalExample {
    internal val i = 1
    internal fun doSomething() {
        println("Welcome to Internal Access!")
        println("Internal Access : $i")
    }
}
class publicExample {
    val i = 1
    fun doSomething() {
        println("Welcome to Public Access!")
        println("Public Access : $i")
    }
}
fun main() {
    val objPrivate = privateExample()
    objPrivate.calldoSomething()

    val objProctected = D()
    println(println("Protected Access : ${objProctected.getValue()}"))

    val objInternal = internalExample()
    objInternal.doSomething()

    val objPublic = publicExample()
    objPublic.doSomething()
}