package oop.g_factory;

public class NaverMail implements SMTPConnector {

    private EmailConfig config;

    public NaverMail(EmailConfig config) {
        this.config = config;
    }

    @Override
    public void connect() {
        System.out.println(config.url);
        System.out.println("네이버 메일서버에 연결되었습니다");
    }
}
