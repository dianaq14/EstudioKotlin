package com.dianaq.myapp

var age2: Int = 7

fun main() {
    showName()
    showAge(7)
    add(25, 76)
    val mySubstract = substract(46, 35)
    println(mySubstract)
}

fun showName() {
    println("Tengo una pug llamada Isis")
}

fun showAge(currentAge: Int) {
    println("tiene $currentAge años")
}

fun add(firsNumber: Int, secondNumber: Int) {
    println(firsNumber + secondNumber)
}

fun substract(firsNumber: Int, secondNumber: Int): Int {
    return firsNumber - secondNumber
}


fun variablesAlfaNumericas() {
    /**
     * Variables ALfanumericas
     */

    //Char
    val charExample1: Char = 'a'
    val charExample2: Char = '1'
    val charExample3: Char = '#'

    //String
    val stringExample: String = "Isis Ariel the pug"
    val stringExample2 = "4"
    val stringExample3 = "23"

    var stringConcatenada: String = "hola"
    stringConcatenada = "hola me llamo $stringExample y tengo $age2 años"
    print(stringConcatenada)
    val example123: String

//    print(stringExample2.toInt() + stringExample3.toInt())
}

fun variablesBoolean() {
    /**
     * Variables booleanas
     */

    //Boleean
    val booleanExample: Boolean = true
    val booleanExample2: Boolean = false
    val booleanExample3: Boolean = false
}

fun variablesNumericas() {
    /**
     * Variables Númericas
     */

    //Int soporta desde -2,147,483,647 a 2,147,483,647
    val age: Int = 30 //val es una constante
//    var age2: Int= 7 //var es una variable


    //Long
    val example: Long = 30

    //Float
    val floatExample: Float = 30.5f

    //Double
    val doubleExample: Double = 3241.3123123

    println("sumar:")
    println(age + age2)

    println("Restar")
    println(age - age2)

    println("Multiplicar")
    println(age * age2)

    println("Division")
    println(age / age2)

    println("Modulo")
    println(age % age2)

}