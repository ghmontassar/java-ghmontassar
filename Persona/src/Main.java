import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Persona paolo = new Persona("Paolo","Rossi",Sesso.M);
        System.out.println(paolo);

        String pattern ="DD-MM-YYYY";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat (pattern);
        try {
            Date date = simpleDateFormat.parse("12-12-1995");
            paolo.setDataDiNascita(date);
        }catch (ParseException e){
            e.printStackTrace();
        }

        Studente marco = new Studente("Mauro","Rossi", Sesso.M,0);
        System.out.println(marco);

    }

}
