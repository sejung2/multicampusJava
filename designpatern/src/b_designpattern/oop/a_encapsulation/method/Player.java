package b_designpattern.oop.a_encapsulation.method;


// 객체의 자율성
// 객체가 어떤 작업을 할 때 그 작업에 대한 책임을 객체에게 주어야 하는 것
public class Player {

    private String instrument;

    public Player(String instrument) {
        this.instrument = instrument;
    }

    public void play() {
        prepare();
        playing();
        stop();
        leave();
    }

    private void prepare() {
        System.out.println(instrument + "연주를 준비합니다.");
    }

    private void playing() {
        System.out.println(instrument + "연주를 시작합니다.");
    }

    private void stop() {
        System.out.println("연주를 중단합니다.");
    }

    private void leave() {
        System.out.println("공연장을 떠납니다.");
    }
}
