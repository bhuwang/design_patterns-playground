/**
 * 
 */
package com.bhuwan.designpatterns.creational.singleton;

/**
 * <pre>
 * Since reflection can destroy all the reflection implementation, to overcome this situation with Reflection, 
 * Joshua Bloch [Author of book effective java] suggests the use of Enum to implement Singleton design pattern
 * as Java ensures that any enum value is instantiated only once in a Java program. 
 * 
 * Since Java Enum values are globally accessible, so is the singleton.
 * 
 * Your enum declaration actually compiles to something like:
 *   public final class EnumWay {
 *      //enum class has an implicit private empty constructor:
 *      private EnumWay() {
 *      }
 *      public final static EnumWay INSTANCE = new EnumWay(); 
 *   }
 * </pre>
 * 
 * @author bhuwan
 *
 */
public enum EnumWay {
    INSTANCE;
}
