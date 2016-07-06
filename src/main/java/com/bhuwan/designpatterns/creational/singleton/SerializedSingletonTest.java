/**
 * 
 */
package com.bhuwan.designpatterns.creational.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author bhuwan
 *
 */
public class SerializedSingletonTest {

    /**
     * @param args
     * @throws IOException
     * @throws FileNotFoundException
     * @throws ClassNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        SerializedSingleton instanceOne = SerializedSingleton.getInstance();

        // Serialize
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
        oos.writeObject(instanceOne);
        oos.close();

        // De-serialize
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("singleton.ser"));
        SerializedSingleton instanceTwo = (SerializedSingleton) ois.readObject();
        ois.close();

        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }

}
