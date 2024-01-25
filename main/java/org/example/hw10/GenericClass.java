package org.example.hw10;

public class GenericClass<T> {

    private T genericField;

    public GenericClass (T genericField)  {
        this.genericField =genericField;

}

public void  printGenericField() {
    System.out.println("Generic field: " + genericField);
}

}
