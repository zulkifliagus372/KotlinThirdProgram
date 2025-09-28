package org.example.id.ac.polbeng.zulkifli_agus.test_kelas

open class Teacher() {
    open fun teach() {
        println("Teaching...")
    }
    fun info() {
        println("I`am a Teacher.")
    }
}

class Ex14_InheritanceC : Teacher() {
    override fun teach() {
        println("Teaching Maths...")
    }
}
fun main() {
    val teacher = Teacher()
    val mathsTeacher = Ex14_InheritanceC()
    mathsTeacher.info()
    teacher.teach()
    mathsTeacher.teach()
}