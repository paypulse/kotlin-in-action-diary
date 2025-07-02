import `01-basic-grammer`.*
import `10-Bonus-class`.Bonus

fun main(args: Array<String>){
    val test = Basic();
    test.language.add("test")
    println("check.Test.:"+ test.nane)
    println("check.val.array:"+test.language)
    println("check.val." + test.checkValue)

    val bonusPrint = Bonus()
    println("check.uuid :"+ bonusPrint.uuidNoDash)

    /**
     * 문자열 템플릿
     * */
    val name  = if(args.size >0) args[0] else "Kotlin"
    print("Hello, $name!!")
    println("안녕 $name 님 반가워요")

    /**
     * 클래스와 프로퍼티
     * */
    val Person = Person("Bob", true)
    println("이름 : "+Person.name)
    println("결혼 유무 : "+Person.isMarried)

    /**
     * enum class
     * */
    println(ColorEx.ORANGE.rgb())


    /**
     * When
     * */
    val colorMix = ColorMix()
    println(colorMix.mix(Color.RED, Color.YELLOW))

    /**
     * 인자가 없는 when
    * */
    println(colorMix.mixOptimized(Color.BLUE, Color.YELLOW))



}