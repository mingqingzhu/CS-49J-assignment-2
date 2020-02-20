public class Bug {
    private int x;
    private boolean direction = true;  // true means right, false means left

    public Bug(int initialPosition) {
        x = initialPosition;
    }


    public void turn() {
        direction = !direction;
    }

    public void move() {
        if(direction) {
            x++;
        } else if (!direction) {
            x--;
        }
    }

    public void getPosition() {
        System.out.println("The Bug is now at: " + x + ".");
    }

}
