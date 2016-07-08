/**
 * 
 */
package com.bhuwan.designpatterns.structural.facade;

import java.sql.Connection;

/**
 * @author bhuwan
 *
 */
public class HelperFacade {

    enum DbTypes {
        MYSQL, ORACLE,
    }

    enum ReportTypes {
        PDF, HTML
    }

    public static void generateReport(DbTypes dbType, ReportTypes repoType, String tableName) {
        Connection con = null;
        switch (dbType) {
        case MYSQL:
            con = MySqlHelper.getMySqlConnection();
            switch (repoType) {
            case HTML:
                MySqlHelper.generateMySqlHtmlReport(tableName, con);
                break;
            case PDF:
                MySqlHelper.generateMySqlPdfReport(tableName, con);
                break;
            }
            break;
        case ORACLE:
            con = OracleHelper.getOracleConnection();
            switch (repoType) {
            case HTML:
                OracleHelper.generateOracleHtmlReport(tableName, con);
                break;
            case PDF:
                OracleHelper.generateOraclePdfReport(tableName, con);
                break;
            }
            break;
        }
    }
}
