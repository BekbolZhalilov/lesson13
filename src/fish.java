public class fish {

    private String name;
    private String adres;
    private int age;

    public fish(){

    }
    public fish(String name,String adres, int age){
        this.name = name;
        this. adres = adres;
        this. age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
