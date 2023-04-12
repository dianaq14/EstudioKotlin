package com.dianaq.myapp

import java.time.Month

fun main(){
    getsemester(12)
}
fun result(value: Any){
    when(value){
        is Int -> value + value
        is String -> println(value)
        is Boolean -> if (value) print("hola")
    }
}

fun getsemester(month: Int) = when (month) {
        in 1..6 -> "primer semestre" //los .. se utilizan para los rangos
        in 7..12 -> "segundo semestre"
        !in 1..12 -> "no es un semestre valido"
        else ->  "isis"
    }

fun getTrimester(month: Int){
    when(month){
        1,2,3 -> print("primer trimestre")
        4,5,6 -> print("segundo trimestre")
        7,8,9 -> print("tercer trimestre")
        10,11,12 -> print("cuarto trimestre")
    }
}