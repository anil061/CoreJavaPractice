package Immutable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ImmutableTest {
    public static void main(String[] args) {
        Date date = new Date("10/12/2025");
        Address ad = new Address(4829, "LoasColonies", "Irving","texas");
        List<Address> adList = new ArrayList<>();
        ad.setStreetNo(4829);
        ad.setState("Texas");
        ad.setCity("Dallas");
        adList.add(ad);
        ImmutableEmp emp = new ImmutableEmp("Anil",date, adList);
        System.out.println( "Emp details " + emp);
        date.setTime(1234567890L);
        System.out.println("After External Modification  " + date);

        Address ad1 = new Address(2498, "LoasColonies", "Irving","texas");
       // emp.getJoiningDate().setTime(Long.parseLong(("10/05/2025")));
        /*emp.getAddress().add(new Address(2498, "OaksHackberry", "Irving", "Texas"));*/
        System.out.println("After getter modification: " + emp);

    }
}
