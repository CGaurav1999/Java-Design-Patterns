package org.patterns.creational;

import java.io.*;
import java.lang.reflect.Constructor;

/*
1) create private constructor
2) create static method to get object
3) in method check if object is null then create new method else return the previously
   created object
 */
class Samosa implements Serializable,Cloneable {
    private static Samosa samosa;
    private  Samosa() {
        //in case of reflection api
        if(samosa != null){
            throw  new RuntimeException("object is already created! You are trying to break the singleton pattern");
        }
    }
    //lazy way of creating object
    //multi-threading safety using synchronization
    //synchronized can be used on method level or for a block
    public static Samosa getSamosa(){
        if(samosa == null) {
            synchronized(Samosa.class) {
                if (samosa == null) {
                    samosa = new Samosa();
                }
            }
        }
        return samosa;
    }

    //we can skip breaking of singleton design pattern by serialization by implementing readResolve methos
    public Object readResolve(){
        return samosa;
    }

    //we can skip breaking of singleton design pattern by overring cloning method and giving our own implementation
    public Object clone() throws CloneNotSupportedException {
//        return super.clone();  //->>usually we do for cloning objects
        return samosa;   //out own implementation
    }
}

class Jalebi{
    //eager way of initialization
    private static Jalebi jalebi = new Jalebi();
    public static Jalebi getJalebi(){
        return jalebi;
    }
}
public class SingletonDesignPattern {
    public static void main(String[] args) throws Exception {
//        Samosa s1 = Samosa.getSamosa();
//        System.out.println(s1.hashCode());
//        Constructor<Samosa> constructor = Samosa.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        Samosa s2 = constructor.newInstance();
//        System.out.println(s2.hashCode());

        Samosa s1 = Samosa.getSamosa();
        //breaking singleton using serialization and deserialization
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.ob"));
        oos.writeObject(s1);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.ob"));
        Samosa s2= (Samosa) ois.readObject();

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

    }

}

/*
singleton design pattern can be broken using Reflection API
actually reflection api object can access the private members of class and can make them public
 */