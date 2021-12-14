package day03

/**
 *
 * @author Michele Arciprete
 *
 * @since 0.0.1-SNAPSHOT
 */
class PowerConsumption {
    var gamma = ""
    var epsilon = ""

    fun calculatePowerConsumption(bits: List<String>): Int {
        val transposed = transpose(bits)
        gamma = transposed.map {
            mostCommon( bitCounts(it) )
        }.joinToString(separator = "")
        epsilon = gamma.map { neg(it) }.joinToString(separator = "")

        return Integer.parseInt(gamma, 2) * Integer.parseInt(epsilon, 2)
    }

    companion object Utils {
        fun transpose(bits: List<String>): List<List<Char>> {
            val bitList = bits.map { it.toList() }
            var transposed = mutableListOf<List<Char>>()
            for (i in 0..bitList.get(0).size - 1) {
                transposed.add(bitList.map { it.get(i) }.toList())
            }
            return transposed
        }

        fun neg(char: Char) = if (char.equals('0')) '1' else '0'

        fun bitCounts(bits: List<Char>): Pair<Int, Int> {
            val (ones, zeroes) = bits.partition { it == '1' }
            return Pair (ones.size , zeroes.size)
        }

        fun mostCommon(bits: Pair<Int, Int>): Char {
            when {
                bits.first >= bits.second -> return '1'
                else -> return '0'
            }
        }
    }







}
