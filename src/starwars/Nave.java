package starwars;
public abstract class Nave {
    protected int id;
    protected NaveStatus naveStatus;
    
    public int getId(){
        return id;
    }

    public boolean pousar(){
        if (naveStatus==NaveStatus.Ocioso) return false;
        naveStatus = NaveStatus.Ocioso;
        return true;
    }
    public boolean decolar(){
        if(naveStatus == NaveStatus.Viajando) return false;
        naveStatus = NaveStatus.Viajando;
        return true;
    }
}
