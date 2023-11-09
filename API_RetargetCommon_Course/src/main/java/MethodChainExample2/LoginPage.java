package MethodChainExample2;

public class LoginPage {

    public HomePage doLogin()
    {
        System.out.println("Login to application!!");
        return new HomePage();
    }
}
