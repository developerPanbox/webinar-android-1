package com.panbox.webinarkotlin

data class Persona(val nombre:String,val apellidos:String,val dni:String, val genero:String) {

    fun trabajar():Unit{
        println("Estoy trabajando")
    }

}