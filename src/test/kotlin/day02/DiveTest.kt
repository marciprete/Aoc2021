package day02

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.io.File

/**
 *
 * @author Michele Arciprete
 *
 * @since 0.0.1-SNAPSHOT
 */
internal class DiveTest {

    @Test
    fun move() {
        val dive = Dive()
        dive.evaluateCoordinates(File("inputs/02/input.txt").readLines())
        println (dive.multiplied())
    }
}
