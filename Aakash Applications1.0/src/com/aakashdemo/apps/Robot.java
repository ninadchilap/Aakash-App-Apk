package com.aakashdemo.apps;




import java.io.File;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.webkit.WebView;



public class Robot extends Activity{
	
	WebView browser;
	public void onCreate(Bundle save)
	{
		super.onCreate(save);
	
		setContentView(R.layout.htmlcontent);
		
		browser = (WebView)findViewById(R.id.webview);
		
		if (new File("/mnt/extsd/Instructions/robot.html").exists())
    		
			{    
			browser.loadUrl("file:\\mnt\\extsd\\Instructions\\robot.html");
			}
        
        else if(new File("/mnt/sdcard/Instructions/robot.html").exists())
        {
        	browser.loadUrl("file:\\mnt\\sdcard\\Instructions\\robot.html");
        }
        
        else
        {
        	browser.loadUrl("file:\\android_asset\\robot.html");
        }    
		
		
	}   
	

	public void Proceed(View v)
	{
		Intent LaunchIntent = getPackageManager().getLaunchIntentForPackage("in.ac.iitb.aakash.robo");
		 if(LaunchIntent != null) {
	            startActivity( LaunchIntent );
	        } else {
	        	
	        	AlertDialog.Builder builder = new AlertDialog.Builder(this);
	        	builder.setIcon(R.drawable.robot);
	        	builder.setTitle("Robo Controller is not installed in the tablet !!!");
	        	builder.setMessage(	"Please install Robo Contoller!!!!")
	        	
	        	       .setCancelable(false)
	        	       .setPositiveButton("OK", new DialogInterface.OnClickListener() {
	        	           public void onClick(DialogInterface dialog, int id) {
	        	        	
	        	        	   Robot.this.finish();
	        	        	
	        	           }
	        	       });
	        	AlertDialog alert = builder.create();   
	        	alert.show();
	    	
	    	
	           
	        }
		
	}

}
