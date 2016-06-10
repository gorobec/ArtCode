package week2.serviceCentre;


import java.util.Date;

public class Technic {
    private long price;
    private Date date;
    private boolean isRepaired = false;
    private String name;

    public Technic(long price, Date date, boolean isRepaired, String name) {
        this.price = price;
        this.date = date;
        this.isRepaired = isRepaired;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Technic)) return false;

        Technic technic = (Technic) o;

        if (isRepaired != technic.isRepaired) return false;
        if (price != technic.price) return false;
        if (date != null ? !date.equals(technic.date) : technic.date != null) return false;
        if (name != null ? !name.equals(technic.name) : technic.name != null) return false;

        return true;
    }

    @Override
    public String toString() {
        return "Technic{" +
                "price=" + price +
                ", date=" + date +
                ", isRepaired=" + isRepaired +
                ", name='" + name + '\'' +
                '}';
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isRepaired() {
        return isRepaired;
    }

    public void setRepaired(boolean isRepaired) {
        this.isRepaired = isRepaired;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
