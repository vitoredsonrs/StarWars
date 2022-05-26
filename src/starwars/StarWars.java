package starwars;
public class StarWars {
    public static void main(String[] args) {
        
        Nave cbt01 = new NaveDeCombate(001, 100, NaveStatus.Ocioso);
        Nave cbt02 = new NaveDeCombate(002, 100, NaveStatus.Ocioso);
        Nave cbt03 = new NaveDeCombate(003, 100, NaveStatus.Ocioso);
        Nave cbt04 = new NaveDeCombate(004, 100, NaveStatus.Ocioso);
        Nave cbt05 = new NaveDeCombate(005, 100, NaveStatus.Ocioso);
        Nave cbt06 = new NaveDeCombate(006, 100, NaveStatus.Ocioso);
        Nave tra01 = new NaveDeTransporte(001, 100, NaveStatus.Ocioso);
        Nave tra02 = new NaveDeTransporte(002, 100, NaveStatus.Ocioso);
        Nave tra03 = new NaveDeTransporte(003, 100, NaveStatus.Ocioso);
        Nave tra04 = new NaveDeTransporte(004, 100, NaveStatus.Ocioso);
        Nave tra05 = new NaveDeTransporte(005, 100, NaveStatus.Ocioso);
        Nave tra06 = new NaveDeTransporte(006, 100, NaveStatus.Ocioso);
        
        EstacionamentoDeNave estacionamento = new EstacionamentoDeNave();
        
        estacionamento.receberNave(cbt01);
        estacionamento.receberNave(cbt02);
        estacionamento.receberNave(cbt03);
        estacionamento.receberNave(cbt04);
        estacionamento.receberNave(cbt05);
        estacionamento.receberNave(cbt06);
        estacionamento.receberNave(tra01);
        estacionamento.receberNave(tra02);
        estacionamento.receberNave(tra03);
        estacionamento.receberNave(tra04);
        estacionamento.receberNave(tra05);
        estacionamento.receberNave(tra06);

        estacionamento.liberarNave(cbt01);
        estacionamento.liberarNave(cbt02);
        estacionamento.liberarNave(cbt03);
        estacionamento.liberarNave(cbt04);
        estacionamento.liberarNave(cbt05);
        estacionamento.liberarNave(cbt06);
        estacionamento.liberarNave(tra01);
        estacionamento.liberarNave(tra02);
        estacionamento.liberarNave(tra03);
        estacionamento.liberarNave(tra04);
        estacionamento.liberarNave(tra05);
        estacionamento.liberarNave(tra06);
        
    }
    
}
