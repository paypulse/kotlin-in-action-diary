package `01-basic-grammer`

class Basic {
    val nane: String = "test 이름 입니다."
    var isMarried: Boolean = false

    /**
     * val 참조 자체는 불변일지라도, 그 참조가 가리키는 객체의 내부 값은
     * 변경 될 수 있다. -> array의 경우 값을 더 추가 할 수는 있다.
     * 하지만, array안에 처음 초기된 값을 변경 하기 어렵다.
     *
     * **/

    val language = arrayListOf("JAVA")
    val checkValue = "100"
    //checkValue = "200" <-- 이건 오류




}