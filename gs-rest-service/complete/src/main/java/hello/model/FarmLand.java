package hello.model;

import hello.model.Animals;
import hello.model.Crops;

public class FarmLand {

    String nameLand;
    int acres;
    Animals[] farmAnimals;
    Crops[] cropType;


    public String getNameLand() {
        return nameLand;
    }

    public void setNameLand(String nameLand) {
        this.nameLand = nameLand;
    }

    public int getAcres() {
        return acres;
    }

    public void setAcres(int acres) {
        this.acres = acres;
    }

    public Animals[] getFarmAnimals() {
        return farmAnimals;
    }

    public void setFarmAnimals(Animals[] farmAnimals) {
        this.farmAnimals = farmAnimals;
    }

    public Crops[] getCropType() {
        return cropType;
    }

    public void setCropType(Crops[] cropType) {
        this.cropType = cropType;
    }


}
