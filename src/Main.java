public class Main {
    public static void main(String[] args) {
        dog dog1 = new dog();
        dog dog2 = new dog("sharic",40,15);
        System.out.println(dog2.getName());
        System.out.println(dog2.getWeight());
        System.out.println(dog2.getAge());


        cat cat1 = new cat();
        cat cat2 = new cat("blac","Murka", 10);
        System.out.println(cat2.getColor());
        System.out.println(cat2.getName());
        System.out.println(cat2.getAge());


        fish fish1 = new fish();
        fish fish2 = new fish("Nemo","Ocean",8);
        System.out.println(fish2.getAdres());
        System.out.println(fish2.getName());
        System.out.println(fish2.getAge());
        }


    }
