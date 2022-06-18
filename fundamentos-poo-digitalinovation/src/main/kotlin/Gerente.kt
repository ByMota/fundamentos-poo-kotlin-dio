import Funcinario

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String
) : Funcinario(nome, cpf, salario), Login {
    override fun calcularAuxilio() = salario * 0.4
    override fun loginn(): Boolean =  "1234" == senha


}

