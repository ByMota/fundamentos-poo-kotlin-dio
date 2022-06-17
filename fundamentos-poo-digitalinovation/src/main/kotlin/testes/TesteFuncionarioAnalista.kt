package testes

import Analista
import Funcinario

fun main() {
    val vinicius = Analista("Vinicius", "123.456.789.10", 1000.0)
    ImprimeRelatorioFuncionario.imprime(vinicius)

}