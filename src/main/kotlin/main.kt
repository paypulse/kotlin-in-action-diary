import `01-basic-grammer`.Basic
import `10-Bonus-class`.Bonus

fun main(){
    val test = Basic();
    test.language.add("test")
    println("check.Test.:"+ test.nane)
    println("check.val.array:"+test.language)
    println("check.val." + test.checkValue)

    val bonusPrint = Bonus()
    println("check.uuid :"+ bonusPrint.uuidNoDash)

}