public class Dog extends Animal{
    private String name;

    public Dog(DogHaus dogHaus, Zoo zoo, String name) {
        super(dogHaus, zoo);
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public final String voice (String voice){
        return "гав - гав";


    }
    public void voice (){
        System.out.println("У-У-У-У");
    }

    @Override
    public String getInfo() {
        return super.getInfo()+ "\nname"+ name;
    }
}

