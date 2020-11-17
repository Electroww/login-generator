package geco;

import junit.framework.TestCase;

public class LoginServiceTest extends TestCase {
    private String log[] = {"Elec", "Rin", "Ryzou mon pote"};
    private LoginService logService =  new LoginService(this.log);

    public void testLoginService() {
        assertTrue(logService.findAllLogins().contains("Rin"));
    }
    public void testLoginExist(){
        assertEquals("Elec n\'existe pas", true, logService.loginExists("Elec"));
    }
    public void testLoginNotExist(){
        assertEquals("Issou n\'existe pas", false, logService.loginExists("Issou"));
    }
    public void testAddLogin() {
        logService.addLogin("Fartnight_playeure");
        assertTrue(logService.findAllLogins().contains("Fartnight_playeure"));
    }
}