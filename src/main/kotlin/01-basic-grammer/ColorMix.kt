package `01-basic-grammer`


class ColorMix {
    //when 분기에 따른 조건
    fun mix(c1: Color , c2: Color)  =
        when (setOf(c1, c2)) {
            setOf(Color.RED, Color.YELLOW) -> Color.ORANGE
            setOf(Color.YELLOW, Color.BLUE) -> Color.GREEN
            setOf(Color.BLUE, Color.VIOLET) -> Color.INDIGO
            else -> throw Exception("Dirty Color")
        }
}