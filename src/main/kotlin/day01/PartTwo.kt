package day01

import java.io.File

/**
 *
 * @author Michele Arciprete
 *
 * @since 0.0.1-SNAPSHOT
 */
class PartTwo {

    fun slidedIncreases(numbers: List<Int>): Int {
        val sweep = SonarSweep()
        return sweep.countIncreases(numbers.windowed(3) {it.sum()})
    }
}
