package RawArrayListImplementation;

public class MyArrayListwithGenerics<T> {

     private int size;
     private int capacity;
     private T[] arr;


    MyArrayListwithGenerics(T[] arr1){

       this.arr= (T[]) new Object[arr1.length];

        this.capacity=arr1.length;

        // Only copy non-null values from arr1
        for(int i=0;i<arr.length;i++){
            if (arr1[i] != null) {
                this.arr[size] = arr1[i];
                size++;
            }

        }

    }

    public void add(T value){

    //Check if array size is equal to the size of array length then call resize method
        if(size==arr.length){
           resize();
            System.out.println("Size is equal "+size+"to arr length"+arr.length );
        }
        //put value in index
        arr[size]=value;
         size++;

    }




    //Return
    public T get(int index){

        for(int i=0;i<arr.length;i++){

            if(i==index){

                return arr[i];
            }
        }

        return null;
    }

    //Return Index
    public int getIndex(T value) throws Error{

        for(int i=0;i<arr.length;i++){

            if(arr[i].equals(value)){

                return i;
            }
        }

        return -1;
    }

    public void resize(){

        int newcapacity =arr.length*2;
        T[] newArr= (T[])new Object[newcapacity];

        for(int i=0;i<size;i++){

        newArr[i]=arr[i];
        }
        arr=newArr;
        capacity=newcapacity;

    }

    public String toString(){

        for(int i=0;i<size;i++){

            System.out.println(arr[i]);
        }

        return"";
    }


    public static void main(String[] args){

        Integer[] arr=new Integer[2];

//        MyArrayListwithGenerics<Integer> list= new MyArrayListwithGenerics<>(arr);
//        list.add(6);
//        list.add(14);
//        list.add(2);
        //System.out.println(list);
        //System.out.println(list.getIndex(2));


        //String Example
        String[] arr2=new String[2];
        MyArrayListwithGenerics<String> list1= new MyArrayListwithGenerics<String>(arr2);
        list1.add("Ashish");
        list1.add("Gijare");
        list1.add("QA");

        try{
       System.out.println(list1.getIndex("SS"));
        }
        catch(Exception e){
            System.out.println("Not Found");


        }

    }

}
