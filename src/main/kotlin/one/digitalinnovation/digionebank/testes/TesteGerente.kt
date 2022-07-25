package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente
import one.digitalinnovation.digionebank.ImprimeRelatorioFuncionario

fun main() {
    val thor = Gerente("Thor Odin Son", "118.118.148-10", 6000.0, "senhaquebrada123")
    ImprimeRelatorioFuncionario.imprime(thor)

    TesteAutenticacao().autentica(thor)
}
