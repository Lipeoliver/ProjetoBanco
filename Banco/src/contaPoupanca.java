public class contaPoupanca extends Conta {
    private static int SEQUENCIAL = 0;

    public contaCorrente(){
        super.agencia = AGENCIA_PADRAO = 0;
        super.numero = SEQUENCIAL++;
}
