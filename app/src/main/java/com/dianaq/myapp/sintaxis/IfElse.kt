package com.dianaq.myapp

fun main(){
    ifMultipleOR()
}

fun ifMultipleOR(){
    var pet = "cat"
    var ishappy =true

    if(pet =="dog"|| (pet =="cat" && ishappy)){
        println("es un gato o un perro")
    }
}

fun ifMultiple(){
    var age= 18
    var parentPermission= false
    var imHappy = true

    if(age>=18 && parentPermission && imHappy){
        println("puedo beber cerveza")
    }


}

fun ifInt(){
    var age =30

    if (age >= 18 ){
        println("beber cerveza")
    }else {
        println("beber jugo")
    }
}

fun ifBoolean(){
    var soyfeliz: Boolean =true

    //sin nada ==true
    //con ! al inicio == false

    if(!soyfeliz){
        print("estoy triste :(")
    }
}

fun ifAnidado() {
    val animal = "dog"

    if (animal == "dog") {
        println("es un perrito")
    } else if (animal == "cat") {
        println("es un gato")
    } else if (animal == "bird") {
        println("es un pajaro")
    } else {
        println("No es uno de los animales esperados")
    }
}

fun ifBasico(){
    val name ="Isis"

    if(name=="Isis"){
        println("oye, la variable name es Isis")
    } else {
        println("esta no es Isis")
    }
}