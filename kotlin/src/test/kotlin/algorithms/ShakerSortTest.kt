package algorithms

import org.junit.jupiter.api.RepeatedTest
import utils.isOrdered
import kotlin.random.Random
import kotlin.test.Test

class ShakerSortTest {

    private val v = MutableList(20) {
        Random.nextInt(1, 100)
    }

    @RepeatedTest(1000)
    fun `test function shaker sort`() {
        v.shakerSort()
        val result = isOrdered(v)
        assert(result)
    }
}