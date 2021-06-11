package com.sgtest.autoitdemo;

public class AutoitDemo {


	public static void main(String[] args) {
		executeAutoITScript();
	}

	static void executeAutoITScript()
	{
		try
		{
			Runtime.getRuntime().exec("D:\\UDDIN1\\autoitdemo.exe");
		}catch(Exception e)
		{

			e.printStackTrace();
		}
	}



}


