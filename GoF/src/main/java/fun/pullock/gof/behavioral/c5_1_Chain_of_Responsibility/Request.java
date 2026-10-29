package fun.pullock.gof.behavioral.c5_1_Chain_of_Responsibility;

class Request {

    private String content;

    public Request(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}