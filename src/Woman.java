public class Woman {
    private int age;
    private float weight;
    private String name;

    public int getAge2() {
        return age2;
    }

    public void setAge2(int age2) {
        this.age2 = age2;
    }

    private int age2;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public Woman(int age, float weight, String name, int age2){
        this.age2 = age2;
        this.age = age;
        this.weight = weight;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
