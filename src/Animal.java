public class Animal {
    private  DogHaus dogHaus;
    public Zoo zoo;

    public Animal(DogHaus dogHaus, Zoo zoo) {
        this.dogHaus = dogHaus;
        this.zoo = zoo;
    }

    public DogHaus getDogHaus() {
        return dogHaus;
    }

    public Zoo getZoo() {
        return zoo;
    }
    public String getInfo(){
        return "Dog House: "+ dogHaus.getRoom1() + dogHaus.getRoom2() + dogHaus.getRoom3() +"\nZoo: "+ zoo.DOG;
    }
}

