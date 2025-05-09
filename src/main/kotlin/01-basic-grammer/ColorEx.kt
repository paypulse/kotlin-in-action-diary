package `01-basic-grammer`

enum class ColorEx (
    val r:Int, val g:Int, val b:Int  // 상수의 프로퍼티를 정의 한다.
) {

    RED(255,0,0),
    ORANGE(255,165,0),
    YELLOW(255,255,0),
    INDIGO(75,0,130);

    fun rgb() = (r * 256 + g) * 256 + b


}