import java.util.Scanner;


public class Acougue {

    static float lucro = 0;

    public static void main(String[] args) {
        
        boolean execucao = true;
        Scanner scan = new Scanner(System.in);

            Carne carne1 = new Carne(" "," ",0,0);
            System.out.println("Digite o corte:.... ");
            carne1.setNome(scan.nextLine());
            System.out.println("--------------------------");

            System.out.println("Digite o tipo da carne:.... ");
            carne1.setTipo(scan.nextLine());
            System.out.println("--------------------------");

            System.out.println("Digite a quantidade de peças que deseja vender:.... ");
            carne1.setQuant(scan.nextInt());
            System.out.println("--------------------------");

            System.out.println("Digite o preco:.... ");
            carne1.setPreco(scan.nextFloat());
            System.out.println("--------------------------");

            Validade validade1 = new Validade(carne1,0 ,0);
            System.out.println("Digite o mes de vencimento:.... ");
            validade1.setMes(scan.nextInt());
            System.out.println("--------------------------");
            
            System.out.println("Digite o ano de vencimento:.... ");
            validade1.setAno(scan.nextInt());
            System.out.println("--------------------------");

        while(execucao)
        {

            
            

            System.out.println("\n---- SEU ESTOQUE ---- \n");
            validade1.exibirDetalhe();
            System.out.println("--------------------------");
            System.out.println("Digite [0] para sair....  \nDigite [1] para efetuar uma venda...");
            int opicao = scan.nextInt();
            System.out.println("--------------------------");
            
            if(opicao == 0)
            {
                execucao = false;
            }
            else if (opicao == 1)
            {
                System.out.println("Digite a quantidade a ser vendida:...");
                int quantidadeVenda = scan.nextInt();
                System.out.println("--------------------------");
                lucro += carne1.getPreco() * quantidadeVenda;
                if (quantidadeVenda <= carne1.getQuant())
                {
                    carne1.setQuant(carne1.getQuant() - quantidadeVenda);
                    System.out.println("\n---- VENDA EFETUADA COM SUCESSO ---- \n");
                    validade1.exibirDetalhe();
                    System.out.println("Lucro: R$"+ lucro );
                    System.out.println("--------------------------");
                }
                else
                {
                    System.out.println("Quantidade insuficiente em estoque para a venda....");
                }
                
            }
            
        

        }
    }

    
}
