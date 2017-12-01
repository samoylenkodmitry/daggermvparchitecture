package com.example.s.testdagger;

import javax.inject.Inject;

@ActivityViewControllerScope
public class PresenterDeps {
	
  	@Inject
	DialogsController mDialogsController;
  	@Inject
	Navigator mNavigator;
  	@Inject
	RandomModel mRandomModel;
  	@Inject
	ToastMaker mToastMaker;
	
	@Inject
	PresenterDeps() {
	}
}
