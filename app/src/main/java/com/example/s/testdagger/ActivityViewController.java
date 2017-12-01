package com.example.s.testdagger;

import android.view.View;

import javax.inject.Inject;

public class ActivityViewController implements PresentableView {
	
	private final View mActivityView;
	
	@Inject
	Presenter mPresenter;
	
	public ActivityViewController(View activityView) {
		mActivityView = activityView;
	}
	
	public void onCreate() {
		DaggerPresenterForActivityComponent.builder()
			.mainComponent(ComponentHolder.INSTANCE.mMainComponent)
			.build()
			.inject(this);
		
		mActivityView.findViewById(R.id.btn_win).setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(final View v) {
				mPresenter.onBtnWinClick();
			}
		});
		mActivityView.findViewById(R.id.btn_loose).setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(final View v) {
				mPresenter.onBtnLooseClick();
			}
		});
		
	}
	
	public void start() {
		mPresenter.attach(this);
	}
	
	public void stop() {
		mPresenter.detach();
	}
	
	@Override
	public void showYouWin() {
		mActivityView.findViewById(R.id.btn_win).setVisibility(View.VISIBLE);
		mActivityView.findViewById(R.id.btn_loose).setVisibility(View.GONE);
	}
	
	@Override
	public void showYouLoose() {
		mActivityView.findViewById(R.id.btn_win).setVisibility(View.GONE);
		mActivityView.findViewById(R.id.btn_loose).setVisibility(View.VISIBLE);
	}
}
