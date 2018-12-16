public enum Status {

    REGISTERED("Zarejestrowano paczkę"),
    GIVEN("Nadano do dostarczenia"),
    DELIVERT("Dostarczono"),
    NOTDELIVERT("Nie dostarczono");

    private String tekst;

    private Status(String dostarczono) {
        tekst = dostarczono;
    }

    public String getTekst() {
        return tekst;
    }
}
