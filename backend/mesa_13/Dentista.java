package mesa_13;

public class Dentista {
    private int id;
    private String sobrenome, nome, matricula;

    public Dentista(String sobrenome, String nome, String matricula) {
        this.sobrenome = sobrenome;
        this.nome = nome;
        this.matricula = matricula;
    }

    public Dentista() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}