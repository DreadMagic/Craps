public class Die {

    private int numDots;

    public void roll(){
        int x = (int)((Math.random()*6)+1);
        numDots = x;

    }
    public int getNumDots(){
        return numDots;
    }
    public static void main(String[] args) {
// TODO Auto-generated method stub
        Die die = new Die();
        die.roll();
        System.out.println(die.getNumDots());
    }
}
