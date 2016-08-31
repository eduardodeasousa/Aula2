
package ldcc.ufjf.br;

public class Animal {
    private String nome;
    private Integer idade;
    private Float peso; 
    private String raca;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Animal() {
    }

    @Override
    public String toString() {
        return "Animal{" + "nome=" + nome + ", idade=" + idade + ", peso=" + peso + ", raca=" + raca + '}';
    }
    
    
}
