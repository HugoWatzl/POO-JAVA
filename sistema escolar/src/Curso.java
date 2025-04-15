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
        if (alunos[i].getMatricula() == a.getMatricula()){
            return false; }
    }
    //verifica a quantidade
    if(totalMatriculas < nrVagas){
            totalMatriculas++;
            alunos[totalMatriculas] = a;
            return true;
    }
    return false;
    }
    public boolean Desmatricular(String matricula){

    }


    public void imprimi()
}