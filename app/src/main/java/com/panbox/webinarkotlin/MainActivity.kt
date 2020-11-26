package com.panbox.webinarkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Definir variables mutables
        var nombres = "Juan Jose"
        var edad = 31
        var precio = 200.0
        var condicion = true

        nombres = "Juan Jose Ledesma"

        //Definir variables immutables
        val pi:Double = 3.1415


        //Inputs = 2 numeros , Anotacion CamelCase
        val numeroUno = 20
        val numeroDos = 30

        //Procesamiento
        val resultadoSuma = numeroUno + numeroDos

        //Output
        println("Hola")
        println("$resultadoSuma")

        //Input = nombres
        val nombresPersona = "Juan Jose"

        //Procesamiento + Output  < >
        println("Hola $nombresPersona")

        //Condicionales - if
        val edadPersona = 31

        if(edadPersona >= 18){

            //Bloque de codigo
            println("Es mayor de edad")
        }
        else{
            //Bloque de codigo
            println("Es menor de edad")
        }

        val respuesta = if(edadPersona >= 18) "Es mayor de edad" else "Es menor de edad"
        println(respuesta)


        val numeroSemana = 5

        //WHEN  < > //Ejercicio1
        when(numeroSemana){

            1 -> println("Lunes")
            2 -> println("Martes")
            3 -> println("Miercoles")
            4 -> println("Jueves")
            5 -> println("Viernes")
            6 -> println("Sabado")
            7 -> println("Domingo")
            else -> println("El input del dia de la semana es incorrecto")
        }

        val respuestaSemana = when(numeroSemana){

            1 -> "Lunes"
            2 -> "Martes"
            3 -> "Miercoles"
            4 -> "Jueves"
            5 -> "Viernes"
            6 -> "Sabado"
            7 -> "Domingo"
            else -> "El input del dia de la semana es incorrecto"
        }

        println(respuestaSemana)

        println(when(numeroSemana){

            1 -> "Lunes"
            2 -> "Martes"
            3 -> "Miercoles"
            4 -> "Jueves"
            5 -> "Viernes"
            6 -> "Sabado"
            7 -> "Domingo"
            else -> "El input del dia de la semana es incorrecto"
        })


        //Ejercicio2
        val anioNacimiento = 1989

        if(anioNacimiento in 1930 .. 1948){
            println("Silent Generation")
        }
        else if(anioNacimiento in 1949 .. 1968){
            println("Baby Boom")
        }
        else if(anioNacimiento in 1969 .. 1980){
            println("Generation X")
        }
        else if(anioNacimiento in 1981 .. 1993){
            println("Generation Y")
        }
        else if(anioNacimiento in 1994 .. 2010){
            println("Generation Z")
        }
        else{
            println("No perteneces a ninguna generacion")
        }


        //Loops
        for(numero in 1..10){
            println(numero)
        }

        for(numero in 1 until 10){
            println(numero)
        }

        for(numero in 0 .. 10 step 2){
            println(numero)
        }

        for(numero in 10 downTo 0 step 2){
            println(numero)
        }

        //Funciones

        println(sumar(50,20))
        println(saludar("Juan Jose"))
        imprimir("Hola como estas")

        //Listas Immutables
        val listaImmutable  = listOf("Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo")

        //Imprimir el valor Jueves
        println(listaImmutable[3])

        //Imprimir el valor Lunes
        println(listaImmutable[0])
        println(listaImmutable.first())
        println(listaImmutable[6])
        println(listaImmutable.last())

        //Imrpimir el numero de elementos de la lista / tamaño de la lista
        println(listaImmutable.size)

        //Recorrer la lista y mostrar cada elemento
        //"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"
        for(diaDeLaSemana in listaImmutable){
            println(diaDeLaSemana)
        }

        listaImmutable.forEach {
            println(it)
        }

        //Listas mutables
        var listaNotas = mutableListOf(20,17,18,15)

        println(listaNotas.size)

        //20,17,18,15
        for(nota in listaNotas){
            println(nota)
        }

        //Agregar una nota adicional
        listaNotas.add(19)

        for(nota in listaNotas){
            println(nota)
        }

        listaNotas.forEach{
            println(it)
        }

        val listaFiltrada = listaNotas.filter {
            it % 2 == 0
        }

        println(listaFiltrada)

        //Null Safety
        var academia : String? = "Panbox"

        academia = null

        //Operador Elvis
        val numeroCaracteres = academia?.length  ?: 0
        println(numeroCaracteres)

        println(academia?.length)


        //Creamos un objeto Persona
        val personaUno = Persona("Juan Jose","Ledesma","469089789","Masculino")
        val personaDos = Persona("Rodrigo","Ledesma","78987898","Masculino")

        println(personaUno.dni)
        println(personaUno.nombre)
        println(personaDos.genero)
        println(personaDos.nombre)
        personaUno.trabajar()
    }

    //Funcion que reciba 2 numeros y nos de la suma de ambas
    fun sumar(numeroUno:Int, numeroDos:Int):Int{
        return numeroUno + numeroDos  //70
    }

    //Funcion que reciba el nombre de una persona y nos muestre un saludo
    fun saludar(nombre:String):String{
        return "Hola $nombre"
    }
    //"Hola como estas"
    fun imprimir(mensaje:String):Unit{
        println(mensaje)
    }
}

