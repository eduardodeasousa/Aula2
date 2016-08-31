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
        System.out.println(pet.getAnimais());
        Animal a0 = pet.getAnimais().get(0);
        try {  
        pet.agendaTosa(a0);    
        }
        catch (Exception ex) {
            System.err.println("Tentativa de agendametno para um animal nao cadastrado! ");
        }
        
        
    }
        
    
}
