
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class Cores{
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int opcao;

    List<String> cores = new ArrayList<>();

    do{
        System.out.println("\n*********");
        System.out.println("1 - Cadastrar Cor");
        System.out.println("2 - Remover cor");
        System.out.println("3 - Listar cores");
        System.out.println("4 - Exibir cores em ordem alfabetica");
        System.out.println("0 - Sair");
        opcao = ler.nextInt();
        ler.nextInt();


        switch(opcao){
            case 1:
            System.out.println("digite a cor desejada");
            cores.add(ler.nextLine());
            break;

            case 2:
            System.out.println("Digite a cor que deseja remover");
            cores.remove(ler.nextLine());
            break;

            case 3:
            if (cores.isEmpty()){
                System.out.println("Nao tem cores");
            }else{

            System.out.println("**** cores ***");
            for(String cor : cores){
                System.out.println(cor);
            }}
            break;

            case 4:
            cores.sort(null);
            for(String cor : cores){
                System.out.println(cor);
            }

            case 0:
            System.out.println("Encerrando...");

            default:
            System.out.println("Opcao digitada invalida");
        }
        
        }while (opcao  == 0);
        ler.close();
    }

}


