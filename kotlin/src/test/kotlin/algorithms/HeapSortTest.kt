package algorithms

import org.junit.jupiter.api.RepeatedTest
import org.junit.jupiter.api.Test
import utils.isOrdered
import kotlin.random.Random

class HeapSortTest {

    private val v = MutableList(11) {
        Random.nextInt(1, 100)
    }

    @Test
    fun `test function heapsort`() {
        v.heapSort()
        val result = isOrdered(v)
        assert(result)
    }

    @RepeatedTest(10000)
    fun `test function build heap`() {
        buildHeap(v)
        val result = verifyHeap(v)
        assert(result)
    }

    private fun verifyHeap(v: List<Int>): Boolean {
        for (i in 0..<v.size / 2) {
            if (v[i] < v[2 * i + 1] || v[i] < v[2 * i + 2]) {
                return false
            }
        }
        return true
    }
}