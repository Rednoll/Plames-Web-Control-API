package com.inwaiders.plames.modules.webcontroller.domain.module;

import java.util.ArrayList;
import java.util.List;

import com.inwaiders.plames.domain.module.impl.ModuleBase;
import com.inwaiders.plames.modules.webcontroller.domain.module.button.Button;

public abstract class WebDescribedModuleBase extends ModuleBase implements WebDescribedModule {

	protected List<Button> buttons = new ArrayList<>();
	
	public WebDescribedModuleBase() {
		
	}
	
	@Override
	public List<Button> getButtons() {
		
		return this.buttons;
	}
}
