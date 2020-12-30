public class Balloon {
    double iloscHelu;



    Balloon(){
        this.iloscHelu = (Math.random()*5 + 4)/1000; //losowanie ilości helu w każdym z balonów

    }
    public double getLoad(){
        System.out.println("Udzwig balonu = " + (this.iloscHelu * 6) / 0.007 / 1000); //obliczanie udzwigu kazdego balonu i konwersja z g na kg

        return ((this.iloscHelu * 6) / 0.007) / 1000; //zwraca udzwig balonu w kilogramach, czyli bardzo mało
    }
}
