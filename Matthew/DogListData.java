package Matthew;

import Matthew.DogList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DogListData {


    public static void main(String[] args) {
        DogList d1 = new DogList();
        d1.setVinNum(11);
        d1.setBreed("Pitbull");

        DogList d1 = new DogList();
        d2.setVinNum(22);
        d2.setBreed("German_Shepard");

        DogList d1 = new DogList();
        d3.setVinNum(33);
        d3.setBreed("Huskey");

        DogList d1 = new DogList();
        d4.setVinNum(44);
        d4.setBreed("Labrador");

        List AllowingDogDuplicates = new ArrayList();
        AllowingCarDuplicates.add(d1);
        AllowingCarDuplicates.add(d2);
        AllowingCarDuplicates.add(d3);
        AllowingCarDuplicates.add(d4);

        System.out.println("The Dogs in the list are " + AllowingDogDuplicates.size());


        Set NoDogDuplicates = new HashSet();
        NoDogDuplicates.add(c1);
        NoDogDuplicates.add(c2);
        NoDogDuplicates.add(c3);
        NoDogDuplicates.add(c4);

        System.out.println("The Dogs in the list are  " + NoDogDuplicates.size());

    }


}