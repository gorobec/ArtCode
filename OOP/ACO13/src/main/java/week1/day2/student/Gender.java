package week1.day2.student;

/**
 * Created by gorobec on 04.06.16.
 */
public enum Gender {

    MALE{
        public void say(){
            System.out.println("Male");
        }

    },FEMALE{
        public void say(){
            System.out.println("Female");
        }
    };
    public abstract void say();
}
