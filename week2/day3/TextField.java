package week2.day3;

public class TextField extends WebElement{
						
					public void getText() {
						System.out.println("getText");
					}
						public static void main(String[] args) {
							// TODO Auto-generated method stub
					TextField t= new TextField();
					t.click();
					t.setText("text");
					t.getText();	
		}
	}


