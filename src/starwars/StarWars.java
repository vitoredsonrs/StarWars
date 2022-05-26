package starwars;
public class StarWars {
    public static void main(String[] args) {
        
        NaveDeCombate nc1 = new NaveDeCombate();
        nc1.setPoderDeFogo(10);
        nc1.setPousado(true);
        nc1.setId(01);
        
        NaveDeTransporte nt1 = new NaveDeTransporte();
        nt1.setCapacidade(100);
        nt1.setPousado(false);
        nt1.setId(01);
        
        nt1.decolar();
        nt1.pousar();
        
        //nc1.pousar();
        //nc1.decolar();
       // nc1.pousar();
        //nc1.pousar();
    }
    
}
