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

    public List<Page> showPage(String name, String content) {
        pageList.add(site = new Page(name, content));
        return pageList;
    }


    public Page updatePage(String name) {
        if (!pageList.isEmpty()) {
            for (Page p: pageList) {
                if(p.getName().equalsIgnoreCase(name)) {
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

        tab.showPage("page", "conteudo");
        tab.showPage("page", "conteudo");
        tab.showPage("page", "conteudo");
        System.out.println(tab);
        System.out.println();

        tab.updatePage("page");
        tab.updatePage("page");
        System.out.println(tab);
        System.out.println();

    }
}
