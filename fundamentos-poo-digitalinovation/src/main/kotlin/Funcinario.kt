import java.nio.DoubleBuffer

abstract class Funcinario(
    nome: String,
    cpf: String,
    val salario: Double
)  : Pessoa(nome, cpf) {
    protected abstract fun calcularAuxilio() : Double

    override fun toString(): String = """
        Nome: $nome
        Cpf: $cpf
        Salario: $salario
        Auxilio: ${calcularAuxilio()}
    """.trimIndent()
}

