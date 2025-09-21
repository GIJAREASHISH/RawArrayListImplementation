package RawHashMapImplementation;

import java.util.HashMap;
import java.util.Iterator;

public class MyHashMap<K,V> {
    Entry<K,V>[] table;


            MyHashMap(){

                this.table = new Entry[10];
            }



            class Entry<K,V>{

                public Entry[] table;
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

                Entry<K, V> entry = new Entry<>(key, value);
                this.table[index]= entry;
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


        MyHashMap<Integer,Integer> hashmap= new MyHashMap<Integer,Integer>();

        hashmap.put(1,1000);
        hashmap.put(2,2000);
        hashmap.put(3,3000);
        hashmap.put(11, 2000);


        System.out.println(hashmap);





    }
}
