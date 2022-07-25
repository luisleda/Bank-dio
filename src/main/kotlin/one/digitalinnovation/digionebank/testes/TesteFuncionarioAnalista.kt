package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.ImprimeRelatorioFuncionario

fun main() {
    val herculano = Analista("Herculano Zeus Son", "157.148.123-20", 2000.0)
    ImprimeRelatorioFuncionario.imprime(herculano)

}

