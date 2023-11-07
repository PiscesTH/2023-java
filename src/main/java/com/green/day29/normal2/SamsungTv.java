package com.green.day29.normal2;

public class SamsungTv {
    private HarmanSpeaker speaker;
    private boolean isMute;

    public SamsungTv() {
        speaker = new HarmanSpeaker();
    }

    public void sound() {
        if (isMute) {
            return;
        }
        speaker.speak();
    }

    public void toggleMute() {
        isMute = !isMute;
    }
}
