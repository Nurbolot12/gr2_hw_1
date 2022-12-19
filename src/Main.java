
        public class Main {
            public static void main(String[] args) {
                DogHaus dogHaus = new DogHaus("kitchen","leavingRoom","bedRoom");
                Dog dog = new Dog(dogHaus,Zoo.DOG,"Lox");
                System.out.println(dog.getInfo());
                dog.voice();
                dog.voice();
                Husky husky = new Husky(dogHaus,Zoo.LIEN,"Jp", 2);
                System.out.println(husky.getInfo());
                husky.voice();
                Husky husky1 = new Husky(dogHaus,Zoo.DOG,"GG",15);
                System.out.println(husky1.getInfo());
                husky1.voice();
            }
        }

