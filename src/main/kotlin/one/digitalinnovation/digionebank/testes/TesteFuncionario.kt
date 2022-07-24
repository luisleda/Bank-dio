package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main() {
    val Lampiao = Pessoa(nome = "Lampião da Silva" , cpf = "147.159.123.-56")
    println(Lampiao.nome)
    println(Lampiao.cpf)

    val herculano = Funcionario("Herculano Zeus Son", "157.148.123-20", BigDecimal.valueOf(2000.0))
    println(herculano.nome)
    println(herculano.cpf)
    println(herculano.salario)
}