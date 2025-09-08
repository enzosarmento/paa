import algorithms.mergeSort

fun main() {
    val list = mutableListOf(6, 8, 7, 9, 1, 5, 3, 11)
    println(list)
    list.mergeSort(0, list.size - 1)
    println(list)
}