package erasmusmanagementsystem;

import java.util.List;

public class Course {
    private String nome;
    private List<Discipline> disciplines;

    public Course(String nome, List<Discipline> disciplines) {
        this.nome = nome;
        this.disciplines = disciplines;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Discipline> getDisciplinas() {
        return disciplines;
    }

    public void setDisciplinas(List<Discipline> disciplines) {
        this.disciplines = disciplines;
    }
}
