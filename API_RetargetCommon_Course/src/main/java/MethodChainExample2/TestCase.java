package MethodChainExample2;

public class TestCase {

    public static void main(String[] args) {
//        LoginPage loginPage = new LoginPage();
//        loginPage.doLogin();
//        HomePage homePage = new HomePage();
//        homePage.SendMessage();
//        homePage.sendNotification();
        new LoginPage().doLogin().sendNotification();
        new LoginPage().doLogin().SendMessage();
    }
}
