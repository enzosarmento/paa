import algorithms.buildHeap
import algorithms.heapSort
import algorithms.mergeSort

fun main() {
    val v = mutableListOf(14, 14, 9, 16, 8, 9, 1, 7, 5, 7, 12)
    println(v)
    buildHeap(v)
    println(v)
}