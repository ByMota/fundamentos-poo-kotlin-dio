package testes

import ClienteTipo

fun main(){
    ClienteTipo.values().forEach {
        println("${it.name} - ${it.descricao}")
    }
    val pf = ClienteTipo.PF
    println("Tipo: ${pf.name} - Descricao: ${pf.descricao}")
    val pj = ClienteTipo.PJ
    println("Tipo: ${pj.name} - Descricao: ${pj.descricao}")
}