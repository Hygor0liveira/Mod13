public class Programa {
    
    public static void main(String[] args) {
        
        pessoaFisica pessoas = new pessoaFisica();
        pessoas.setIdade(30);
        pessoas.setNome("Hygor ");
        pessoas.setSobrenome("Oliveira");
        pessoas.setTrabalho("Programador");
        pessoas.setDireitosDeveres("Sem criatividade para pensar");
        System.out.println(pessoas.getNome() + pessoas.getSobrenome() + ",Trabalha como: " + pessoas.getTrabalho());
        System.out.println(pessoas.getDireitosDeveres());
        
        pessoaJuridica pessoaJuri = new pessoaJuridica();
        pessoaJuri.setIdade(43);
        pessoaJuri.setNome("Jomar ");
        pessoaJuri.setSobrenome("Alves ");
        pessoaJuri.setTrabalho("Advogado");
        pessoaJuri.setCadrastro(3213);
        System.out.println(pessoaJuri.getNome() + pessoaJuri.getSobrenome() + "Trabalha como: " + pessoaJuri.getTrabalho());
        System.out.println(pessoaJuri.getCadrastro());


        
    }
}
