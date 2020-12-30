public class MainB {
    public static void main(String[] args) {

        Donkey donkey = new Donkey(5.0);

        while (donkey.isFlying() != true){
            donkey.addBalloon();
        }

        if (donkey.isFlying()) {
            System.out.println("Ja latam!!");
            System.out.println("Mam " + donkey.getIndex() + " balonów");
        } else {
            System.out.println("Nie latam" + "\n Spróbuj ponownie");
        }


    }
}

