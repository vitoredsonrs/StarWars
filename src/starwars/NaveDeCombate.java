package starwars;
public class NaveDeCombate extends Nave {
    private int poderDeFogo;

    public NaveDeCombate(int id, int poderDeFogo,NaveStatus status) {
        this.id = id;
        this.poderDeFogo = poderDeFogo;
        this.naveStatus = status;
    }
    
    
}
