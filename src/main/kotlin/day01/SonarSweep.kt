package day01

import java.io.File

/**
 *
 * @author Michele Arciprete
 *
 * @since 0.0.1-SNAPSHOT
 */
class SonarSweep {
    fun countIncreases(numbers: List<Int>): Int {
        return numbers.zipWithNext{a,b -> b.compareTo(a)}.filter{ it > 0}.size
    }
}
