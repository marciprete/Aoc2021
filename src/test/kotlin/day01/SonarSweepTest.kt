package day01

import org.junit.jupiter.api.Test
import java.io.File

/**
 *
 * @author Michele Arciprete
 *
 * @since 0.0.1-SNAPSHOT
 */
internal class SonarSweepTest {

    @Test
    fun main() {
        val d = SonarSweep()
        println (d.countIncreases(File("inputs/01/input.txt").readLines().map { it.toInt() }))
    }
}
