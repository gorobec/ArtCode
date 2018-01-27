package week3.day1;

import com.sun.org.apache.xpath.internal.functions.WrongNumberArgsException;

/**
 * Нули
 * Требуется найти самую длинную непрерывную цепочку нулей  и единиц в последовательности цифр.
 * Вход:
 * 10001101001
 * Выход:
 * (2,4) - цепочка нулей
 * (5,6) - цепочка единиц
 * @author Yevhen Vorobiei
 * @since JDK 1.8
 */
public class ZeroAndOne {


    public static int[] findLongestZeroLine(String line) throws WrongNumberArgsException {

        return getInts(line, '0');
    }

    public static int[] findLongestOneLine(String line) throws WrongNumberArgsException {

        return getInts(line, '1');
    }

    private static int[] getInts(String line, char symbol) throws WrongNumberArgsException {
        if (line == null) throw new WrongNumberArgsException("Line couldn't be null");
        if(line.isEmpty()) return new int[] {0, 0};

        int firstIdx = line.indexOf(symbol);
        int lastIdx = firstIdx;


        for (int j = firstIdx; j < line.length(); ) {
            int firstIdxTmp = line.indexOf(symbol, j);
            int lastIdxTmp = firstIdxTmp;

            if(firstIdxTmp == -1) break;
            for (int i = firstIdxTmp + 1; i < line.length(); i++) {
                if(line.charAt(i) != symbol) break;
                lastIdxTmp = i;
            }

            if(lastIdxTmp - firstIdxTmp > lastIdx - firstIdx) {
                firstIdx = firstIdxTmp;
                lastIdx = lastIdxTmp;
            }
            j = lastIdxTmp + 1;
        }

        return new int [] {firstIdx + 1 , lastIdx + 1};
    }
}
