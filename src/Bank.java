import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
//      dados cliente:

        double saldoAtual = 200.00;
        int operacao = 0;
        String cliente = "Caio Henrique Antonio";
        String conta = "Corrente";
        String bankMenu = """
                Operações
                                      
                    1- Consultar saldos
                    2- Receber valor
                    3- Transferir valor
                    4- Sair
                                      
                    Digite a opção desejada: 
                """;

        System.out.println(String.format("""
                ***********************
                Dados iniciais do cliente:
                                
                Nome: %s
                Tipo conta: %s
                Saldo inicial: R$ %.2f
                ***********************
                """, cliente, conta, saldoAtual));




        Scanner operacaoSelecionada = new Scanner(System.in);
        Scanner depositoValor = new Scanner(System.in);
        Scanner transferirValor = new Scanner(System.in);


        while (operacao != 4) {
            System.out.println(bankMenu);
            operacao = operacaoSelecionada.nextInt();

            switch (operacao) {
                case 1:
                    System.out.println(String.format("""
                          ***********************
                          Seu saldo atual é: R$ %.2f
                          ***********************
                          """, saldoAtual));
                    break;
                case 2 :
                    System.out.println("Digite o valor a receber:");
                    double deposito = depositoValor.nextDouble();
                    double adicaoDeSaldo = saldoAtual + deposito;
                    saldoAtual = adicaoDeSaldo;
                    System.out.println(String.format("""
                          ***********************
                          Transfêrencia recebida!
                          Novo saldo: %.2f 
                          *********************** 
                            """, saldoAtual));
                    break;
                case 3:
                    System.out.println(String.format("""
                          Seu saldo atual é: R$ %.2f
                          Qual valor deseja transferir?
                          """,saldoAtual));
                    double transferencia = transferirValor.nextDouble();
                    if(transferencia < saldoAtual) {
                        double subtracaoSaldo = saldoAtual - transferencia;
                        saldoAtual = subtracaoSaldo;
                        System.out.println(String.format("""
                          ***********************
                          Transfêrencia Realizada!
                          Novo saldo: %.2f 
                          *********************** 
                            """, saldoAtual));
                    } else {
                        System.out.println(String.format("""
                          ***********************
                          SALDO INSUFICIENTE PARA REALIZAR ESSA OPERAÇÃO!
                          ***********************
                          """));
                    }
                   break;
                case 4:
                    System.out.println("""
                          ***********************
                          CONSULTA BANCÁRIA FINALIZADA
                          O BANCO DO CAIÃO, AGRADECE A PREFERÊNCIA!!!
                          ***********************
                          """);
                    break;
                default:
                    System.out.println("""
                          ***********************
                          OPÇÃO INVÁLIDA - SELECIONE ENTRE 1  & 4
                          ***********************
                          """);
            }
        }
    } //

}
