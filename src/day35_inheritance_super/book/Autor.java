package day35_inheritance_super.book;

import my_utilitis.StringUtil;

public class Autor {
    private String name;
    private int age;

    public Autor(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String result = "";
        for (String each: name.split(" ")) {
            result += StringUtil.FixFormat(each) + " ";
        }
        // result = "Jojo Moyes "
        this.name = result.trim();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 10) {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "Autor: " +
                "name - " + name +
                ". age - " + age;
    }
}
