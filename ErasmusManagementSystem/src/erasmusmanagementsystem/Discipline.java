package erasmusmanagementsystem;

import java.util.List;

public class Discipline {
    private String nome;
    private int ECTS;
    private List<Professor> professores;
    private String course;
    private String linguagem;

    public Discipline(String nome, int ECTS, List<Professor> professores, String course, String linguagem) {
        this.nome = nome;
        this.ECTS = ECTS;
        this.professores = professores;
        this.course = course;
        this.linguagem = linguagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getECTS() {
        return ECTS;
    }

    public void setECTS(int ECTS) {
        this.ECTS = ECTS;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }

    public String getCurso() {
        return course;
    }

    public void setCurso(String curso) {
        this.course = course;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    } 
}
