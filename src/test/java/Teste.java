import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Teste {

    @Test
    public void aprovado(){
        double media = 8.0;
        String status = getStatusAprovacao(media);
        assertEquals("Aprovado", status);
    }

    @Test
    public void oportunidade(){
        double media = 6.8;
        String status = getStatusAprovacao(media);
        assertEquals("2ª Oportunidade", status);
    }

    @Test
    public void reprovado(){
        double media = 3.0;
        String status = getStatusAprovacao(media);
        assertEquals("Reprovado", status);
    }

    private String getStatusAprovacao(double media) {
        if (media >= 7.0){
            return "Aprovado";
        }else if (media >= 4.0 && media <=6.9){
            return "2ª Oportunidade";
        }else{
            return "Reprovado";
        }
    }
}
