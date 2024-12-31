package week2.day3;

public class WebElement {

		public void click() {
			System.out.println("Click");
		}

		public void setText(String text) {
			System.out.println("SetText");
		}
			public static void main(String[] args) {
				// TODO Auto-generated method stub
		WebElement we = new WebElement();
		we.click();
		we.setText("text");
			}
}
