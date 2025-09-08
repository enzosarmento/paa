package algorithms

fun MutableList<Int>.mergeSort(l: Int, r: Int) {
    if (l < r) {
        val m = (l + r) / 2
        mergeSort( l, m)
        mergeSort(m + 1, r)
        merge(this, l, m, r)
    }
}

fun merge(arr: MutableList<Int>, l: Int, m: Int, r: Int) {
    val leftArr = arr.subList(l, m + 1).toMutableList()
    val rightArr = arr.subList(m + 1, r + 1).toMutableList()
    leftArr.add(Int.MAX_VALUE)
    rightArr.add(Int.MAX_VALUE)

    var i = 0
    var j = 0
    for (k in l..r) {
        if (leftArr[i] <= rightArr[j]) {
            arr[k] = leftArr[i]
            i++
        } else {
            arr[k] = rightArr[j]
            j++
        }
    }
}