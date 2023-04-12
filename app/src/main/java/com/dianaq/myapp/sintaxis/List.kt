package com.dianaq.myapp

//LISTAS

fun main(){
    mutableLis()
}

fun mutableLis(){
    val weekDays:MutableList<String> = mutableListOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")
    weekDays.add(0,"Isis Ariel")
    println(weekDays)

    if(weekDays.isEmpty()){
        //No voy a pintar nada
    }else {
        weekDays.forEach { println(it)}
    }

    if (weekDays.isNotEmpty()){
        weekDays.forEach { println(it)}
    }

    weekDays.last()
}

fun inmutableList(){
    val readOnly: List<String> = listOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")

    println(readOnly.size)
    println(readOnly)
    println(readOnly[2])
    println(readOnly.last())
    println(readOnly.first())

    //FILTRAR
    val example = readOnly.filter{it.contains("i") }
    println(example)

    //ITERAR
    readOnly.forEach {weekDay -> println(weekDay) }
}