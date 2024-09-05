package bean;

public class Student {
    private int sId;
    private String name;
    private int age;
    private int bId;

    public Student(String name, int age, int bId) {
        this.name = name;
        this.age = age;
        this.bId = bId;
    }

    public Student(int sId, String name, int age, int bId) {
        this.sId = sId;
        this.name = name;
        this.age = age;
        this.bId = bId;
    }

    public Student() {

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public int getbId() {
        return bId;
    }

    public void setbId(int bId) {
        this.bId = bId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sId=" + sId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", bId=" + bId +
                '}';
    }
}
