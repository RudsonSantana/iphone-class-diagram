package iphone.browser;

import iphone.ipad.Music;

import java.util.ArrayList;
import java.util.List;

public class Tab {
    private List<Page> pageList;

    private Page site;

    public Tab() {
        this.pageList = new ArrayList<>();
    }

    public List<Page> getPageList() {
        return pageList;
    }

    public String showPage(String name, String conteudo) {
        pageList.add(site = new Page(name, conteudo));
        return "Show page: " + site;
    }

    public Page updatePage(String name) {
        List<Page> pageUpdate = new ArrayList<>();
        if (!pageList.isEmpty()) {
            for (Page p: pageList) {
                if(p.getName().equalsIgnoreCase(name)) {
                    p = pageList.get(0);
                    p.setUpdate(true);
                    return p;
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Tab{" + pageList +
                '}';
    }

    public static void main(String[] args) {
        Tab tab = new Tab();

        System.out.println(tab.showPage("site", "conteudo"));
        System.out.println(tab.showPage("site1", "conteudo"));
        System.out.println(tab.showPage("site2", "conteudo"));
        System.out.println();

        System.out.println(tab);
        System.out.println();

        System.out.println(tab.updatePage("site"));
    }
}
