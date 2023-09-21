package iphone.browser;

import java.util.ArrayList;
import java.util.List;

public class Browser extends Tab{

    private List<Tab> tabList;

    private Tab tab;

    public Browser() {
        this.tabList = new ArrayList<>();
    }

    public List<Tab> getTabList() {
        return tabList;
    }

    public void newTab() {
        tabList.add(tab = new Tab());
    }

    @Override
    public String toString() {
        return "Browser{" +
                tabList +
                '}';
    }

    public static void main(String[] args) {
        Browser browser = new Browser();

        browser.newTab();

        System.out.println(browser);
        System.out.println();

        browser.tab.showPage("site1", "Conteudo1");
        browser.tab.showPage("site2", "Conteudo2");
        System.out.println(browser);
        System.out.println();

        browser.tab.updatePage("site1");
        System.out.println(browser);


    }
}
