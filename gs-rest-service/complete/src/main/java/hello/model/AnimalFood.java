package hello.model;

public class AnimalFood {

    String tyepOfFood = "default";


    public AnimalFood(String typeOfFood) {
        this.tyepOfFood = typeOfFood;
    }

    public String getTyepOfFood() {
        return tyepOfFood;
    }

    public void setTyepOfFood(String tyepOfFood) {
        this.tyepOfFood = tyepOfFood;
    }
}
