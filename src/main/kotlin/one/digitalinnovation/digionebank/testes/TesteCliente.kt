package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
    val undertake = Cliente(
        nome = "Undertake o vampiro",
        cpf = "167.248.628-98",
        clienteTipo = ClienteTipo.PF,
        senha = "senhacliente123"
    )

    println(undertake)
    TesteAutenticacao().autentica(undertake)
}
class TesteCliente {



}