package stream;

public class Coder {
    private Integer id;
    private Integer age;
    private String name;
    private String hobby;

    public Coder(Integer id, Integer age, String name, String hobby) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.hobby = hobby;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
