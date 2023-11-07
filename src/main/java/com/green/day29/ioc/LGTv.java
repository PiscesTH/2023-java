package com.green.day29.ioc;

import com.green.day29.Speaker;

public class LGTv extends Tv {
    public LGTv(Speaker speaker) {
        System.out.println("-- LGTv 생성 --");
        this.speaker = speaker;
    }
}
