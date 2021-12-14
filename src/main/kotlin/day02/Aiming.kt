package day02

/**
 *
 * @author Michele Arciprete
 *
 * @since 0.0.1-SNAPSHOT
 */
class Aiming: Dive() {
    var aim = 0;

    override fun move(to: String, amount: Int)  {
        when (Movement.valueOf(to)) {
            Movement.forward -> {
                horizontalPosition += amount
                depth = depth + (aim*amount)
            }
            Movement.down -> {
                aim += amount
            }
            Movement.up -> {
                aim -= amount
            }
        }
    }
}
