package testes

import Analista
import Funcinario

fun main() {
    val will = Analista("will", "123.456.789.10", 4000.0)
    ImprimeRelatorioFuncionario.imprime(will)
}
