package inClassRoomTask;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		
		MultipleChildBrowserHandel.preCondition();
		MultipleChildBrowserHandel.clickOpenFoodSite();
		MultipleChildBrowserHandel.olivLogin();
		MultipleChildBrowserHandel.postCondition();
	}
}
