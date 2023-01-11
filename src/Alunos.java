public class Alunos {
    private String nome;
    String email;
    int telefone;
    private String senha;
    int idade;

    Curso curso = new Curso();

    public void aniversario(){

        this.idade += 1;
        System.out.println("Feliz aniversario!");
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome){
       this.nome = nome;
    }

    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public int getTelefone(){
        return this.telefone;
    }
    public void setTelefone(int telefone){
        this.telefone = telefone;
    }
    public String getSenha(){
        return this.senha;
    }
    public void setSenha (String senha){
        this.senha = senha;
    }
    public int getIdade() {
        System.out.println(this.idade);
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }








}
