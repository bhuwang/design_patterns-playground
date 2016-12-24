/**
 * 
 */
package com.bhuwan.designpatterns.creational.prototype;

import java.util.List;

/**
 * @author bhuwan
 *
 */
public class StatementShallow implements Cloneable {

    int i;
    private String sql;
    private List<String> parameters;
    Record record;

    public StatementShallow(int i, String sql, List<String> parameters, Record record) {
        this.i = i;
        this.sql = sql;
        this.parameters = parameters;
        this.record = record;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /**
     * @return the sql
     */
    public String getSql() {
        return sql;
    }

    /**
     * @return the parameters
     */
    public List<String> getParameters() {
        return parameters;
    }

    /**
     * @return the record
     */
    public Record getRecord() {
        return record;
    }

    /**
     * @param record
     *            the record to set
     */
    public void setRecord(Record record) {
        this.record = record;
    }

    /**
     * @param sql
     *            the sql to set
     */
    public void setSql(String sql) {
        this.sql = sql;
    }

    /**
     * @return the i
     */
    public int getI() {
        return i;
    }

    /**
     * @param i
     *            the i to set
     */
    public void setI(int i) {
        this.i = i;
    }

}
