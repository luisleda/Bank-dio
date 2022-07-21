package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Lampiao"

    var cpf: String = "171.174.178-18"
    private set

}

fun main() {
    val Lampiao = Pessoa()

    println(Lampiao.nome)
    println(Lampiao.cpf)
}