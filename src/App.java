import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

    List<String> listaAlunos = new ArrayList<>();
    listaAlunos.add("Ana");
    listaAlunos.add("Victor");
    listaAlunos.add("Leticia");
    listaAlunos.add("Caio");

    for(String aluno : listaAlunos){
    System.out.printf("\nNome do aluno: %s", aluno);
    }

    listaAlunos.remove("Caio");
    
    System.out.println("\n\n");

    for(String aluno : listaAlunos){
        System.out.printf("\nNome do aluno: %s", aluno);
    }

    
     System.out.println("\nTotal"+ listaAlunos.size());

     System.out.println("\nLista em ordem alfabetica");
     listaAlunos.sort(null);
     listaAlunos.forEach(l ->{
        System.out.printf("\nNome do aluno: %s", aluno);
        });

        if (listaAlunos.contains("Ana")){
        System.out.println("\nja existe");
        }else 
        listaAlunos.add("Ana");

    }

}

