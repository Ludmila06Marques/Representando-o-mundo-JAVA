public class Curso {
   String nome;
   int tempo;
   boolean finalizado;

    public void status(){
        if(this.finalizado){
            System.out.println("Parabéns! Curso concluido!");
        }else{
            System.out.println("Curso nao concluido!");
        }
    }

    public void duracaoCurso(){

        System.out.println(" O tempo do curso foi alterado para: " + this.tempo + " meses.");
    }

    public void alterarDuracao(int tempoAdicional){

        this.tempo+=tempoAdicional;
      
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getTempo() {
        return tempo;
    }
    public void setTempo(int tempo) {
        this.tempo = tempo;
    }
    public boolean getFinalizado(){
        System.out.println(this.finalizado);
        return finalizado;
    }
    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

}
