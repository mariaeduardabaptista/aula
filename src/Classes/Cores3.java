
import java.util.List;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.time.LocalDate;
import java.util.Map;




public class Cores3{
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
        System.out.println("5 - Exibir cores em ordem de codigo");
        System.out.println("6 - Exibir as cores que tem letra A no nome");
        System.out.println("7 - exibir estatisticas da colecao de cores");
        System.out.println("8 - obter maior codigo digitado");
        System.out.println("9 - agrupar cores pela data de cadastro");
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

            DateTimeFormatter formatacaoData = DateTimeFormatter.ofPattern("dd/MM/yyyy:");
            System.out.println("digite a data de cadastro da cor no formato dd/mm/yyyy");
            String data = ler.nextLine();            
            cores.add(new Cor (cod, nomeCor, LocalDate.parse(data, formatacaoData)));
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
            cores.stream()
            .sorted(Comparator.comparing(Cor::getNome))
            .forEach(System.out::println);
            break;

            case 5:
            cores.stream()
            .sorted(Comparator.comparing(Cor::getCodigo))
            .forEach(System.out::println);
                break;

            case 6:
             /*cores.stream()
             .filter(p -> p.getNome().contains("a") && p.getCodigo() > 10)
             .forEach(System.out::println); */

             List<Cor> coresComA = cores.stream()
             .filter(p -> p.getNome().contains("a"))
             .collect(Collectors.toList());
             
             coresComA.forEach(System.out::println);
             break;

            case 7:
            IntSummaryStatistics dados = cores.stream()
            .collect(Collectors.summarizingInt(Cor::getCodigo));

            System.out.println(dados);
            System.out.println("Total de cores na lista" + dados.getCount());

            case 8:
            int maiorCodigo = cores.stream()
            .collect((IntSummaryStatistics) Collectors.summarizingInt(Cor::getCodigo)).getMax();

            System.out.println("maior codigo digitado foi:"+ maiorCodigo);
            break;

            
            case 9:
            DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            Map<LocalDate, List<Cor>> coresData = cores.stream()
            .collect(Collectors.groupingBy(Cor:: getDataCadastro));

            coresData.entrySet().forEach(
                p -> System.out.printf("Data: %s - Cores: %s\n",
                p.getKey().format(df), p.getValue())

            );
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