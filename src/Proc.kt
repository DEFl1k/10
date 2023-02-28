open class Proc(var kach:Double,ob_w:Double): Vnutri() {
    override var name = "Intel"
    override var chast = 3.9
    override var ob: Int = 32
    override fun Q():Double {
        kach = (0.1*chast)+ob
        println("Качество $kach")
        return kach
    }
}