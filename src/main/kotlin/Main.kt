import java.util.*

fun main() {

    //Creo los vectores
    val vector1 =  Vector<Int>();
    val vector2 =  Vector<Int>();

    //Row - Column
    val matriz = Array(4) { IntArray(1) }


    println("A continuación introduce los valores de los vectores")
    for (i in 0..4) {print("Valor [$i]: "); var input = readLine() ;vector1.add(input?.toInt())}
    println("-----Segundo vector-----")
    for (i in 0 until 4) {print("Valor [$i]: "); var input = readLine() ;vector2.add(input?.toInt())}

    //Meto los valores de los vectores en la matriz

    for (i in 0..4) {matriz[0][i] = vector1[i]}
    for (i in 0..3) {matriz[1][i] = vector1[i]}


    //Muestro la matriz
    /*
    for (j in 0 until 2){
        for (i in 0 until matriz.size) {println(matriz[j][i])}
    }

     */
    for (i in matriz.indices) {
        println(matriz[i].contentToString())
    }
}