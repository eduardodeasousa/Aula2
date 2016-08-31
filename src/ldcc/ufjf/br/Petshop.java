package ldcc.ufjf.br;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Petshop {
    private List<Animal> animais;
    private List<Animal> tosa;

    public Petshop() {
        animais = new ArrayList<>();
        tosa = new ArrayList<>();
        
    }
    
    public void cadastroAnimal()
    {
        Scanner entrada = new Scanner(System.in);
        do{
        Animal a1 = new Animal();
        System.out.println("Digite o nome do animal: ");
        a1.setNome(entrada.nextLine());
        System.out.println("Digite a idade do animal: ");
        a1.setIdade(entrada.nextInt());
        System.out.println("Digite o peso do animal: ");
        a1.setPeso(entrada.nextFloat());
        System.out.println("Digite a raça: ");
        entrada.nextLine();
        a1.setRaca(entrada.nextLine());
        System.out.println(a1.toString());
        animais.add(a1);
            System.out.println("Deseja cadastrar outro animal? (S/N)");
        }
        while (entrada.nextLine().equalsIgnoreCase("s")  );
    }

    public List<Animal> getAnimais() {
        return animais;
    }
    
    public void agendaTosa(Animal a) throws Exception
    {
        if (animais.contains(a) && !tosa.contains(a))
        {
            tosa.add(a);
        }
        else
        {
            throw new Exception("Animal nao cadastrado.");   
        }
        
    }
    
    
    
}
