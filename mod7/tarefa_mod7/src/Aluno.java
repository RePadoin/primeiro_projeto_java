/*
Objeto Aluno, contendo os dados basicos do aluno
 */
public class Aluno {
    private int matricula;

    private String nome;

    private String endereco;

    private String curso;
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    /**
     *
     * @deprecated
     * @see String nomeDoCurso2()
     */
    public String nomeDoCurso(){
        return "Especialista back-end Phyton";
    }

    public String nomeDoCurso2(){
        return "Especialista back-end Java";
    }

}
