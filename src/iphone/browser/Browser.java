package iphone.browser;

import java.util.ArrayList;
import java.util.List;

public class Browser extends Tab{

    private List<Tab> tabList;

    public Browser() {
        this.tabList = new ArrayList<>();
    }

    public List<Tab> getTabList() {
        return tabList;
    }

    public void newTab() {
        tabList.add(new Tab());
    }
    @Override
    public String toString() {
        return "Browser{" +
                tabList +
                '}';
    }
}
