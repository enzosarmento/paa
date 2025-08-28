import algorithms.bubbleSort
import algorithms.shakerSort

fun main() {
    val list = MutableList(15) { (1..1000).random() }
    println(list)
    list.bubbleSort()
    println(list)
}