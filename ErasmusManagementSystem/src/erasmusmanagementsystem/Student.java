package erasmusmanagementsystem;

import java.util.List;

public class Student extends Pessoa {
    String country;
    String university;
    String course;
    private List<Discipline> disciplines;

    public Student(String country, String university, String course, List<Discipline> disciplines, String nome, int idade) {
        super(nome, idade);
        this.country = country;
        this.university = university;
        this.course = course;
        this.disciplines = disciplines;
    }

    public String getnome() {
        return nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public int getidade() {
        return idade;
    }

    public void setidadege(int idade) {
        this.idade = idade;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public List<Discipline> getDisciplinas() {
        return disciplines;
    }

    public void setDisciplinas(List<Discipline> disciplinas) {
        this.disciplines = disciplines;
    }

}
