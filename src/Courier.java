import java.util.ArrayList;
import java.util.List;

public class Courier {

    public Courier(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Pack> getPacks() {
        return packs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPacks(Pack packs) {
        this.packs.add(packs);
    }

    public void setRegion(int region) {
        this.region = region;
    }
    public void deliveredPack(int which) {
        if(which >= packs.size()){
            System.out.println("There no is pack on this number");
        }
        this.packs.get(which).setStatus(Status.DELIVERT);
    }
    public void notDeliveredPack(int which) {
        if(which >= packs.size()){
            System.out.println("There no is pack on this number");
        }
        this.packs.get(which).setStatus(Status.NOTDELIVERT);
    }
    public int getNumberPackers(){
        return packs.size();
    }
    public int getRegion() {
        return region;
    }
    public void printStatusForCurier(Status s){
        System.out.println("Courier "+name);
        System.out.println("Status for pack  "+s.getTekst());
        for (int i = 0; i < packs.size(); i++) {
            if(packs.get(i).getStatus().getTekst().equals(s.getTekst())){
                System.out.println("Pack "+packs.get(i).getName()+" with adress "+packs.get(i).getAdres());
            }
        }
    }

    private String name;
    private int region;
    private List<Pack> packs = new ArrayList<>();
}
