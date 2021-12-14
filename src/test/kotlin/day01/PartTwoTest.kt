package day01

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.io.File

/**
 *
 * @author Michele Arciprete
 *
 * @since 0.0.1-SNAPSHOT
 */
internal class PartTwoTest {

    @Test
    fun slidedIncreases() {
        val toTest = PartTwo()
        toTest.slidedIncreases(File("inputs/01/input.txt").readLines().map { it.toInt() })
    }
}
