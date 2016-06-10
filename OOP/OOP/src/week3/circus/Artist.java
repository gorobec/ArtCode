package week3.circus;


import java.io.Serializable;

abstract class Artist implements Serializable {
    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    private String specialization;
    private String name;
    private int age;
    private long salary = 0;
    private int actionTimes = 0;

    public void setActionTimes(int actionTimes) {
        this.actionTimes = actionTimes;
    }

    public int getActionTimes() {
        return actionTimes;
    }

    public Artist(String name) {
        this.name = name;
    }

    public Artist(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        if (this instanceof Acrobat)
            salary += (salary * 0.1);
        this.salary += salary;
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

    abstract void acting();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(o == null) return false;
        if (!(o instanceof Artist)) return false;

        Artist artist = (Artist) o;

        if (age != artist.age) return false;
        if (name != null ? !name.equals(artist.name) : artist.name != null) return false;


        return true;
    }


    @Override
    public String toString() {
        return String.format("%s, %d years\n", name, age);
    }
}

