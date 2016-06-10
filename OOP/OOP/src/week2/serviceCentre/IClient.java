package week2.serviceCentre;


public interface IClient {
    boolean giveForRepair(Technic technic);
    boolean takeFromRepair(int id);
}
