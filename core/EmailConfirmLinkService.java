package core;

public class EmailConfirmLinkService implements ConfirmLinkService{
    @Override
    public void confirmLİnk(String message) {
        System.out.println("linke tıklandı: "+ message);
    }
}
