package iphone.browser;

public class Page {

    private String name;

    private String content;

    private boolean update;

    public Page(String name, String conteudo) {
        this.name = name;
        this.content = conteudo;
        this.update = false;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    public boolean getUpdate() {
        return update;
    }

    protected void setUpdate(boolean update) {
        this.update = update;
    }

    @Override
    public String toString() {
        return "Page{" +
                "name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", update=" + update +
                '}';
    }
}
