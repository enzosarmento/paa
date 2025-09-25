package utils

fun isOrdered(v: List<Int>): Boolean {
    for (i in 0..<v.size - 1) {
        if (v[i] > v[i + 1]) {
            return false
        }
    }
    return true
}