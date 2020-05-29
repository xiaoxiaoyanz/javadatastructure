package com.wucc.createtable;

import com.wucc.createtable.easycode.entity.ApslSysTableColumn;

import java.util.List;

public class CreateTableUtils {

	private static String BEGIN = "create table";
	private static String end = "COMMENT='表注释'\n" +
			              "COLLATE='utf8_general_ci'\n" +
			              "ENGINE=InnoDB";

	public static String  createTable(String tableName, List<ApslSysTableColumn> columns){

		for (ApslSysTableColumn column : columns) {

		}

		return null;
	}

	public static String  createIndex(){
		return null;
	}

	private static String getType(String type){
		switch (type) {
			case "text":
				return "VARCHAR";
			case "int":
				return "INT";
			case "float":
				return "DECIMAL";
			case "date":
				return "DATETIME";
			default:
				return "ERROR";
		}
	}


}
