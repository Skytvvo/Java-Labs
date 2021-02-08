package by.belstu.it.Kazakou.basejava;

import java.util.Objects;

public class WrapperString {


/**
 * @author Ilya
 * @version 1
 *
 *
 *
 *
 * */

    public void replace(char oldchar, char newChar)
    {
        oldchar = newChar;
    }


    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public WrapperString(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "WrapperString{" +
                "str='" + str + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WrapperString that = (WrapperString) o;
        return Objects.equals(str, that.str);
    }

    @Override
    public int hashCode() {
        return Objects.hash(str);
    }
}

