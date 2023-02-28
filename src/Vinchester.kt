class Vinchester(kach:Double, ob_w:Double): Proc(kach,ob_w) {
    override fun Q(): Double {
        var Qp = Q()+0.5*ob_w
        return Qp
    }
}