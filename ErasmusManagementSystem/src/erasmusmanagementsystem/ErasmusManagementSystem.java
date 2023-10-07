package erasmusmanagementsystem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ErasmusManagementSystem {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Professor> professors = new ArrayList<>();
        ArrayList<Course> courses = new ArrayList<>();
        ArrayList<Discipline> disciplines = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int option = -1;
        while (option != 0) {
            System.out.println("          MENU DE OPÇÕES:");
            System.out.println("-------------------------------------");
            System.out.println("| 1 - Registar aluno                |");
            System.out.println("| 2 - Registar professor            |");
            System.out.println("| 3 - Registar curso                |");
            System.out.println("| 4 - Registar disciplina           |");
            System.out.println("| 5 - Mostrar lista de alunos       |");
            System.out.println("| 6 - Mostrar lista de professores  |");
            System.out.println("| 7 - Mostrar lista de cursos       |");
            System.out.println("| 8 - Mostrar lista de disciplinas  |");
            System.out.println("| 9 - Adicionar cursos              |");
            System.out.println("| 10 - Adicionar disciplinas        |");
            System.out.println("| 11 - Adicionar professores        |");
            System.out.println("| 12 - Remover Aluno                |");
            System.out.println("| 13 - Remover cursos               |");
            System.out.println("| 14 - Remover disciplinas          |");
            System.out.println("| 15 - Remover professores          |");
            System.out.println("| 0 - Sair                          |");
            System.out.println("-------------------------------------");
            System.out.println("|Escolha uma opção:                 |");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    registerStudent(students, scanner);
                    break;
                    
                case 2:
                    registerProfessor(professors, scanner);
                    break;
                    
                case 3:
                    registerCourse(courses, scanner);
                    break;
                    
                case 4:
                    registerDiscipline(disciplines, professors, courses, scanner);
                    break;
                    
                case 5:
                    showStudents(students);
                    break;
                    
                case 6:
                    showProfessors(professors);
                    break;
                    
                case 7:
                    showCourses(courses);
                    break;
                    
                case 8:
                    showDisciplines(disciplines);
                    break;
                    
                case 9:
                    addCourses(courses, scanner);
                    break;
                    
                case 10:
                    addDisciplines(disciplines, scanner);
                    break;
                    
                case 11:
                    addProfessors(professors, scanner);
                    break;
                    
                case 12:
                    removeStudent(students, scanner);
                    break;
                    
                case 13:
                    removeCourses(courses, scanner);
                    break;
                    
                case 14:
                    removeDisciplines(disciplines, scanner);
                    break;
                    
                case 15:
                    removeProfessors(professors, scanner);
                    break;
                    
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }        
    }
    
    public static void registerStudent(ArrayList<Student> students, Scanner scanner) {
        System.out.print("Qual o nome do estudante: ");
        String nome = scanner.next();
        
        System.out.print("Idade do estudante: ");
        int idade = scanner.nextInt();
        
        System.out.print("Qual o seu País de Origem: ");
        String country = scanner.next();
        
        System.out.print("Em que universidade está matriculado: ");
        String university = scanner.next();
        
        System.out.print("Qual o seu curso: ");
        //cria um objeto curso
        String course = scanner.next();
        Student s = new Student(country, university, course, new ArrayList<Discipline>(), nome, idade);
        //adicionar o objeto curso à lista
        students.add(s);     
    }
    
    public static void registerProfessor(ArrayList<Professor> professors, Scanner scanner){
        System.out.print("Insira nome do professor: ");
        String nome = scanner.next();
        
        System.out.print("insira a idade do professor: ");
        int idade = scanner.nextInt();
        
        System.out.print("indique a sua funcao(se é regente ou assistente): ");
        String funcao = scanner.next();
        
        System.out.print("Indique as disciplinas que o professor leciona: ");
        String disciplinas = scanner.next();
        
        //cria um novo objeto da classe professor
        Professor p = new Professor(nome, idade, funcao, new ArrayList<Discipline>());
        //Adiciona o objeto professor à lista
        professors.add(p);
        
    }
    public static void registerCourse(ArrayList<Course> courses, Scanner scanner){
        System.out.print("Insira nome do curso: ");
        String nome = scanner.next();
        
        System.out.print("Indique as disciplinas do curso: ");
        String disciplinas = scanner.next();
        
        //cria um novo objeto da classe Course
        Course c = new Course(nome, new ArrayList<Discipline>());
        //Adiciona o objeto curso à lista
        courses.add(c);
    }
    
    public static void registerDiscipline(ArrayList<Discipline> disciplines, ArrayList<Professor> professors, ArrayList<Course> courses, Scanner scanner){
        System.out.print("Insira nome da disciplina: ");
        String nome = scanner.next();
        
        System.out.print("insira o total de ects: ");
        int ECTS = scanner.nextInt();
        
        System.out.print("Indique os professores que dão esta disciplina: ");
        String professores = scanner.next();
        
        System.out.print("Insira o curso a que pertence esta disciplina: ");
        String curso = scanner.next();
        
        System.out.print("Indique em que linguagem é dada(se Português, Inglês, ou misto): ");
        String linguagem = scanner.next();
        
        //cria um objeto da classe discipline
        Discipline d = new Discipline(nome, ECTS, new ArrayList<Professor>(), curso, linguagem);
        //Adiciona o objeto disciplina à lista
        disciplines.add(d);
        
    }
    
    public static void showStudents(ArrayList<Student> students){
        for (Student s : students) {
            System.out.println(s);
        }       
    }
    
    public static void showProfessors(ArrayList<Professor> professors){
        for (Professor p : professors) {
            System.out.println(p);
        }        
    }
    
    public static void showCourses(ArrayList<Course> courses){
        for (Course c : courses) {
            System.out.println(c);
        }  
    }
    
    public static void showDisciplines(ArrayList<Discipline> disciplines){
        for (Discipline d : disciplines) {
            System.out.println(d);
        }
    }
    
    public static void addCourses(ArrayList<Course> courses, Scanner scanner){
            System.out.print("Qual o nome do curso: ");
            String name = scanner.nextLine();
            
            courses.add(new Course(name, new ArrayList<Discipline>()));         
    }
    
    
    public static void addDisciplines(ArrayList<Discipline> disciplines, Scanner scanner){
        System.out.print("insere o nome da disciplina: ");
        String name = scanner.nextLine();
        
        System.out.print("quantos ECTS tem a disciplina: ");
        int ects = scanner.nextInt();
        
        disciplines.add(new Discipline(name, ects, new ArrayList<Professor>(), null, ""));    
    }
    
    public static void addProfessors(ArrayList<Professor> professors, Scanner scanner){
        System.out.print("Insira nome do professor: ");
        String nome = scanner.next();
        
        System.out.print("insira a idade do professor: ");
        int idade = scanner.nextInt();
        
        System.out.print("indique a sua funcao(se é regente ou assistente): ");
        String funcao = scanner.next();
        
        System.out.print("Indique as disciplinas que o professor leciona: ");
        String disciplines = scanner.next();
        //Vai adicionar outro Professor à lista
        professors.add(new Professor(nome, idade, funcao, new ArrayList<Discipline>()));
    }
    
    public static void removeStudent(List<Student> students, Scanner scanner) {
        System.out.print("Indica o nome do estudante que pretende remover: ");
        String nome = scanner.nextLine();

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getNome().equals(nome)) {
                iterator.remove();
                System.out.println("Estudante removido com sucesso!");
                return;
            }
        }

        System.out.println("Estudante não encontrado!");
    }

    public static void removeCourses(List<Course> courses, Scanner scanner) {
        System.out.print("Indica o nome do curso para remover: ");
        String nome = scanner.nextLine();

        Iterator<Course> iterator = courses.iterator();
        while (iterator.hasNext()) {
            Course course = iterator.next();
            if (course.getNome().equals(nome)) {
                iterator.remove();
                System.out.println("Curso removido com sucesso!");
                return;
            }
        }

        System.out.println("Curso não encontrado!");
    }

    public static void removeDisciplines(List<Discipline> disciplines, Scanner scanner) {
        System.out.print("Indica o nome da disciplina que queres remover: ");
        String nome = scanner.nextLine();

        Iterator<Discipline> iterator = disciplines.iterator();
        while (iterator.hasNext()) {
            Discipline discipline = iterator.next();
            if (discipline.getNome().equals(nome)) {
                iterator.remove();
                System.out.println("Disciplina removida com sucesso!");
                return;
            }
        }

        System.out.println("Disciplina não encontrada!");
    }

    public static void removeProfessors(List<Professor> professors, Scanner scanner) {
        System.out.print("Indica o nome do professor que quer remover: ");
        String nome = scanner.nextLine();

        Iterator<Professor> iterator = professors.iterator();
        while (iterator.hasNext()) {
            Professor professor = iterator.next();
            if (professor.getNome().equals(nome)) {
                iterator.remove();
                System.out.println("Professor removido com sucesso!");
                return;
            }
        }

        System.out.println("Professor não encontrado!");
    }
}
