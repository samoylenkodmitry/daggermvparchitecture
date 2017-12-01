package com.example.s.testdagger;

import android.app.Activity;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Navigator {
	
	private final Activity mActivity;
	
	@Inject
	Navigator(final Activity activity) {
		mActivity = activity;
	}
	
	
	public void close() {
		mActivity.finish();
	}
}
