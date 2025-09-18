package RawArrayListImplementation;

public class MyArrayListwithGenerics<T> {

     int size;
     int capacity;
     T[] arr;


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

        MyArrayListwithGenerics<Integer> list= new MyArrayListwithGenerics<>(arr);
        list.add(6);
        list.add(14);
        list.add(2);


        System.out.println(list);


    }

}
