package day02

/**
 *
 * @author Michele Arciprete
 *
 * @since 0.0.1-SNAPSHOT
 */
open class Dive {
    public var horizontalPosition = 0;
    public var depth = 0;

    fun evaluateCoordinates(strings: List<String>) {
//        var strings = listOf("forward 2", "down 3", "up 1", "forward 5", "down 1", "up 2")
        strings.map {
            val pair = it.split(" ")
            move(pair[0], pair[1].toInt())
        }
    }

    fun multiplied(): Int {
        return horizontalPosition * depth
    }

    open fun move(to: String, amount: Int) {
        when(Movement.valueOf(to)) {
            Movement.forward -> horizontalPosition += amount
            Movement.down -> depth += amount
            Movement.up -> depth -= amount
        }
    }

    enum class Movement {
        forward,
        up,
        down
    }
}
