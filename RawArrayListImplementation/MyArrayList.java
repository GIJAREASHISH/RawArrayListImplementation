package RawArrayListImplementation;

public class MyArrayList {

    int size=0;
    int capacity;
    int[] arr;

    //Constructor
    MyArrayList(int[] arr1){

        this.arr=arr1;
        this.size=0;

    }

    //Adding Value in ArrayList
    public void add(int value){
        if(size==arr.length){
            resize();
        }
        arr[size]=value;
        size++;
    }

    //Override String Method
    public String toString(){
        for(int i=0;i<=size;i++){

            System.out.println(arr[i]);
            //System.out.println(arr.length);
        }
        return "";
    }

    //Resize Method
    /* When Array hit its initial size then it will double the size(Concept of ArrayList)
     */
    public void resize(){
        capacity=arr.length*2;
        int[] newArr=new int[capacity];
        for(int i=0;i<arr.length;i++){

            newArr[i]=arr[i];
        }
        arr=newArr;
    }

    //Get Index Method
    public int getIndex(int value){

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==value)
            {
                return i;
            }
        }

        return -1;

    }

    //Get Value Method
    public int get(int index){

        for(int i=0;i<arr.length;i++){

            if(index==i){
                return arr[i];
            }
        }

        return -1;
    }

    public void remove(int index){

        for(int j=index;j<size-1;j++){

            arr[j]=arr[j+1];

        }
        arr[size-1]=0;
        size--;
    }







}
