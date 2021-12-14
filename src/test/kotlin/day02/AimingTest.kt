package day02

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.io.File

/**
 *
 * @author Michele Arciprete
 *
 * @since 0.0.1-SNAPSHOT
 */
internal class AimingTest {

    @Test
    fun move() {
        val dive = Aiming()
        dive.evaluateCoordinates(File("inputs/02/input.txt").readLines())
        println (dive.multiplied())
    }
}
