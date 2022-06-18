package testes

import Analista
import Funcinario
import Gerente

fun main() {
    val will = Gerente("will", "123.456.789.10", 4000.0, "1234")
    ImprimeRelatorioFuncionario.imprime(will)
    TesteAutenticacao().autentica(will)
}
