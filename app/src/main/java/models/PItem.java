package models;

public class PItem
{
    private String name;
    private int id;
    private int quantity;
    private String unit;
    private String exp_date;

    public PItem( String name, int id, int quantity, String unit, String exp_date)
    {
        this.name = name;
        this.id = id;
        this.quantity = quantity;
        this.unit = unit;
        this.exp_date = exp_date;
    }

    public String getName()
    {
        return name;
    }

    public int getId()
    {
        return id;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public String getUnit()
    {
        return unit;
    }

    public String getExp_date()
    {
        return exp_date;
    }
}

