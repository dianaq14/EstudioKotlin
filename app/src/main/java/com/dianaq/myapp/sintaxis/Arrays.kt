package com.dianaq.myapp

/**
 * ARRAY o ARREGLO, son secuencias de datos, una estructura que nos permite almacenar varias variablesd e forma seguida
 */

fun main(){

    //idice [0-6] de 0-6
    //tamaño (size)7
    val weekDays= arrayOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")
    println(weekDays[5])
    println(weekDays.size)

    //TAMAÑOS

    if (weekDays.size >=8) {
        println(weekDays[7])
        }else {
            println("no hay mas valores en el arrayS")
    }

    //MODIFICAR VALORES
    weekDays[0]="Feliz Lunes"
    println(weekDays[0])


//BUCLES PARA ARRAYS= un bucle nos permite recorre un array

    for (position in weekDays.indices){
        println(weekDays[position])
    }
    for ((postion,value) in weekDays.withIndex()) {
        println("la posicion $postion, contiene $value")
    }
    for(weekDay in weekDays){
        println("Ahora es $weekDay")
    }
}


