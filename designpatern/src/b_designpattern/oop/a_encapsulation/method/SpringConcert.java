package b_designpattern.oop.a_encapsulation.method;

public class SpringConcert {

    public void start() {
        System.out.println("Spring Concert 시작합니다.");
        Player player = new Player("바이올린");
        player.play();
        System.out.println("=============================");
    }
}
