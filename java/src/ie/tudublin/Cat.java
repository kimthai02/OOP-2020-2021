package ie.tudublin;

public class Cat extends Animal
{
    private int numLives;

    public Cat(String name)
    {
        super(name);
        numLives = 9;
    }

    void kill(){
        numLives = numLives - 1;
        if (numLives > 0){
            System.out.println("Ouch!");
        }
        if (numLives == 0)
        {
            System.out.println("Dead x-x");
        }
    }
   public int getLives(){
       return numLives;
   }

   public void setLives(int numLives){
       this.numLives = numLives;
   }


}