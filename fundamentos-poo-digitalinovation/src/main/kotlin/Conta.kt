import java.math.BigDecimal

class Conta(
    val agencia: String,
    val numero: String,
    val salario: Int
) {
    fun deposito(valor: BigDecimal){

    }
    fun saque(valor: BigDecimal){

    }
}
fun main(){
    val nubank = Conta("0001", "1004", 20)

}