
class ContaBancaria{
    private String nome;
    private String sobrenome;
    private String cpf;
    private double saldo;

    /* criação do metodo construtor , basicamente qando ela for chamada no GerenciaBanco, ela vai ser
    transformada em objeto e ela sendo instanciada ela pode receber um valor que eu vou informar a ela. Ou eja, em vez de eu informar um a um eu vou chamar essa classe e com ela será
    criado o metodo construtor ( instanciar ) todo metodo construtor pecisa de parametros */

    public ContaBancaria(String nome, String sobrenome, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.saldo = 0.0;
}

    public double consultarSaldo (){ // entre parenteses pq eu estou criando um metodo
        return saldo;
    }
    public void depositar (double valor){ /* O depositar vai pegar o valor que eu informar e acrscentar junto ao meu saldo */
        saldo += valor;
        System.out.println("Deposito de R$ + " + valor + "realizado com sucesso");
    }
    public void sacar (double valor){
        if (saldo >= valor){
            saldo -= valor;
            System.out.println(saque);
        }
    }
}

