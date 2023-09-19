package iphone.telephone;

public class Call extends Contact {
    private boolean call;

    public Call(String name, int number, boolean call) {
        super(name, number);
        this.call = call;
    }

    public Call(Contact contact) {
        super(contact.getName(), contact.getNumber());
        this.call = false;
    }

    public boolean getCall() {
        return call;
    }

    @Override
    public String toString() {
        return "Call{" +
                "answered call=" + call + ", name='" + getName() + '\'' +
                ", number=" + getNumber() +
                '}';
    }
}

