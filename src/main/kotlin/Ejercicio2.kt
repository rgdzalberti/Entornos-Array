package Ejercicio2

import kotlin.random.Random

fun main(){

    var arrayAleatorios = mutableListOf<Int>()

    repeat (20) {arrayAleatorios.add(Random.nextInt(0, 100))}
    for (i in 0 until arrayAleatorios.size) {if (arrayAleatorios[i] % 2 == 0 ) {print("[");print(arrayAleatorios[i] ); print("]")}}
    println("")
    arrayAleatorios.sort(); println("Primer elemento: " + arrayAleatorios.first()); println("Último elemento: " + arrayAleatorios.last());
    println("Suma de elementos: " + arrayAleatorios.sum())

    arrayAleatorios.forEach { if (arrayAleatorios[it]%2 != 0) {arrayAleatorios.removeAt(it)} }

    print("Elementos del array restantes: "); for (i in 0 until arrayAleatorios.size) {print("[");print(arrayAleatorios[i] ); print("]")}

}