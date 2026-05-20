package fun.pullock.gof.behavioral.c5_2;

class Invoker {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void invoke() {
        if (command != null) {
            command.execute();
        }
    }
}