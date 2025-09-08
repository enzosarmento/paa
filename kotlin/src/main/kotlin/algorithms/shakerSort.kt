package algorithms

fun MutableList<Int>.shakerSort() {

    var beginning = 0
    var end = this.size - 1

    do {
        var swapped = false
        for (i in beginning..<end) {
            if (this[i] > this[i + 1]) {
                val aux = this[i]
                this[i] = this[i + 1]
                this[i + 1] = aux
                swapped = true
            }
        }

        if (!swapped) break


        end--
        beginning++
        swapped = false

        for (i in end downTo  beginning) {
            if (this[i] < this[i - 1]) {
                val aux = this[i]
                this[i] = this[i - 1]
                this[i - 1] = aux
                swapped = true
            }
        }


    } while (swapped)
}

fun MutableList<Int>.bubbleSort() {

    var end = this.size - 1

    do {
        var swapped = false

        for (i in 0..<end) {
            if (this[i] > this[i + 1]) {
                val aux = this[i]
                this[i] = this[i + 1]
                this[i + 1] = aux
                swapped = true
            }
        }

        end--
    } while (swapped)
}