package hello.model;

import hello.model.AnimalFood;

public class Animals {

    String species;
    int weight;
    AnimalFood animalFood;

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public AnimalFood getAnimalFood() {
        return animalFood;
    }

    public void setAnimalFood(AnimalFood animalFood) {
        this.animalFood = animalFood;
    }
}
