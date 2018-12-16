import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
            Courier c1 = new Courier("Pan Zbyszek");
            Courier c2 = new Courier("Pan Kaziu");
            c1.setRegion(500); /* 500 - symbolizuje, że będzie rozwoził paczki od numerów 0 - 500*/
            c2.setRegion(1000); /* 1000 - symbolizuje, że będzie rozwoził paczki od numerów 501 - 1000*/

            Pack p1 = new Pack("Zabawki","Złotoskos");
            Pack p2 = new Pack("Telewizor","Piaseczno");
            Pack p3 = new Pack("Gry","Konstancin");
            Pack p4 = new Pack("Klocki","Warszawa");
            Pack p5 = new Pack("Telefon","Głosków");
            Pack p6 = new Pack("Zabawki","Lesznowola");
            Pack p7 = new Pack("Planszówki","Gołków");

            ArrayList<Courier> couriers = new ArrayList<>();
            couriers.add(c1);
            couriers.add(c2);

            ArrayList<Pack> packs = new ArrayList<>();
            packs.add(p1);
            packs.add(p2);
            packs.add(p3);
            packs.add(p4);
            packs.add(p5);
            packs.add(p6);
            packs.add(p7);

            SortingMachine sort = new SortingMachine(new Region());
            sort.setCouriers(couriers);
            sort.setPacks(packs);
            sort.generatePackForCurier();


            /*c1.printStatusForCurier(Status.GIVEN);
            c2.printStatusForCurier(Status.GIVEN);*/

            /*sort.printStatusForPacks(Status.GIVEN);*/

           /* c1.deliveredPack(0);
            c1.deliveredPack(1);
            c1.notDeliveredPack(2);

            c2.deliveredPack(0);
            c2.deliveredPack(1);
            c2.deliveredPack(2);
            c2.notDeliveredPack(3);*/



            c1.printStatusForCurier(Status.GIVEN);
            System.out.println("----------------------");
            c2.printStatusForCurier(Status.GIVEN);

       /* System.out.println(c1.getNumberPackers());
        System.out.println(c2.getNumberPackers());*/
             System.out.println("----------------------");
            sort.printStatusForPacks(Status.GIVEN);


    }
}
