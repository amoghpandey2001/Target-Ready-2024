package org.example.com.targetindia.model

class Person(var name: String, var city: String = "Bangalore", var email: String) {

//    constructor()

    fun getAsCsv(): String {
        return "$name,$city,$email"
    }

    fun getAsJson(): String {
        return """{
            |"name": "$name",
            |"city": "$city",
            |"email": "$email"
            |}""".trimMargin()
    }

    fun print(): Unit {
        println("Name    : $name")
        println("City    : $city")
        println("Email   : $email")
    }
}