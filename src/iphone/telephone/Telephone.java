package iphone.telephone;

import iphone.ipad.Music;

import java.util.*;

public class Telephone {
    private List<Contact> contactList;
    private  List<VoiceMail> voiceMailsList;

    private List<Call> callList;

    private Contact contact;

    private Call call;

    private VoiceMail voiceMail;

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
        contact = new Contact(name, number);
        if (!contactList.contains(contact)) {
            contactList.add(contact);
            Collections.sort(contactList);
        }
    }

    public void deleteContact (String name) {
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

    public Contact searchContactNumber(int number) {
        if (!contactList.isEmpty()) {
            for (Contact c: contactList) {
                if(c.getNumber() == number) {
                    return c;
                }
            }
        }
        contact = new Contact(null, number);
        return contact;
    }

    public void createVoiceMails(String mensage) {
        voiceMailsList.add(voiceMail = new VoiceMail(mensage));
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

    public Call calling(int number) {
        call = new Call(searchContactNumber(number));
        callList.add(call);
        return call;
    }

    public Call answeredCall(int number) {
        boolean toMeet = true;
        List<Call> deleteCallList = new ArrayList<>();
        for (Call c: callList) {
            if(c.getNumber() == number) {
                deleteCallList.add(c);
                call = new Call(c.getName(), number, toMeet);
            }
        }
        callList.removeAll(deleteCallList);
        return call;
    }
}
