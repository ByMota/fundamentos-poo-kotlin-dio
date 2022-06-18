package testes

import Cliente

fun main() {
    val jose = Cliente(
        nome = "jose",
        cpf = "123.456.784.22",
        clienteTipo = ClienteTipo.PF,
        senha = "12345"
    )
    println(jose)
    TesteAutenticacao().autentica(jose)
}