/**
 * 
 */
package com.bhuwan.designpatterns.structural.facade;

import java.sql.Connection;

import com.bhuwan.designpatterns.structural.facade.HelperFacade.DbTypes;
import com.bhuwan.designpatterns.structural.facade.HelperFacade.ReportTypes;

/**
 * @author bhuwan
 *
 */
public class TestFacade {

    /**
     * @param args
     */
    public static void main(String[] args) {
        String tableName = "Employee";
        Connection con;

        /*
         * without using facade
         */

        // MySql
        con = MySqlHelper.getMySqlConnection();
        MySqlHelper.generateMySqlHtmlReport(tableName, con);
        MySqlHelper.generateMySqlPdfReport(tableName, con);

        // Oracle
        con = OracleHelper.getOracleConnection();
        OracleHelper.generateOracleHtmlReport(tableName, con);
        OracleHelper.generateOraclePdfReport(tableName, con);

        /*
         * using facade
         */

        // MySql
        HelperFacade.generateReport(DbTypes.MYSQL, ReportTypes.HTML, tableName);
        HelperFacade.generateReport(DbTypes.MYSQL, ReportTypes.PDF, tableName);

        // Oracle
        HelperFacade.generateReport(DbTypes.ORACLE, ReportTypes.HTML, tableName);
        HelperFacade.generateReport(DbTypes.ORACLE, ReportTypes.PDF, tableName);
    }

}
