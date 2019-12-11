package com.wucc.automaticsql;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DeleteSql {
	
	private static String filePath = "E://inserttest//deleteSQL.sql";
	private static String configFile = "/config/delete.sql";
	private static String alias = "cc";
	private static String url ="jdbc:mysql://10.10.65.132:3306/cassfm?useUnicode=true&characterEncoding=utf8";
	private static String username="admin";
	private static String password="admin132";
	
	public static List<String> createSql(String file) throws Exception{
		List<String> sqlList = new ArrayList<String>();
		BufferedReader br = null;
	    InputStreamReader fr = null;
	    InputStream is = null;
	    try {
	    	 is = SqliteSQLGenerator.class.getResourceAsStream(file);
	         fr = new InputStreamReader(is);
	         br = new BufferedReader(fr);
	         String rec = null;
			 while((rec = br.readLine()) != null ) {
				 rec = rec.toLowerCase();
				 sqlList.add(rec.toString());
			 }
		}finally {
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
		return sqlList;
		
	}
	
	
	public static void queryDeleteSql(String file){
		List<String> sqlList =null;
		Connection conn= null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			//1.ע������
			Class.forName("com.mysql.jdbc.Driver");
			//2.��ȡ����
			conn = DriverManager.getConnection(url,username,password);
			//3.��ȡִ��sql������
			stmt = conn.createStatement();
			//4.��дsql���
			sqlList = createSql(file);
			
			File targetFile = new File(filePath);
	        if (!targetFile.exists()) {
	            try {
	            	targetFile.createNewFile();
	            } catch (IOException e) {
	                System.out.println("�����ļ���ʧ�ܣ���");
	                e.printStackTrace();
	            }
	        }
	        
	        //OutputStreamWriter write = new OutputStreamWriter(new FileOutputStream(f));
            //BufferedWriter writer = new BufferedWriter(write);
	        OutputStreamWriter owrite = null;
	        BufferedWriter bwrite = null;
	        try {
	        	owrite = new OutputStreamWriter(new FileOutputStream(targetFile));
	        	bwrite = new BufferedWriter(owrite);
	        	for (String sql : sqlList) {
					System.out.println(sql);
					//5.ִ��sql���
					rs = stmt.executeQuery(sql);
					//6.��������
					while(rs.next()){
						String result = rs.getString(alias);
						bwrite.write(result);
						bwrite.newLine();
					}
				}
	        	
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					bwrite.close();
	            	owrite.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	        
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(rs!=null)
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			if(stmt!=null)
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			if(conn!=null)
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			
		}
	}
	
	 public static void main(String[] args) throws Exception {
	       
	        queryDeleteSql(configFile);

	    }

}
