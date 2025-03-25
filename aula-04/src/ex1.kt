fun main() {
    var list = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var listNumerosDuplicados = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var listSemImpar = mutableListOf(2, 4, 6, 8, 10)
    var listStringsMinusculas = mutableListOf("one", "two", "three", "four", "five", "six")

    println(calcMedia(mutableList = list))

    println(numPares(mutableList = list))

    println(removeInteirosDuplicados(mutableList = listNumerosDuplicados))

    println(removeUltimoImpar(mutableList = listSemImpar))

    println(retornaStringsMaiusculas(mutableList = listStringsMinusculas))

    println("tesT".maiuscular())

    println("10,00".addCifrao())

}

// ex 1
fun calcMedia(mutableList: MutableList<Int>): Int {
    return mutableList.sum() / mutableList.size
}

// ex 2
fun numPares(mutableList: MutableList<Int>): MutableList<Int> {
    var lista = mutableListOf<Int>()

    for (num in mutableList) {
        if (num % 2 == 0)
            lista.add(num)
    }

    return lista
}

// ex 3

fun removeInteirosDuplicados(mutableList: MutableList<Int>): MutableList<Int> {
    return mutableList.distinct().toMutableList()
}

// ex 4

fun removeUltimoImpar(mutableList: MutableList<Int>): Int? {
    val listaInvertida = mutableList.reversed();
    for (num in listaInvertida) {
        if (num % 2 != 0) {
            return num
        }
    }
    return null
}

// ex 5

fun retornaStringsMaiusculas(mutableList: MutableList<String>): MutableList<String> {
    val lista = mutableListOf<String>()
    for  (str in mutableList) {
        val strUppper = str.uppercase()
        lista.add(strUppper)
    }

    return lista
}

// ex 6

fun String.maiuscular(): String {
    return this.uppercase()
}

// ex 7
fun String.addCifrao() : String {
    return "R$ $this"
}
