public class BonusMilesService {
    public int calculate(int ticketPrice){
        int oneMilePrice = 20;
        int miles = ticketPrice / oneMilePrice;
        return miles;
    }
}
