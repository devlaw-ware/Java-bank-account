
import java.util.Scanner; // lib para fazer a interação entre usuario no terminal - usarei para fazer

//Criação das variaveis da nossa conta bancária
class ContaBancaria{
    private String nome;
    private String sobrenome;
    private String cpf;
    private double saldo;

    /* criação do metodo construtor , basicamente qando ela for chamada no GerenciaBanco, ela vai ser
    transformada em objeto e ela sendo instanciada ela pode receber um valor que eu vou informar a ela. Ou eja, em vez de eu informar um a um eu vou chamar essa classe e com ela será
    criado o metodo construtor ( instanciar ) todo metodo construtor pecisa de parametros */

    //Criação do metodo construtor
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
            System.out.println("Saque de R$" + valor + "realizado com sucesso ");
        } else{
            System.out.println("Saldo insuficiente");
        }
    }
    public void exibirMenu(){ //Criação do switch case que consequentemente puxa da lib que coloquei no inicio
        Scanner scanner =  new Scanner(System.in);
        int opcao;
        // nao importa minha condição, por isso usamos o do aqui.
        do{
            System.out.println("\n ==========Menu Banco&Bonecos==========");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Realizar saque ");
            System.out.println("4 - Encerrar");

            opcao = scanner.nextInt();
            switch(opcao){
                case 1:
                    System.out.println("Saldo R$ "+ consultarSaldo());
                        break;
                case 2:


                    System.out.println("Valor do deposito R$ "+ depositar(););
            }

        } while (opcao !=4);

    }

}

//Aqui é o nosso "main"
public class GerenciaBancoJava{

}

