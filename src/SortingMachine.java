import java.util.ArrayList;
import java.util.List;

public class SortingMachine {

    public SortingMachine(Region r) {
        region = r;
    };

    public void generatePackForCurier(){
        for (int i = 0; i < packs.size(); i++) {
            for (int j = 0; j < couriers.size(); j++) {
                if(couriers.get(j).getRegion() <= 500 && packs.get(i).getNumberForRegion() <= 500){
                    couriers.get(j).setPacks(packs.get(i));
                    packs.get(i).setStatus(Status.GIVEN);
                    break;
                } else if(couriers.get(j).getRegion() > 500 && packs.get(i).getNumberForRegion() > 500) {
                    couriers.get(j).setPacks(packs.get(i));
                    packs.get(i).setStatus(Status.GIVEN);
                    break;
                }
            }
        }
    }
    private void generateNumberForPacks(){
        for (int i = 0; i < packs.size(); i++) {
            region.generateNumberFoRegion(packs.get(i).getAdres());
            packs.get(i).setGenerateNumberForRegion(region.getNumber());
            packs.get(i).setNumberForRegion(region.getGenerateNumber());
        }
    }
    public void printStatusForPacks(Status s){
        System.out.println("Status for pack in sortching machine \""+s.getTekst()+"\"");
        for (int i = 0; i < packs.size(); i++) {
            if(packs.get(i).getStatus().getTekst().equals(s.getTekst())){
                System.out.println("Pack "+packs.get(i).getName()+" with adress "+packs.get(i).getAdres());
            }
        }
    }

    public List<Courier> getCouriers() {
        return couriers;
    }

    public List<Pack> getPacks() {
        return packs;
    }

    public void setCouriers(List<Courier> couriers) {
        this.couriers = couriers;
    }

    public void setPacks(List<Pack> packs) {
        this.packs = packs;
        generateNumberForPacks();
    }

    private Region region;
    private List<Courier> couriers = new ArrayList<>();
    private List<Pack> packs = new ArrayList<>();
}
