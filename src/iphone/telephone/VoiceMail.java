package iphone.telephone;

public class VoiceMail {
    private final String voiceMail;

    public VoiceMail(String voiceMail) {
        this.voiceMail = voiceMail;
    }

    public String getVoiceMail() {
        return voiceMail;
    }

    @Override
    public String toString() {
        return "VoiceMail{" +
                "voiceMail='" + voiceMail + '\'' +
                '}';
    }
}
