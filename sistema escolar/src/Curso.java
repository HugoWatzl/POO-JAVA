public class Curso {
    private String nome;
    private Aluno[] alunos;
    private int nrVagas;
    int totalMatriculas;

    public Curso(String nome, int nrVagas) {
        this.nome = nome;
        this.nrVagas = nrVagas;
        this.alunos = new Aluno[nrVagas];
        this.totalMatriculas = 0;
    }

    public boolean Matricular(Aluno a) {
//verifica se a matricula existe
        for( int i = 0; i < totalMatriculas;i++){
            if (alunos[i].getMatricula().equals(a.getMatricula())){
                return false; }
        }
        //verifica a quantidade
        if(totalMatriculas < nrVagas){
            alunos[totalMatriculas] = a;
            totalMatriculas++;
            return true;
        }
        return false;
    }
     public boolean Desmatricular(String matricula) {
         for (int i = 0; i < totalMatriculas; i++) {
             if (alunos[i].getMatricula().equals(matricula)) {
                 alunos[i] = null;
                 totalMatriculas--;
                 return true;
             }
         }
         return false;
     }

    public void imprimi(){
        System.out.println("Nome do curso: " + nome);
        System.out.println("Quantidade de vagas: " + nrVagas);
        System.out.println("Alunos matriculados:");
        for (int i = 0; i < totalMatriculas; i++) {
            System.out.println("- " + alunos[i].getNome() + " (Matrícula: " + alunos[i].getMatricula() + ")");
        }
}
 }
