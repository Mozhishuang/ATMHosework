import java.util.*
import kotlin.system.exitProcess

var totalMoney = 100000.00;
fun main() {
while (true){
    show()
    var scanner = Scanner(System.`in`)
    var inputchoice = scanner.next()
    when(inputchoice){
        "1"->step1()
        "2"->step2()
        "3"->step3()
        "4"->step4()
        else -> println("输入不合法，请重新输入")
    }}
}

fun step1(){
    println("输入存款金额")
    var scanner = Scanner(System.`in`)
    var num = scanner.nextDouble()
        println("存款成功！")
        totalMoney += num
        println("剩余金额为 $totalMoney")
}
fun step2(){
    println("输入取款金额")
    var scanner = Scanner(System.`in`)
    var num = scanner.nextDouble()
    var resutl = if(num > totalMoney) println("取款金额大于总金，不符合要求") else{
        println("全款成功！")
        totalMoney -= num
        println("剩余金额为 $totalMoney")
    }
}
fun step3(){
println("当前剩余金额为 $totalMoney")
}
fun step4(){
println("谢谢使用！")
    exitProcess(0)
}
fun show(){
    println("首页")
    println("选择操作")
    println("***********************")
    println("1.存款")
    println("2.取款")
    println("3.查询")
    println("4.退出")
    println("***********************")
}