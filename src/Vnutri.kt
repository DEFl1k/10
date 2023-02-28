abstract class Vnutri: Info{
    abstract var name:String
    abstract var chast:Double
    abstract var ob:Int
    override fun info(){
        println("Название $name, частота $chast, память ОЗУ $ob")
    }
    abstract fun Q():Double
}