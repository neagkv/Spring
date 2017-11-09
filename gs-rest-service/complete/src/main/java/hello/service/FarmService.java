package hello.service;

import hello.model.AnimalFood;
import hello.model.Animals;
import hello.model.Crops;
import hello.model.FarmLand;
import org.springframework.stereotype.Service;

@Service
public class FarmService {


    public FarmLand makenewLand(int numAnimals, int numCrops) {
        FarmLand f = new FarmLand();
        Animals[] animals = new Animals[numAnimals];
        Crops[] crops = new Crops[numCrops];


        for (int i = 0; i < numAnimals; i++) {
            Animals a = new Animals();
            Animals b = new Animals();
            a.setSpecies("Horse");
            a.setWeight(1200);
            a.setAnimalFood(new AnimalFood("grass"));
            b.setSpecies("Horse");
            b.setWeight(1500);
            b.setAnimalFood(new AnimalFood("Hay"));

            animals[i] =  b;

        }

        for(int i =0; i< numCrops; i++) {
            Crops c = new Crops();
            c.setPlantType("Cron");
            c.setWeight(50);
            crops[i] = c;
        }


        f.setNameLand("Area 51");
        f.setAcres(200);
        f.setCropType(crops);
        f.setFarmAnimals(animals);

        return f;
    }
}
