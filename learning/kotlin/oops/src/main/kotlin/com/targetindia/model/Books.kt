package org.example.com.targetindia.model

class Book(var name:String="" ,var price:Double=0.0){
    override fun toString(): String {
        return "name of book is $name and price is $price";
    }
}