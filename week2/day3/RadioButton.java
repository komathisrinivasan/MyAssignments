package week2.day3;

public class RadioButton extends Button{

							public void selectRadioButton() {
								System.out.println("SelectRadioButton");
							}
								public static void main(String[] args) {
									// TODO Auto-generated method stub
							RadioButton rb= new RadioButton();
							rb.click();
							rb.setText("text");
							rb.selectRadioButton();	
				}
			}


