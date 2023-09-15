package S12.LSP;

public class Bird {

    public void fly(){
        System.out.printf("Птица летит со скоростью %d\n" , flySpeed);
    }

    public Bird() {
    }

    public Bird(int flySpeed) {
        this.flySpeed = flySpeed;
    }

    public Bird(boolean canFly, int flySpeed) {
        this.canFly = canFly;
        this.flySpeed = flySpeed;
    }

    protected boolean canFly = true;
    protected int flySpeed = 12;

    public int getFlySpeed() {
        return flySpeed;
    }

    public boolean isCanFly() {
        return canFly;
    }
}
