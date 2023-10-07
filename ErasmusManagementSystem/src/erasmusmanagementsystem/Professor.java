package erasmusmanagementsystem;
import java.util.List;

public class Professor extends Pessoa {
    private String funcao;
    private List<Discipline> disciplinas;

    public Professor(String nome, int idade, String funcao, List<Discipline> disciplinas) {
        super(nome, idade);
        this.funcao = funcao;
        this.disciplinas = disciplinas;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public List<Discipline> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Discipline> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
