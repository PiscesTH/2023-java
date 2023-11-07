package com.green.day29.ioc;

import com.green.day29.Speaker;

public abstract class Tv {
    protected Speaker speaker;
    protected boolean isMute;

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
