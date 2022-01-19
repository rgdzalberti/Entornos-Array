import java.util.*

fun main() {

    //Creo los vectores y los meto en una lista para despues poder meterlos con un bucle y no a mano.
    val vector1 =  Vector<Int>();
    val vector2 =  Vector<Int>();
    val listaVectores = mutableListOf<Vector<Int>>()
    listaVectores.add(vector1); listaVectores.add(vector2)

    //Row - Column
    val matriz = Array(4) { IntArray(1) }

    println("A continuación introduce los valores de los vectores")
    for (i in 0..4) {print("Valor [$i]: "); var input = readLine() ;vector1.add(input?.toInt())}
    println("-----Segundo vector-----")
    for (i in 0 until 4) {print("Valor [$i]: "); var input = readLine() ;vector2.add(input?.toInt())}

    //Meto los valores de los vectores en la matriz
    for (j in 0 until 2) {
        for (i in 0 until vector1.size) { matriz[j][i] = (listaVectores[j].elementAt(i))}
    }

    //Muestro la matriz
    for (j in 0 until 2){
        for (i in 0 until matriz.size) {println(matriz[j][i])}
    }
}