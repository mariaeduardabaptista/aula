package Classes;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class Cores2{
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int opcao;

    List<Cor> cores = new ArrayList<>();

    do{
        System.out.println("\n*********");
        System.out.println("1 - Cadastrar Cor");
        System.out.println("2 - Remover cor");
        System.out.println("3 - Listar cores");
        System.out.println("4 - Exibir cores em ordem alfabetica");
        System.out.println("5 = Exibir cores em ordem de codigo");
        System.out.println("0 - Sair");
        opcao = ler.nextInt();
        ler.nextLine();


        switch(opcao){
            case 1:
            int cod;

            do{
            System.out.println("Digite o codigo da cor ou 99 para encerrar:");
            cod = ler.nextInt();
            ler.nextLine();


            if(cod == 99){

            System.out.println("digite a cor desejada");
            String nomeCor = ler.nextLine();
            cores.add(new Cor (cod, nomeCor));
            }

            }while(cod == 99);
            break;

            case 2:
            System.out.println("Digite a cor que deseja remover");
            String CorRemover = ler.nextLine();
            cores.removeIf(p -> p.getNome().equalsIgnoreCase(CorRemover));

            break;

            case 3:
            if (cores.isEmpty()){
                System.out.println("Nao a cores");
            }else{

            System.out.println("**** cores ***");

            for(Cor cor : cores){
                System.out.println(cor);
            }}
            break;

            case 4:
            cores.sort(null);
            System.out.println("**** cores ****");
            for(Cor cor : cores){
                System.out.println(cor);
            }
            break;

            case 5:
            cores.sort(null);
            System.out.println("**** cores ****");
            for(Cor cor : cores){
                System.out.println(cor);
                }
                break;

            case 0:
            System.out.println("Encerrando...");

            default:
            System.out.println("Opcao digitada invalida");
        }
        
        }while (opcao == 0);

        ler.close();
    }

}