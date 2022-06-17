class Analista(
    nome: String,
    cpf: String,
    salario: Double
): Funcinario(nome, cpf, salario){
    override fun calcularAuxilio() = salario * 0.1
}