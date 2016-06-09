package week7.hash;


public class User {
    private String name = "15151";
    private int age = 555;
    private boolean isMaried;
    private long salary = 5555555555L;
    private char sex;

    public User(String name, int age, boolean isMaried, long salary, char sex) {
        this.name = name;
        this.age = age;
        this.isMaried = isMaried;
        this.salary = salary;
        this.sex = sex;
    }
    public User(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMaried() {
        return isMaried;
    }

    public void setIsMaried(boolean isMaried) {
        this.isMaried = isMaried;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString(){
        return String.format("My name is %s, I'm %d years old\nGender - %c,\nsalary - %d\nstatus - %b", name, age, sex, salary, isMaried);
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if (obj == null)
            return false;
        if(this.getClass() != obj.getClass())
            return false;
        User tmp = (User)obj;
        if(!this.name.equals(tmp.name))
            return false;
        if(this.age != tmp.age)
            return false;
        if(this.isMaried != tmp.isMaried)
            return false;
        if(this.sex != tmp.sex)
            return false;
        if(this.salary != tmp.salary)
            return false;
        return true;
    }

    /*@Override
    public int hashCode(){
        int result = 17;
        result += name.hashCode();
        result += 31 * (isMaried ? 1 : 0);
        result += 31 * (int)sex;
        result += 31 * age;
        result += 31 * (salary^(salary >>> 32));

        return (int)result;
    }*/

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        result = 31 * result + (isMaried ? 1 : 0);
        result = 31 * result + (int) (salary ^ (salary >>> 32));
        result = 31 * result + (int) sex;
        return result;
    }
}
