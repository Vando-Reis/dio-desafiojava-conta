import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

                Scanner scanner = new Scanner(System.in);//importa  a clase scanner
                
                System.out.println("Bem vindo ao assitente criador de conta, digite seu nome");//mensagem p/ usuario
                String nomeCliente = scanner.nextLine();  //armazena o texto digitado pelo usuario
                
                System.out.println("Digite sua agência");//mensagem p/ usuario
                String agencia = scanner.nextLine(); // armazena o  digitado
                
                System.out.println("Digite sua conta");//mensagem p/ usuario
                int conta = scanner.nextInt(); // armazena o texto digitado pelo usuario
                
                System.out.println("Digite seu saldo");//mensagem p/ usuario
                float saldo = scanner.nextFloat(); // armazena o numero decimal

                
                System.out.println("Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é  " + agencia + " a conta " + conta + " seu saldo R$ " + saldo +" ja esta disponivel para saque ");
                scanner.close();


        //TODO: Conhecer e importar a classe Scanner
        
        //Exibir as mensagens para o nosso usuario

        //Obter pela classe scanner os valores digitados no terminal 

        //Exibir a mensagem da conta criada
    }
}
