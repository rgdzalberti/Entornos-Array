package Ejercicio1

fun Boletin(nota: Int){

    when{

        nota<5 -> println("Suspenso")
        nota in (5 until 7) -> println("Aprobado")
        nota in (7..8) -> println("Notable")
        nota in (9..10) -> println("Sobresaliente")
        else -> println("El valor introducido no es correcto")

    }

}

fun main(){
    Boletin(6)
}