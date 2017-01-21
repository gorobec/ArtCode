package oop_intro;

/**
 * Created by user on 04.01.2017.
 */
public class MyString {
    char[] values;

    public void init(String str){
        values = str.toCharArray();
    }

    public int length(){
        return values.length;
    }

    public boolean equals(MyString myString){

        if(myString == null || myString.values == null) return false;
        if(values.length != myString.values.length) return false;

        for (int i = 0; i < values.length; i++) {
            if(values[i] != myString.values[i]) return false;
        }
        return true;
    }
}
