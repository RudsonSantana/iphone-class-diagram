package iphone.telephone;

import java.util.*;

public class Telephone {
    private List<Contact> contactList;
    private  List<VoiceMail> voiceMailsList;

    private List<Call> callList;

    private Call call;

    public Telephone() {
        this.contactList = new ArrayList<>();
        this.voiceMailsList = new ArrayList<>();
        this.callList = new ArrayList<>();
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public List<VoiceMail> getVoiceMailsList() {
        return voiceMailsList;
    }

    public List<Call> getCallList() {
        return callList;
    }

    public void createContact (String name, int number) {
        contactList.add(new Contact(name, number));
    }

    public void deleteContact (String name, int number) {
        List<Contact> contactDelete = new ArrayList<>();
        for (Contact c: contactList) {
            if(c.getName().equals(name)) {
                contactDelete.add(c);
            }
        }
        contactList.removeAll(contactDelete);
    }

    public List<Contact> searchContact(String name) {
        List<Contact> contactName = new ArrayList<>();
        if (!contactList.isEmpty()) {
            for (Contact c: contactList) {
                if(c.getName().equalsIgnoreCase(name)) {
                    contactName.add(c);
                }
            }
        }
        return contactName;
    }

    public void createVoiceMails (String voiceMail) {
        voiceMailsList.add(new VoiceMail(voiceMail));
    }

    public void deleteVoiceMails (String voiceMail) {
        List<VoiceMail> voiceMailsDelete = new ArrayList<>();
        for (VoiceMail v: voiceMailsList) {
            if(v.getVoiceMail().equals(voiceMail)) {
                voiceMailsDelete.add(v);
            }
        }
        voiceMailsList.removeAll(voiceMailsDelete);
    }

    public List<VoiceMail> searchVoiceMail(String voiceMail) {
        List<VoiceMail> voiceMailName = new ArrayList<>();
        if (!voiceMailsList.isEmpty()) {
            for (VoiceMail v: voiceMailsList) {
                if(v.getVoiceMail().equalsIgnoreCase(voiceMail)) {
                    voiceMailName.add(v);
                }
            }
        }
        return voiceMailName;
    }

    public Call calling(Contact contact) {
        call = new Call(contact);
        callList.add(call);
        return call;
    }

    public Call answeredCall(Contact contact) {
        boolean toMeet = true;
        List<Call> deleteCallList = new ArrayList<>();
        for (Call c: callList) {
            if(c.getName().equals(contact.getName())) {
                deleteCallList.add(c);
            }
        }
        callList.removeAll(deleteCallList);
        call = new Call(contact.getName(), contact.getNumber(), toMeet);
        callList.add(call);

        return call;
    }


    public static void main(String[] args) {
        Contact contact = new Contact("Rudson", 4);
        Contact contact2 = new Contact("Rudson S.", 5);
        Contact contact3 = new Contact("Rudson", 6);

        Telephone telephone = new Telephone();
        telephone.contactList.add(contact);
        telephone.contactList.add(contact2);
        telephone.contactList.add(contact3);


        System.out.println(telephone.contactList);
        System.out.println();

        System.out.printf("call of: " + telephone.calling(contact) + "\n");
        System.out.println(telephone.callList);
        System.out.println();

        System.out.printf("call of: " + telephone.calling(contact2) + "\n");
        System.out.println();

        System.out.printf("answered call of: " + telephone.answeredCall(contact) + "\n");
        System.out.println(telephone.callList);

    }


}
