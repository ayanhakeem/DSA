class Foo {

    private volatile int turn = 1;

    public Foo() {}

    public void first(Runnable printFirst) throws InterruptedException {
        // Wait until it's turn 1
        while (turn != 1) {
            Thread.yield();
        }
        printFirst.run();
        turn = 2;
    }

    public void second(Runnable printSecond) throws InterruptedException {
        // Wait until it's turn 2
        while (turn != 2) {
            Thread.yield();
        }
        printSecond.run();
        turn = 3;
    }

    public void third(Runnable printThird) throws InterruptedException {
        // Wait until it's turn 3
        while (turn != 3) {
            Thread.yield();
        }
        printThird.run();
    }
}
