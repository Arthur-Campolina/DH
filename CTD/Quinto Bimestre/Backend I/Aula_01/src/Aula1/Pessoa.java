package Aula1;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {

    private String nome;
    private String sobrenome;
    LocalDate idade;
    List<String> colecao = new ArrayList<>();

    public Pessoa() {
    }

    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LocalDate getIdade() {
        return idade;
    }

    public void setIdade(LocalDate idade) {
        this.idade = idade;
    }

    public List<String> addNomes(Pessoa p) {
        int tamanhoNome  = p.getNome().length();
        int idade = p.idade();
        if(tamanhoNome > 4 && idade > 17) {
            colecao.add(p.getNome());
            System.out.println(colecao);
        }
        return null;
    }

    public int idade() {
        return Period.between(this.idade, LocalDate.of(2022,8,1)).getYears();
    }

    @Override
    public String toString() {
        return
                "nome: " + nome + "\n" +
                "sobrenome: " + sobrenome + "\n" +
                "idade: " + idade + "\n";
    }
}
