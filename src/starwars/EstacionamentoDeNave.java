package starwars;
import java.util.*;

public class EstacionamentoDeNave {
    
    private List<Nave> navesEstacionadas = new ArrayList<>(); //Lista declarada
    
    public void receberNave(Nave nave){
        if(nave.pousar()){
            System.out.println("Nave sendo estacionada.");
            navesEstacionadas.add(nave);
        }else {
            System.out.println("Nave "+ nave.getId() + " já está estacionada.");
        }
    }
    public void liberarNave(Nave nave){
        if(nave.decolar()){
            System.out.println("Nave decolando");
            navesEstacionadas.remove(nave);
        }else{
            System.out.println("Nave "+ nave.getId()+" em voou");
        }
    }

}