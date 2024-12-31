package week2.day3;

public class CheckBoxButton extends Button {

						public void clickCheckButton() {
							System.out.println("ClickCheckButton");
						}
							public static void main(String[] args) {
								// TODO Auto-generated method stub
						CheckBoxButton cb= new CheckBoxButton();
						cb.click();
						cb.setText("text");
						cb.clickCheckButton();	
			}
		}

