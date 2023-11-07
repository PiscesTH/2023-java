package com.green.day29.normal;

public class SamsungTv {
    private AppleSpeaker speaker;
    private boolean isMute;

    public SamsungTv() {
        speaker = new AppleSpeaker();
    }

    public void sound() {
        if (isMute) {
            return;
        }
        speaker.sound();
    }

    public void toggleMute() {
        isMute = !isMute;
    }
}
