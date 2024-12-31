package week2.day3;

public class Button extends WebElement{
					
				public void submit() {
					System.out.println("Submit");
				}
					public static void main(String[] args) {
						// TODO Auto-generated method stub
				Button b = new Button();
				b.click();
				b.setText("text");
				b.submit();	
		

	}

}
