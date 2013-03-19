package com.aakashdemo.apps;




import java.io.File;



import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.webkit.WebView;


public class Clicker extends Activity{
	WebView browser;
	public void onCreate(Bundle save)
	{
		super.onCreate(save);
setContentView(R.layout.htmlcontent);
		
		browser = (WebView)findViewById(R.id.webview);
		if (new File("/mnt/extsd/Instructions/clicker.html").exists())
	    		
			{    
			browser.loadUrl("file:\\mnt\\extsd\\Instructions\\clicker.html");
			}
	        
	        else if(new File("/mnt/sdcard/Instructions/clicker.html").exists())
	        {
	        	browser.loadUrl("file:\\mnt\\sdcard\\Instructions\\clicker.html");
	        }
	        
	        else
	        {
	        	browser.loadUrl("file:\\android_asset\\clicker.html");
	        }    
     
		

	}
	
	
	public void Proceed(View v)
	{
		Intent LaunchIntent = getPackageManager().getLaunchIntentForPackage("com.iitb");
		
		 if(LaunchIntent != null) {
	            startActivity( LaunchIntent );
	        } else {
	        	
	        	AlertDialog.Builder builder = new AlertDialog.Builder(this);
	        	builder.setIcon(R.drawable.clicker);
	        	builder.setTitle("CLICKER is not installed in the tablet !!!");
	        	builder.setMessage(	"Please install CLICKER!!!!")
	        	
	        	       .setCancelable(false)
	        	       .setPositiveButton("OK", new DialogInterface.OnClickListener() {
	        	           public void onClick(DialogInterface dialog, int id) {
	        	        	
	        	        	   Clicker.this.finish();
	        	        	
	        	           }
	        	       });
	        	AlertDialog alert = builder.create();   
	        	alert.show();
	    	
	    	
	           
	        }
		
	}

}
