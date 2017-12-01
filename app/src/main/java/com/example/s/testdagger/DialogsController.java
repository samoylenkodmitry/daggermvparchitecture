package com.example.s.testdagger;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class DialogsController {
	
	private final Activity mActivity;
	private final Navigator mNavigator;
	
	@Inject
	DialogsController(Activity activity, Navigator navigator) {
		mActivity = activity;
		mNavigator = navigator;
	}
	
	public void showDialogYouWinDialog() {
		new AlertDialog.Builder(mActivity)
			.setTitle("Congratulations!")
			.setMessage("you win a prize, just hit a button")
			.setPositiveButton("ok", new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(final DialogInterface dialog, final int which) {
					mNavigator.close();
				}
			})
			.create().show();
	}
	
	public void showDialogYouLooseDialog() {
		new AlertDialog.Builder(mActivity)
			.setTitle("We are Sorry!")
			.setMessage("you just loose,  hit a button")
			.setPositiveButton("ok", new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(final DialogInterface dialog, final int which) {
					mNavigator.close();
				}
			})
			.create().show();
		
	}
}
