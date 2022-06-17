package testes

import Banco

fun main(){
    val Nubank = Banco("Nubank", 10)
    println(Nubank.nome)
    println(Nubank.numero)

    val banco2 = Nubank.copy()

    println(banco2.info())
}