public abstract class Pessoa {
    
    private String Nome;

    private String Sobrenome;

    private int Idade;
    
    private String Trabalho;

    
    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        Sobrenome = sobrenome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }

    public String getTrabalho() {
        return Trabalho;
    }

    public void setTrabalho(String trabalho) {
        Trabalho = trabalho;
    }
    
    
}