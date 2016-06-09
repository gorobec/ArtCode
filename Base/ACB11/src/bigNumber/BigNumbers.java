package bigNumber;

import utils.ArrayUtils;

public class BigNumbers {
    int value;
    private int size;
    private int[] digits;


    public BigNumbers(int value) {
        this.value = value;
        this.size = findSize(value);
        this.digits = fillArray();
    }

    public BigNumbers() {
        this.value = 0;
        this.size = findSize(value);
        this.digits = new int[size];
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    private int findSize(int value) {
        int size = 0;
        if (value == 0) return 1;
        for (; value != 0; value /= 10) {
            size ++;
        }
        return size;
    }
    private int[] fillArray() {
        int valueCopy = getValue();
        boolean isNegative = false;
        int[] array = new  int[size];
        if (valueCopy < 0) {
            valueCopy *= -1;
            isNegative = true;
        }
        for (int i = size - 1; i >= 0; i--) {
            array[i] = valueCopy % 10;
            valueCopy /= 10;
        }
        if (isNegative) array[0] *= -1;
        return array;
    }

    public BigNumbers add (BigNumbers bigNumber){
        BigNumbers newBigNumber = new BigNumbers();
        if(this.value == 0) return bigNumber;
        if(bigNumber.value == 0) return this;
//        TODO newSize
        newBigNumber.setSize(this.size >= bigNumber.size ? this.size + 1 : bigNumber.size + 1);

        int j = 0;
        for (int i =  newBigNumber.digits.length -1; i >= 0; i--) {
            //if (i != 0){
            newBigNumber.digits[i] += this.digits[(this.digits.length - 1) - j]
                    + bigNumber.digits[(bigNumber.digits.length - 1) - j];
            if (newBigNumber.digits[i] > 9){
                newBigNumber.digits[i] = newBigNumber.digits[i] % 10;
                newBigNumber.digits[i - 1] = 1;
            }
            j++;
        }
        return newBigNumber;
    }
    @Override
    public String toString() {
        return ArrayUtils.showContent(digits);

    }
}
