public class ProgramaAluno {
    public static void main (String args[]){
        Aluno aluno = new Aluno();
        aluno.setMatricula(123456);
        aluno.setNome("Renato Padoin");
        aluno.setEndereco("Av. Pedro Drummond, 84");
        System.out.println("Matricula: " + aluno.getMatricula());
        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Endereco do Aluno: " + aluno.getEndereco());
        System.out.println("Curso: " + aluno.nomeDoCurso());
    }
}
