package enterprises.inwaiders.plames.modules.webcontroller.domain.module;

import java.util.ArrayList;
import java.util.List;

import enterprises.inwaiders.plames.modules.webcontroller.domain.module.button.Button;

public class BaseWebDescription implements WebDescription {

	protected List<Button> buttons = new ArrayList<>();
	
	public BaseWebDescription() {
		
	}
	
	public void addButton(Button button) {
		
		this.buttons.add(button);
	}
	
	@Override
	public List<Button> getButtons() {
		
		return this.buttons;
	}
}
