package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Lampiao"

    var cpf: String = "171.174.178-18"
    private set

    constructor()

    fun pessoaInfo() = "$nome $cpf"
}

fun main() {
    val Lampiao = Pessoa()
    println(Lampiao.pessoaInfo())
}