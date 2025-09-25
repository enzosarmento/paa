package algorithms

fun sift(v: MutableList<Int>, i: Int, n: Int) {
    var left = 2 * i + 1
    var right = 2 * i + 2
    var greater = i

    if (left <= n && v[left] > v[i]) greater = left
    if (right <= n && v[right] > v[greater]) greater = right

    if (greater != i) {
        val aux = v[greater]
        v[greater] = v[i]
        v[i] = aux
        sift(v, greater, n)
    }
}

fun buildHeap(v: MutableList<Int>) {
    for (i in v.size / 2 downTo 0) {
        sift(v, i, v.size - 1)
    }
}

fun MutableList<Int>.heapSort() {
    buildHeap(this)
    for (i in this.size - 1 downTo 1) {
        val aux = this[i]
        this[i] = this[0]
        this[0] = aux
        sift(this, 0, i - 1)
    }
}