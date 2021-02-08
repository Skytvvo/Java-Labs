package by.belstu.it.Kazakou;

public class RenamedClass {
    private int field;

    public int getField() {
        return field;
    }

    public void setField(int field) {
        this.field = field;
    }

    public void OnCreate()
    {
        for (int counter = 0; counter < 10; counter++) {
            System.out.println("Counter " + counter);
        }
    }

    public String GetValue()
    {
        ExtractedMethod();

        return "Hello form First project";
    }

    public RenamedClass() {
        this.field = 25;
    }

    private void ExtractedMethod() {
        System.out.println("Helloooooo meeeen");
    }

}

