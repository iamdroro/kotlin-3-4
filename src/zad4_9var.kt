fun main(){
try{
    print("Введите число")
    var x =readLine()!!.toInt()
   when{
       (x<=3)-> println((5*x)/(10*(x*x)+1))
       else -> println(45*(x*x)+5)
   }


}catch (e:Exception)
{
    println("Ошибка ввода")

}}