package Classes;

public class Cor implements Comparable<Cor>{


private int codigo;
private String nome;

public Cor(int codigo, String nome) {
    this.codigo = codigo;
    this.nome = nome;
}

public int getCodigo() {
    return codigo;
}

public void setCodigo(int codigo) {
    this.codigo = codigo;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

@Override
public String toString() {
    return "Cor codigo=" + codigo + ", nome=" + nome;

    
}

@Override
public int compareTo(Cor c) {
    return getNome().compareTo(c.getNome());
}





}