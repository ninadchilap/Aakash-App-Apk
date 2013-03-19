package com.aakashdemo.apps;


import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class AakashApplicationsActivity extends Activity {
	/** Called when the activity is first created. */
	static final int CUSTOM_DIALOG_ID = 0;
	static final int CUSTOM_DIALOG_ID1 = 1;

	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		findViewById(R.id.clicker).setOnClickListener(
				new View.OnClickListener() {
					public void onClick(View view) {
						Intent intent = new Intent(AakashApplicationsActivity.this,Clicker.class);
					  startActivity(intent);
					}
				});
		findViewById(R.id.robot).setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				//Intent LaunchIntent = getPackageManager().getLaunchIntentForPackage("in.ac.iitb.aakash.robo");
				//startActivity(LaunchIntent);
				Intent intent = new Intent(AakashApplicationsActivity.this,Robot.class);
				
				  startActivity(intent);
			}
		});
		findViewById(R.id.proxymity).setOnClickListener(
				new View.OnClickListener() {
					public void onClick(View view) {
						Log.d("Proxymity", "dialog");
						
				    	Intent intent = new Intent(AakashApplicationsActivity.this,ProxyMITY.class);
						
						  startActivity(intent);
					

					}
				});
		findViewById(R.id.wifi).setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				Log.d("Proxymity wifi", "dialog");
				//Intent LaunchIntent = getPackageManager().getLaunchIntentForPackage("com.iitb.promitywifi");
				//startActivity(LaunchIntent);
				Intent intent = new Intent(AakashApplicationsActivity.this,Proximity_WiFi.class);
				
				  startActivity(intent);
			//	showDialog(CUSTOM_DIALOG_ID1);
			}
		});
		
		
		
		findViewById(R.id.blender).setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				//Log.d("Proxymity wifi", "dialog");
				Intent LaunchIntent = getPackageManager().getLaunchIntentForPackage("com.iitb.blender.animation");
				
				 if(LaunchIntent != null) {
			            startActivity( LaunchIntent );
			        } else {
			        	
			        	AlertDialog.Builder builder = new AlertDialog.Builder(AakashApplicationsActivity.this);
			        	builder.setIcon(R.drawable.blender_animation_icon);
			        	builder.setTitle("Blender is not installed in the tablet !!!");
			        	builder.setMessage(	"Please install Blender Application!!!!")
			        	
			        	       .setCancelable(false)
			        	       .setPositiveButton("OK", new DialogInterface.OnClickListener() {
			        	           public void onClick(DialogInterface dialog, int id) {
			        	        	
			        	        	  // AakashApplicationsActivity.this.finish();
			        	        	
			        	           }
			        	       });
			        	AlertDialog alert = builder.create();   
			        	alert.show();
			    	
			    	
			           
			        }
				
				
			//	showDialog(CUSTOM_DIALOG_ID1);
			}
		});
		
		
		findViewById(R.id.educational).setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				///Log.d("Proxymity wifi", "dialog");
				Intent LaunchIntent = getPackageManager().getLaunchIntentForPackage("com.android.example");
				 if(LaunchIntent != null) {
			            startActivity( LaunchIntent );
			        } else {
			        	
			        	AlertDialog.Builder builder = new AlertDialog.Builder(AakashApplicationsActivity.this);
			        	builder.setIcon(R.drawable.educational_content_icon);
			        	builder.setTitle("Educational Content is not installed in the tablet !!!");
			        	builder.setMessage(	"Please install Educational Content!!!!")
			        	
			        	       .setCancelable(false)
			        	       .setPositiveButton("OK", new DialogInterface.OnClickListener() {
			        	           public void onClick(DialogInterface dialog, int id) {
			        	        	
			        	        	  // AakashApplicationsActivity.this.finish();
			        	        	
			        	           }
			        	       });
			        	AlertDialog alert = builder.create();   
			        	alert.show();
			    	
			    	
			           
			        }
				
			//	showDialog(CUSTOM_DIALOG_ID1);
			}
		});
		
	}

	@Override
	protected void onPrepareDialog(int id, Dialog dialog, Bundle bundle) {
		// TODO Auto-generated method stub
		super.onPrepareDialog(id, dialog, bundle);

		switch (id) {
		case CUSTOM_DIALOG_ID:
			//
			break;
		}

	}

}
