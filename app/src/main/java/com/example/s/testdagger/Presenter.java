package com.example.s.testdagger;

import javax.inject.Inject;

@ActivityViewControllerScope
public class Presenter {
	
	private final PresenterDeps mDeps;
	private PresentableView mView;
	
	@Inject
	public Presenter(PresenterDeps deps) {
		mDeps = deps;
	}
	
	public void attach(final PresentableView presentableview) {
		mView = presentableview;
		
		if (mDeps.mRandomModel.getRandomNumberFromModel() % 2 == 0) {
			mView.showYouWin();
		} else {
			mView.showYouLoose();
		}
		mDeps.mToastMaker.t("hello my friend!");
	}
	
	public void detach() {
		mView = null;
	}
	
	public void onBtnWinClick() {
		mDeps.mDialogsController.showDialogYouWinDialog();
	}
	
	public void onBtnLooseClick() {
		mDeps.mDialogsController.showDialogYouLooseDialog();
	}
}
