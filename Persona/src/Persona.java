import java.text.SimpleDateFormat;
import java.util.Date;
public class Persona {
    protected String nome ;
    protected String cognome ;
    protected Date dataDiNascita ;
    protected Sesso sesso ;
    protected int altezza ;

    public Persona(String nome, String cognome, Sesso sesso) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataDiNascita = dataDiNascita;
    }

    public Date getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(Date dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    public int getAltezza() {
        return altezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }
    protected String getDataString (){
        String pattern ="DD-MM-YYYY";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat (pattern);
        String data;
        try {
            data = simpleDateFormat.format(dataDiNascita);
        }catch (Exception e){
            data = "null";
        }
        return
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", dataDiNascita="  +data +
                ", sesso=" + sesso +
                ", altezza=" + altezza
                ;
    }


    @Override
    public String toString() {
        return "Persona{"+getDataString()+"}";
    }
}
