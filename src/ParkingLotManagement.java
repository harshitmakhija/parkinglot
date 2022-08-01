public class ParkingLotManagement {
    final private static int  MAX_SPACE = 3;
    private int spaceAvailable = MAX_SPACE;

    int getSpaceAvailable()
    {
        return this.spaceAvailable ;
    }

    int getMaxSpace()
    {
        return MAX_SPACE ;
    }

    public boolean checkIfParkingSlotAvailable() {
        return getSpaceAvailable() > 0 ? true : false;
    }

    public String parkTheCar(Car car) {

        if(car.checkIfCarIsParked() == true)
            return "CAR IS ALREADY PARKED" ;

        if(checkIfParkingSlotAvailable() == false)
            return "NO SPACE AVAILABLE" ;

        spaceAvailable--;
        car.setAsParked();
        return "CAR PARKED";
    }

    public String unparkTheCar(Car car)
    {
        if(car.checkIfCarIsParked() == false)
            return "CAR IS NOT YET PARKED" ;

        spaceAvailable++ ;
        car.setAsUnParked();
        return "CAR UNPARKED";
    }

    public static void main(String[] args) {
        ParkingLotManagement parkingLotManagement = new ParkingLotManagement();

    }
}
