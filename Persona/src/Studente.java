
public class Studente extends Persona {
    public int id;
    public Studente(String nome , String cognome , Sesso sesso , int id){
        super (nome, cognome , sesso);
        this.id=id;
    }
    @Override
    public String toString() {
        return "Studente{"+getDataString()+"}";
    }
}
