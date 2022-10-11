package org.example;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MyArrayList<String> array = new MyArrayList<>(3);

        array.add("walid");
        array.add("bora");
        array.add("hamza");
        //array.add("gri3a");

        for(int i = 0 ; i < array.getSize() ; i++)
        {
            System.out.println(array.get(i));
        }

        System.out.println(array.getCapacity());

    }

}
