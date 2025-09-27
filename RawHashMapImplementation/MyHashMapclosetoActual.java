package RawHashMapImplementation;

import java.util.Iterator;
import java.util.LinkedList;



public class MyHashMapclosetoActual<K,V> {

    int size;
    int capacity=16;
    float loadFactor = 0.75f;
    //Array of buckets, Used linkedlist to overcome collision
    LinkedList<Entry<K,V>>[] table;
    LinkedList<Entry<K,V>>[] newtable;

    //Constructor fixed size linked list initially
    MyHashMapclosetoActual(){

        this.table = new LinkedList[capacity];
        System.out.println(this.table.length);
        this.size=0;
    }



    class Entry<K,V>{

        public MyHashMap.Entry[] table;
        K key;
        V value;

        Entry(K key,V value){
            this.key=key;
            this.value=value;

        }
        public String toString() {
            return key + "=" + value;
        }


    }

    public void put(K key, V value){

        int index =key.hashCode()%table.length;

        if(size==table.length*loadFactor){
            resize(key,value);
        }

        if(table[index]==null){
            table[index] = new LinkedList<>();
        }

        for(Entry<K,V> entry: table[index]){

            if(entry.key.equals(key)){

                entry.value=value;
                return;
            }
        }
        table[index].add(new Entry<>(key,value));
    }

    /*Wrong Resize Implementation*/
    public void resize(K key, V v){
            int newCapacity=capacity*2;

            LinkedList<Entry<K,V>>[] newtable= new LinkedList[newCapacity];

            //Initialize new bucket
            for(int i=0;i<newCapacity;i++){
                newtable[i]=new LinkedList<>();
            }

            //Copy all enties
            for(LinkedList<Entry<K,V> >bucket: table){

               for(Entry<K,V> entry: bucket){

                   int newIndex=(entry.key.hashCode())%newCapacity;

                   newtable[newIndex].add(entry);


               }
            }

        table=newtable;
            capacity=newCapacity;
    }

    public V get(K key){
        int index =key.hashCode()%table.length;
        if(table[index]!=null){
            for(Entry<K,V> entry: table[index] ){

                if(entry.key.equals(key)){

                    return entry.value;
                }
            }
        }
        return null;
    }

    public void remove(K key){

        int index = key.hashCode()%table.length;

        if(table[index]!=null){
//            for(Entry<K,V> entry: table[index]){
//
//                if(entry.key.equals(key)){
//                    entry.value=null;
//                    entry.key=null;
//                }

//            }

            Iterator<Entry<K,V>> iterator= table[index].iterator();
            while(iterator.hasNext()){
                Entry<K,V> entry= iterator.next();
                if(entry.key.equals(key)){
                    iterator.remove();
                    return;
                }
            }
        }

    }

    public String toString() {
        String result = "";
        for (int i = 0; i < table.length; i++) {
            if (table[i] != null)
                result =result+ table[i] + "\n";
        }
        return result;
    }



    public static void main(String[] args){


        MyHashMapclosetoActual<Integer,Integer> hashmap= new MyHashMapclosetoActual<Integer,Integer>();

        hashmap.put(1,1000);
        hashmap.put(2,2000);
        hashmap.put(3,3000);
        hashmap.put(11,3000);

        System.out.println(hashmap.get(2));



        System.out.println(hashmap);

    }
}
