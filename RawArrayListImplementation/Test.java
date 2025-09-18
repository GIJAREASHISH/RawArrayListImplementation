package RawArrayListImplementation;

public class Test {

    public static void main(String[] args){

        //Initial Size 2
        int[] arr1= new int[2];


        MyArrayList list = new MyArrayList(arr1);

        //System.out.println(obj);
        list.add(15);
        list.add(13);
        list.add(10);
        //Added Extra value at Index 3
        list.add(9);

//        int index=list.getIndex(10);
//        System.out.println("Index is" +index);
//
//        int value=list.get(3);
//        System.out.println("Value is" +value);
//
//        System.out.println(list.toString());

        list.remove(2);

        System.out.println(list.toString());


    }
}
