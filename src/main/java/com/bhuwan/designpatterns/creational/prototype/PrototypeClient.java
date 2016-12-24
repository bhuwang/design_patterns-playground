/**
 * 
 */
package com.bhuwan.designpatterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bhuwan
 *
 */
public class PrototypeClient {

    /**
     * @param args
     * @throws CloneNotSupportedException
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        String sql = "select * from movies where title = ?";
        List<String> parameters = new ArrayList<>();
        parameters.add("Star wars");
        int i = 7;

        Record record = new Record(5);
        StatementShallow statement = new StatementShallow(i, sql, parameters, record);

        System.out.println("sql: " + statement.getSql());
        System.out.println("params: " + statement.getParameters());
        System.out.println("record: " + statement.getRecord());
        System.out.println("orig i : " + statement.i + "   record: " + statement.getRecord());

        StatementShallow clone = (StatementShallow) statement.clone();

        System.out.println("sql: " + clone.getSql());
        System.out.println("params: " + clone.getParameters());
        System.out.println("record: " + clone.getRecord());

        // now change value of i which is the primitive one
        clone.i = 70;
        // now change record object which is the object change.
        clone.record.i = 50;
        System.out.println("cloned i : " + statement.getI() + "   record: " + statement.getRecord());
    }

}
