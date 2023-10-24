package com.green.day19.ch7;

class Test{
    public static void main(String[] args) {
        AudioPlayer ad = new AudioPlayer();
        ad.play(10);
        VideoPlayer vd = new VideoPlayer();
        vd.play(20);
        Player player = ad;
        player.play(30);
        player = vd;
        player.play(40);
    }
}
public abstract class Player {              //추상클래스. 멤버메서드에(?) 추상메서드 하나라도 있으면 클래스도 abstract 필요.
    //객체화 불가능. 부모 클래스로 사용. 객체화 안 되게 하려고 추상클래스 로 선언도 가능. 강제성 존재.
    public abstract void play(int pos);     //추상메서드. 구현부 없음. abstract 필요. 자식클래스에서 오버라이딩 강제화.
    //자식클래스에서 메서드 구현부 전부 다르게 사용할 때 유용함.
}
class AudioPlayer extends Player{
    @Override
    public void play(int pos){              //추상메서드 로 인해 오버라이딩 필수.
        System.out.println("Audio Play 위치 : " + pos);
    }
}
class VideoPlayer extends Player{
    @Override
    public void play(int pos) {
        System.out.println("Video Play 위치 : " + pos);
    }
}
abstract class DvdPlayer extends Player{

}
