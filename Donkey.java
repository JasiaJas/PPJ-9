public class Donkey {
    public double mass;
    public int index = 0;
    public Balloon[] balloons = new Balloon[500];


    Donkey(double mass) {
        this.mass = mass;
    }

    public void addBalloon() {
        balloons[index++] = new Balloon();

        if(index >= balloons.length){
            Balloon[] balloons1 = new Balloon[balloons.length * 3];

            for (int i = 0; i < balloons.length; i++){
                balloons1[i] = balloons[i];
            }
            balloons = balloons1;
        }

    }

    public int getIndex() {
        return index;
    }

    public boolean isFlying() {
        double sum = 0;

        for (int i = 0; i < balloons.length; i++) {
            if (balloons[i] != null) {
                sum += balloons[i].getLoad();
            }
        }

            if ((sum) >= this.mass) {
                System.out.println(sum);
                System.out.println(this.mass);
                return true;
            } else {
                System.out.println(sum);
                System.out.println(this.mass);
                return false;
            }
    }
}
