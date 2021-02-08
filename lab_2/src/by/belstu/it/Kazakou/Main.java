package by.belstu.it.Kazakou;
import by.belstu.it.Kazakou.RenamedClass;

public class Main {

    public static void main(String[] args) {
        RenamedClass createdObject = new RenamedClass();
        createdObject.OnCreate();
        for (int i = 0; i<9;i++)
        {
            if(i>-1 && i<10)
                System.out.println(i);
        }

    }
}


