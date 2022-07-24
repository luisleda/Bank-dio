package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.banco


fun main() {
    val digiOneBank = banco(nome = "SantanderDio", numero = 12)

    println(digiOneBank.nome)
    println(digiOneBank.numero)

    val banco2 = digiOneBank.copy(nome = "banco2")

    println(banco2.info())
}