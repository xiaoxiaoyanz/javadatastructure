package com.wucc.automaticsql;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SqliteSQLGenerator {
	
	private static Connection conn = null;
    private static Statement sm = null;
    private static String insert = "INSERT INTO";//����sql
    private static String values = "VALUES";//values�ؼ���
    private static List<String> tableList = new ArrayList<String>();//ȫ�ִ�ű����б�
    private static List<String> insertList = new ArrayList<String>();//ȫ�ִ��insertsql�ļ�������
    private static String filePath = "E://inserttest//insertSQL.sql";//����·�� �������ݵ��ļ�

    public static String generateTableDataSQL(String sql, String[] params) {
        return null;
    }

    public static String executeSelectSQLFile(String file, String[] params) throws Exception {
        List<String> listSQL = new ArrayList<String>();
        connectSQL("com.mysql.jdbc.Driver", "jdbc:mysql://10.10.65.132:3306/cassfm?useUnicode=true&characterEncoding=UTF-8", "admin", "admin132");//�������ݿ�
        listSQL = createSQL(file);//������ѯ���
        executeSQL(conn, sm, listSQL, tableList);//ִ��sql��ƴװ
        createFile();//�����ļ�
        return null;
    }

    /**
    * ƴװ��ѯ���
    *
    * @return ����select����
    */
    private static List<String> createSQL(String file) throws Exception {
        List<String> listSQL = new ArrayList<String>();
        BufferedReader br = null;
        InputStreamReader fr = null;
        InputStream is = null;

        int i;//�����ĵ�һ���ַ�λ��
        int k;//���������һ���ַ���λ��
        String tableName;

        try {
            is = SqliteSQLGenerator.class.getResourceAsStream(file);
            fr = new InputStreamReader(is);
            br = new BufferedReader(fr);
            String rec = null;//һ��
            while ((rec = br.readLine()) != null) {
                rec = rec.toLowerCase();
                i = rec.indexOf("from ", 1) + 5;
                k = rec.indexOf(" ", i);
                if (k == -1) {
                    k = rec.length();
                }
                ;
                tableName = rec.substring(i, k);
                tableList.add(tableName);
                //��ȡ���в�ѯ���
                listSQL.add(rec.toString());
            }

        } finally {
            if (br != null) {
                br.close();
            }
            if (fr != null) {
                fr.close();
            }
            if (is != null) {
                is.close();
            }
        }
        return listSQL;
    }


 
    /**
    * ����insertsql.txt����������
    */
    private static void createFile() {
        File file = new File(filePath);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("�����ļ���ʧ�ܣ���");
                e.printStackTrace();
            }
        }
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            if (insertList.size() > 0) {
                for (int i = 0; i < insertList.size(); i++) {
                    bw.append(insertList.get(i));
                    bw.append("\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
    * �������ݿ� ����statement����
    *
    * @param driver
    * @param url
    * @param UserName
    * @param Password
    */
    public static void connectSQL(String driver, String url, String UserName, String Password) {
        try {
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url, UserName, Password);
            sm = conn.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


 
    /**
    * ִ��sql�����ز���sql
    *
    * @param conn
    * @param sm
    * @param listSQL
    * @throws SQLException
    */
    public static void executeSQL(Connection conn, Statement sm, List listSQL, List listTable) throws SQLException {
        List<String> insertSQL = new ArrayList<String>();
        ResultSet rs = null;
        try {
            rs = getColumnNameAndColumeValue(sm, listSQL, listTable, rs);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            rs.close();
            sm.close();
            conn.close();
        }
    }

    /**
    * ��ȡ��������ֵ
    *
    * @param sm
    * @param listSQL
    * @param rs
    * @return
    * @throws SQLException
    */
    private static ResultSet getColumnNameAndColumeValue(Statement sm,
                                                        List listSQL, List ListTable, ResultSet rs) throws SQLException {
        for (int j = 0; j < listSQL.size(); j++) {
            String sql = String.valueOf(listSQL.get(j));
            rs = sm.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnCount = rsmd.getColumnCount();
            while (rs.next()) {
                StringBuffer ColumnName = new StringBuffer();
                StringBuffer ColumnValue = new StringBuffer();
                for (int i = 1; i <= columnCount; i++) {
                    String value = rs.getString(i);
                    if (i == columnCount) {
                        ColumnName.append(rsmd.getColumnName(i));
                        if (Types.CHAR == rsmd.getColumnType(i) || Types.VARCHAR == rsmd.getColumnType(i)
                                || Types.LONGVARCHAR == rsmd.getColumnType(i)) {
                            if (value == null) {
                                ColumnValue.append("null");
                            } else {
                                ColumnValue.append("'").append(value).append("'");
                            }
                        } else if (Types.SMALLINT == rsmd.getColumnType(i) || Types.INTEGER == rsmd.getColumnType(i)
                                || Types.BIGINT == rsmd.getColumnType(i) || Types.FLOAT == rsmd.getColumnType(i)
                                || Types.DOUBLE == rsmd.getColumnType(i) || Types.NUMERIC == rsmd.getColumnType(i)
                                || Types.DECIMAL == rsmd.getColumnType(i)) {
                            if (value == null) {
                                ColumnValue.append("null");
                            } else {
                                ColumnValue.append(value);
                            }
                        } else if (Types.DATE == rsmd.getColumnType(i) || Types.TIME == rsmd.getColumnType(i)
                                || Types.TIMESTAMP == rsmd.getColumnType(i)) {
                            if (value == null) {
                                ColumnValue.append("null");
                            } else {
                                ColumnValue.append("timestamp'").append(value).append("'");
                            }
                        } else {
                            if (value == null) {
                                ColumnValue.append("null");
                            } else {
                                ColumnValue.append(value);
                            }
                        }
                    } else {
                        ColumnName.append(rsmd.getColumnName(i) + ",");
                        if (Types.CHAR == rsmd.getColumnType(i) || Types.VARCHAR == rsmd.getColumnType(i)
                                || Types.LONGVARCHAR == rsmd.getColumnType(i)) {
                            if (value == null) {
                                ColumnValue.append("null,");
                            } else {
                                ColumnValue.append("'").append(value).append("',");
                            }
                        } else if (Types.SMALLINT == rsmd.getColumnType(i) || Types.INTEGER == rsmd.getColumnType(i)
                                || Types.BIGINT == rsmd.getColumnType(i) || Types.FLOAT == rsmd.getColumnType(i)
                                || Types.DOUBLE == rsmd.getColumnType(i) || Types.NUMERIC == rsmd.getColumnType(i)
                                || Types.DECIMAL == rsmd.getColumnType(i)) {
                            if (value == null) {
                                ColumnValue.append("null,");
                            } else {
                                ColumnValue.append(value).append(",");
                            }
                        } else if (Types.DATE == rsmd.getColumnType(i) || Types.TIME == rsmd.getColumnType(i)
                                || Types.TIMESTAMP == rsmd.getColumnType(i)) {
                            if (value == null) {
                                ColumnValue.append("null,");
                            } else {
                                ColumnValue.append("timestamp'").append(value).append("',");
                            }
                        } else {
                            if (value == null) {
                                ColumnValue.append("null,");
                            } else {
                                ColumnValue.append(value).append(",");
                            }
                        }
                    }
                }
                //System.out.println(ColumnName.toString());
                //System.out.println(ColumnValue.toString());
                insertSQL(ListTable.get(j).toString(), ColumnName, ColumnValue);
            }
        }
        return rs;
    }


 
    /**
    * ƴװinsertsql �ŵ�ȫ��list����
    *
    * @param ColumnName
    * @param ColumnValue
    */
    private static void insertSQL(String TableName, StringBuffer ColumnName,
                                  StringBuffer ColumnValue) {
        StringBuffer insertSQL = new StringBuffer();
        insertSQL.append(insert).append(" ").append(TableName).append("(").append(ColumnName.toString())
                .append(")").append(values).append("(").append(ColumnValue.toString()).append(");");
        insertList.add(insertSQL.toString());
        System.out.println(insertSQL.toString());
    }

    public static void main(String[] args) throws Exception {
        //String file1 = "/config/export_sqlite_data_clear.cfg";
        //executeSelectSQLFile(file1, null);

        String file2 = "/config/export_sqlite_data_select.sql";
        executeSelectSQLFile(file2, null);

    }

}
