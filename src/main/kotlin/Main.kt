import java.util.*

fun main() {

    val vector1 =  Vector<Int>();
    val vector2 =  Vector<Int>();

    //Son las constantes que usaré en la fórmula siguiente.
    val c1: Int = 5;
    val c2: Int = 6;

    println("A continuación introduce la longitud de los vectores")
    println("-----Primer vector-----")
    print("Longitud: ");var inputv1 = readLine()?.toInt()!!
    for (i in 0 until inputv1) {var valor = i * 2 + c1 ;vector1.add(valor.toInt())}
    println("-----Segundo vector-----")
    print("Longitud: ");var inputv2 = readLine()?.toInt()!!
    for (i in 0 until inputv2) {var valor = i * 2 + c2 ;vector2.add(valor.toInt())}

    //Utilizaré longitud para comprobar cual de los dos vectores es más largo y así en los siguientes bucles saber cuando parar
    var longitud = inputv1
    if (inputv1<inputv2) {longitud = inputv2}

    //Column - Row
    val matriz = Array(2) {Array(longitud) {0} }

    //Meto los valores de los vectores en la matriz

    for (i in 0 until inputv1) {matriz[0][i] = vector1[i]}
    for (i in 0 until inputv2) {matriz[1][i] = vector2[i]}

    //Muestro la matriz
    println("")
    for (j in 0 until 2) {
        for (i in 0 until longitud) {print("["); print(matriz[j][i]); print("] "); if (i == longitud - 1) {println("")}}
    }

}