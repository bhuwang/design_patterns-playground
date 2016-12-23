package com.bhuwan.designpatterns.creational.singleton;

/**
 * <pre>
 * Guarantee only one instance created
 * Usually lazy loaded
 * No parameter required for construction if required it violates the singleton principle.
 * Difficult to unit test
 * should be thread safe
 * 
 *  Java built-in examples:
 *  1. Runtime.getRuntime();
 *  2. Desktop.getDesktop();
 *  3. Toolkit.getDefaultToolkit();
 *  4. Logger.getLogger();
 *  5. Spring Beans by default implement the singleton
 *  
 *  Calendar.getInstance is not a singleton rather a prototype
 * </pre>
 */
/**
 * @author bhuwan
 *
 */