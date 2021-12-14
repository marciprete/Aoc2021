package day03

import org.junit.jupiter.api.Test
import java.io.File

/**
 *
 * @author Michele Arciprete
 *
 * @since 0.0.1-SNAPSHOT
 */
internal class LifeSupportRatingTest {

    @Test
    fun evaluate() {
//        val bits = listOf("00100", "11110", "10110", "10111", "10101", "01111", "00111", "11100", "10000", "11001", "00010", "01010")
        val bits = File("inputs/03/input.txt").readLines()
        val lsr = LifeSupportRating(bits)
        println(lsr.evaluate())
    }
}
