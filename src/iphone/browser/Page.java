package iphone.browser;

public class Page {

    private String name;

    private String conteudo;

    private boolean update;

    public Page(String name, String conteudo) {
        this.name = name;
        this.conteudo = conteudo;
        this.update = false;
    }

    public String getName() {
        return name;
    }

    public String getConteudo() {
        return conteudo;
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
                ", conteudo='" + conteudo + '\'' +
                ", update=" + update +
                '}';
    }
}
