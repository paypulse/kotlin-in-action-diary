import `01-basic-grammer`.Basic
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


}