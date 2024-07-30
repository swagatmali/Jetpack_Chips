package com.jetpack_chips


object DummyData {


    fun getFilterOptions(): List<FilterOption> {
        val filterPairs: List<Pair<String, String>> =
            listOf(
                Pair("1", "A"),
                Pair("2", "B"),
                Pair("3", "C"),
                Pair("4", "D"),
                Pair("5", "E"),
                Pair("6", "F"),
                Pair("7", "G"),
                Pair("8", "H"),
                Pair("9", "I"),
                Pair("10", "J"),
            )

        return filterPairs.mapIndexed { index, (option, statementList) ->
            FilterOption(option, statementList, index == 0)
        }
    }

}