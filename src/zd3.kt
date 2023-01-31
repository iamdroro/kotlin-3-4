fun main(){
    try{
    print("Введите число")
      var a =readLine()!!.toInt()
    when(a) {
        in 0..2 -> println("Младенец")
        in 3..5 -> println("Дошкольник")
        in 6..12 -> println("Школьник")
        in 13..19 -> println("Подросток")
        in 20..30 -> println("Начальная зрелость")
        in 31..60 -> println("Зрелость")
        in 61..115 -> println("Старость")
        else -> {
            println("Введите коректно возраст")
        }

    }

}catch(e:Exception){
    println("Некоректный ввод")
    }}