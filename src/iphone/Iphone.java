package iphone;

import iphone.browser.Browser;
import iphone.ipad.Ipad;
import iphone.telephone.Telephone;

public class Iphone {

    private int version;
    private Browser browser;

    private Telephone telephone;

    private  Ipad iPad;

    public Iphone(int version) {
        this.version = version;
        this.browser = new Browser();
        this.telephone = new Telephone();
        this.iPad = new Ipad();
    }

    public int getVersion() {
        return version;
    }

    public Browser getBrowser() {
        return browser;
    }

    public Telephone getTelephone() {
        return telephone;
    }

    public Ipad getiPad() {
        return iPad;
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "number=" + version +
                ", browser=" + browser +
                ", telephone=" + telephone +
                ", iPad=" + iPad +
                '}';
    }

    public static void main(String[] args) {
        Iphone iphone = new Iphone(2007);

        iphone.telephone.createContact("Rudson Santana", 4444);
        iphone.telephone.createContact("Rudson Sant.", 5555);
        iphone.iPad.addMusic("a", "b", "x");
        iphone.iPad.addMusic("a", "b", "x");
        iphone.iPad.addMusic("c", "b", "x");

        System.out.println(iphone.telephone.getContactList());
        System.out.println();

        System.out.println(iphone.telephone.calling(5555));
        System.out.println();
        System.out.println(iphone.telephone.answeredCall(5555));
        System.out.println();

        System.out.println(iphone.iPad.getMusicList());
        System.out.println(iphone.iPad.play("a"));
        System.out.println();

        System.out.println(iphone.iPad.getMusicList());
        System.out.println();

        System.out.println(iphone.iPad.pause("a"));
        System.out.println(iphone.iPad.getMusicList());

    }
}
