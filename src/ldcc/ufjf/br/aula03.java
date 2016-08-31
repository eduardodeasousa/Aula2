package ldcc.ufjf.br;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class aula03 {


    public static void main(String[] args) {
        Petshop pet = new Petshop();
        Scanner entrada = new Scanner(System.in);
        do{
            pet.cadastroAnimal();
            System.out.println("Deseja cadastrar outro animal? (S/N)");
        }
        while (entrada.nextLine().equalsIgnoreCase("s")  );
        System.out.println("Qual o animal tem tosa agendada: ");
        
        for(int i=0; i<pet.getAnimais().size(); i++)
        {
            System.out.println(i+" : "+pet.getAnimais().get(i));
        }
        try{
            pet.agendaTosa(pet.getAnimais().get(entrada.nextInt()));
        }
        catch (Exception ex)
        {
            System.err.println(ex.getLocalizedMessage());
        }
        
        Animal a0 = pet.getAnimais().get(0);
        Animal ax = new Animal();
        ax.setNome("cachorrao");
        ax.setIdade(11);
   
        try {  
        pet.agendaTosa(a0);    
        pet.agendaTosa(ax);
        }
        catch (Exception ex) {
            System.err.println(ex.getLocalizedMessage());
        }
        
        
    }
        
    
}
