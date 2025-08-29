import java.io.Serializable;

public class Girafa implements Serializable {
    private String nome;
    private int idade;        
    private double altura;    
    private double peso;      
    private String dieta;

    public Girafa(String nome, int idade, double altura, double peso, String dieta) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.dieta = dieta;
    }

    public void mostrarInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Dieta: " + dieta);
    }
}
