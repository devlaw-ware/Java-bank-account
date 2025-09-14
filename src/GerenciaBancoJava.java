/*  Projeto realizado como parte na disciplina de AED_LAB com o tema:
"Criar um sistema Bancário em Java"
*/

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
                    System.out.println("Saldo R$: "+ consultarSaldo());
                        break;
                case 2:
                    System.out.println("Valor do deposito R$: ");
                    double valorDeposito = scanner.nextDouble();
                    depositar(valorDeposito);
                        break;
                case 3:
                    System.out.println("Valor do Saque R$: ");
                    double valorSaque = scanner.nextDouble();
                    sacar(valorSaque);
                        break;
                case 4:
                    System.out.println("Encerrando...");
                        break;
                default:
                    System.out.println("Opção invalida");
            }


        } while (opcao !=4);
        scanner.close();
    }

}

//Aqui é o nosso "main" onde o projeto vai rodar e tudo vai acontecer
public class GerenciaBancoJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Projeto de Conta Bancária em Java \n");
        System.out.println("Alunos: Laura Viana & Nicolas Costas & Marcos Vieira\n");
        System.out.println("========================================================\n");

        System.out.println("Qual seu nome:\n");
        String nome = scanner.nextLine(); // vai receber o que o usuario escrever no teclado

        System.out.println("Qual seu sobrenome?:\n");
        String sobrenome = scanner.nextLine();

        System.out.println("Qual o seu CPF?:\n");
        String cpf = scanner.nextLine();
        // vamos instanciar tudo isso na nossa classe principal
        // Ja que fizemos o nosso metro construtor eu to passando todos os para
        //a minha varivel conta ela é do tipo ContaBancaria que foi a classe que ja criamos que recebe new ContaBancaria que vai receber os parametros que ja criamos
        ContaBancaria conta = new ContaBancaria(nome, sobrenome, cpf);
        conta.exibirMenu(); // aqui vai chamar o exibirMenu que criamos la em cima
        System.out.println("Obrigada por usar nossos serviços! May the Force Be With You!");
        scanner.close(); // finalizar o scanner

    }
}
