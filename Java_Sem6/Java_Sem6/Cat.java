package Java_Sem6;

class Cat {
    private static final String Objects = null;
    private String name;
    private int age;

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age &&
                Objects.equals(name, cat.name);
    }

    public int hashCode(){
        return Objects.hash(name, age);
    }

    public String getName() {
        return null;
    }

    public String getAge() {
        return null;
    }
}
