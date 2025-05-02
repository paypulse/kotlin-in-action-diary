package `10-Bonus-class`

import java.util.UUID

class Bonus {

    //1. 랜덤 UUID 생성
    val uuid1: UUID = UUID.randomUUID();

    //2. 문자열 형태로 사용
    val uuidStr: String = UUID.randomUUID().toString();

    //3. 대시 (-) 없는 UUID
    val uuidNoDash: String = UUID.randomUUID().toString().replace("-","")


}