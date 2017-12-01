package com.example.s.testdagger;

import android.app.Activity;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {
	
	
	private final Activity mActivity;
	
	public ActivityModule(final Activity activity) {
		mActivity = activity;
	}
	
	@Provides
	Activity provideActivity() {
		return mActivity;
	}
	
}
