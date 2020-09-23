public class Dog {
    private String name;
    private int age;

    public Dog(String s, int i, int i1) {
        name = s;
        age = i;
    }

    public Dog(String sobaka, int i) {
        name = sobaka;
        age = i;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ageMen=" + age * 7 +
                '}';
    }
}
