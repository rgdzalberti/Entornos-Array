import java.util.*

fun main() {

    //Creo los vectores
    val vector1 =  Vector<Int>();
    val vector2 =  Vector<Int>();

    //Column - Row
    val matriz = Array(2) {Array(5) {0} }


    println("A continuación introduce los valores de los vectores")
    for (i in 0..4) {print("Valor [$i]: "); var input = readLine() ;vector1.add(input?.toInt())}
    println("-----Segundo vector-----")
    for (i in 0 until 4) {print("Valor [$i]: "); var input = readLine() ;vector2.add(input?.toInt())}

    //Meto los valores de los vectores en la matriz

    for (i in 0..4) {matriz[0][i] = vector1[i]}
    for (i in 0..3) {matriz[1][i] = vector2[i]}


    //Muestro la matriz
    println("")
    for (j in 0 until 2) {
        for (i in 0 until 5) {print("["); print(matriz[j][i]); print("] "); if (i == 4) {println("")}}
    }

}