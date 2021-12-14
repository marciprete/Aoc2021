package day03

import day03.PowerConsumption.Utils.mostCommon

/**
 *
 * @author Michele Arciprete
 *
 * @since 0.0.1-SNAPSHOT
 */
class LifeSupportRating {

    var report: List<String>

    constructor(report: List<String>) {
        this.report = report
    }

    fun oxygenGeneratorRating(report: List<String>): Int {
        return Integer.parseInt(reduceByMostCommon(report),2)
    }

    fun co2ScrubberRating(report: List<String>): Int {
        return Integer.parseInt(reduceByLeastCommon(report),2)
    }

    fun evaluate(): Int {
        return oxygenGeneratorRating(report) * co2ScrubberRating(report)
    }

    fun reduceByMostCommon(report: List<String>): String {
        return reduceToOneElement(report, true)
    }
    fun reduceByLeastCommon(report: List<String>): String {
        return reduceToOneElement(report, false)
    }

    private fun reduceToOneElement(report: List<String>, mostCommon: Boolean): String {
        var count = 0
        var subset = report
        while (subset.size > 1) {
            val transposed = PowerConsumption.transpose(subset)
            var bit = PowerConsumption.mostCommon(PowerConsumption.bitCounts(transposed.get(count)))
            if (!mostCommon) bit = PowerConsumption.neg(bit)
            subset = extractByBitAt(subset, bit, count)
            count++
        }
        return subset.get(0)
    }



    fun extractByBitAt(list: List<String>, bit: Char, pos: Int): List<String> {
        return (list.filter { it[pos].equals(bit) }).toList()
    }

}
