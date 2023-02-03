public class Triangle extends Figure
{
    private double base;
    private double hauteur;
    
    public Triangle(double base, double hauteur)
    {
        super();
        this.base = base;
        this.hauteur = hauteur;
    }
    
    public Triangle(double base, double hauteur, double x, double y, double z)
    {
        super(x, y, z);
        this.base = base;
        this.hauteur = hauteur;
    }

    public double getBase()
    {
       return this.base;
    }
    
    public double getHauteur()
    {
        return this.hauteur;
    }

    @Override
    public double perimetre()
    {
        return Math.sqrt(this.base * this.base + this.hauteur * this.hauteur) + this.base + this.hauteur;
    }

    @Override
    public double aire()
    {
        return this.base * this.hauteur / 2;
    }

    @Override
    public String getDescription()
    {
        return super.getDescription() + " <|--- Triangle";
    }

    @Override
    public String toString()
    {
        return super.toString() + " " + this.base + " " + this.hauteur;
    }
}
