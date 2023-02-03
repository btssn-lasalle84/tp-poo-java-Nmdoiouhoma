public class Figure
{
    private double x;
    private double y;
    private double z;
    
    public Figure()
    {
        this.x = 0.;
        this.y = 0.;
        this.z = 0.;
    }
    
    public Figure(double x, double y, double z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public double getX()
    {
        return this.x;
    }

    public double getY()
    {
        return this.y;
    }

    public double getZ()
    {
        return this.z;
    }

    public double perimetre()
    {
        return 0.;
    }

    public double aire()
    {
        return 0.;
    }

    public double volume()
    {
        return 0.;
    }

    // Services
    public String getDescription()
    {
        return "Figure";
    }

    @Override
    public String toString()
    {
        return this.x + " " + this.y + " " + this.z;
    }
}
