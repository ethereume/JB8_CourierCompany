public class Pack {

    public Pack(String name, String adres) {
        this.adres = adres;
        this.name = name;
        this.status = Status.REGISTERED;
    }
    public String getAdres() {
        return adres;
    }

    public Status getStatus() {
        return status;
    }

    public String setGenerateNumberForRegion() {
        return region;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setGenerateNumberForRegion(String region) {
        this.region = region;
    }

    public String getName() {
        return name;
    }

    public int getNumberForRegion() {
        return numberForRegion;
    }

    public void setNumberForRegion(int numberForRegion) {
        this.numberForRegion = numberForRegion;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String adres;
    private int numberForRegion;
    private Status status;
    private String name;
    private String region;
}
