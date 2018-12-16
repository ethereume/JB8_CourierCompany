import java.util.Random;

public class Region {
    public Region() {
        generator = new Random();
    }
    public void generateNumberFoRegion(String adres) {
        generateNumber = generator.nextInt(1000);
        number = generateNumber+adres;
    }
    public void setNumber(int String) {
        this.number = number;
    }

    public int getGenerateNumber() {
        return generateNumber;
    }

    public String getNumber() {
        return number;
    }

    private Random generator;
    private String number;
    private int generateNumber;
}
