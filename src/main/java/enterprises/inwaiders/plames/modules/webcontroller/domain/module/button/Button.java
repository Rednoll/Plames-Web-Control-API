package enterprises.inwaiders.plames.modules.webcontroller.domain.module.button;

public class Button {

	private String name;
	private String fontColor;
	private String backgroundColor;
	private String bordersColor;
	private String targetPage;
	
	public Button() {
		
	}
	
	public void setTargetPage(String page) {
		
		this.targetPage = page;
	}
	
	public String getTargetPage() {
		
		return this.targetPage;
	}
	
	public void setBordersColor(String color) {
		
		this.bordersColor = color;
	}
	
	public String getBordersColor() {
		
		return this.bordersColor;
	}
	
	public void setBackgroundColor(String color) {
		
		this.backgroundColor = color;
	}
	
	public String getBackgroundColor() {
		
		return this.backgroundColor;
	}
	
	public void setFontColor(String color) {
		
		this.fontColor = color;
	}
	
	public String getFontColor() {
		
		return this.fontColor;
	}
	
	public void setName(String name) {
		
		this.name = name;
	}
	
	public String getName() {
		
		return this.name;
	}
}
