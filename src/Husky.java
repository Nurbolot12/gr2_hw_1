public class Husky extends Dog{
    private int age;

    public Husky(DogHaus dogHaus, Zoo zoo, String name, int age) {
        super(dogHaus, zoo, name);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void voice() {
        super.voice();
        System.out.println("У-У-У-У-У-У");
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nage: " + age;
    }
}


