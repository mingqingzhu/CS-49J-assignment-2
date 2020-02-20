public class BugTester {
    private int position;

    public BugTester(int position) {
        this.position = position;
    }
    public void test() {
        Bug bugsy = new Bug(position);
        bugsy.getPosition();
        System.out.println("The expected position should be at: 10\n");
        System.out.println("The Bug now is moving to 2 steps to the right direction");
        bugsy.move();
        bugsy.move();
        bugsy.getPosition();
        System.out.println("The expected position should be at: 12\n");
        System.out.println("The bug is now turning to left and moving 5 steps to the left.");
        bugsy.turn();
        for (int i = 0; i < 5; i++) {
            bugsy.move();
        }
        bugsy.getPosition();
        System.out.println("The expected position should be at: 7\n");
        System.out.println("The bug is now turning to right and moving 6 steps to the right.");
        bugsy.turn();
        for(int i = 0; i < 6; i++) {
            bugsy.move();
        }
        bugsy.getPosition();
        System.out.println("The expected position should be at: 13\n");

    }


}
