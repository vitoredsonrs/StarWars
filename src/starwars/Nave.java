package starwars;
public abstract class Nave {
    private int id, status;
    private boolean pousado;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    
    
    public boolean getPousado() {
        return pousado ;
    }

    public void setPousado(boolean pousado) {
        this.pousado = pousado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void pousar(){
        if (pousado==true) {
            System.out.println("A nave já se encontra em solo.");
        }else{
            System.out.println("Pousando nave");
        }
    }
    public void decolar(){
        if (pousado==false) {
            System.out.println("Decolando.");
        }else{
            System.out.println("Nave já está voando.");
        }
    }
    
}
