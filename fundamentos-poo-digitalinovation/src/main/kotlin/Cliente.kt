class Cliente(
    nome: String,
    cpf: String,
    val clienteTipo: ClienteTipo,
    val senha: String
): Pessoa(nome, cpf), Login {
    override fun loginn(): Boolean = "12345" == senha

    override fun toString(): String = """
        Nome: $nome
        Cpf: $cpf
        Tipo: ${clienteTipo.descricao}
    """.trimIndent()


}