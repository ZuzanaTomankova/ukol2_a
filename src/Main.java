import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        String firstName = "Karel";
        String surname = "Novák";
        LocalDate birthdate = LocalDate.of(1970,3,12) ;
        BigDecimal numberOfContracts = BigDecimal.valueOf(90);
        BigDecimal tunOfSeldCarot = BigDecimal.valueOf(400);
        String city = "Brno";
        String licensePlate = "5B5 5555";
        double consumptionPer100km = 5.6;
        String IPAdress = "56.145.91.188";
        BigDecimal amountPerContract = BigDecimal.valueOf(1);
        amountPerContract = tunOfSeldCarot.divide(numberOfContracts, RoundingMode.HALF_UP);
        System.out.println("Průměrné množství mrkve prodané na jednu smlouvu je "+amountPerContract+"t.");
    }
}