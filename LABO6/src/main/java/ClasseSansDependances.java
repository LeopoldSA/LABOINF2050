public class ClasseSansDependances {

    public static void main (String[] args){
        int x =5 ;
        int y = 6;
        System.out.printf("Avant permutation :%n x:%d y:%d %n",x,y);
        int temp =x;
        x =y;
        y=temp;
        System.out.printf("Après permutation :%n x:%d y:%d%n",x,y);
    }

    // commentaire et commentaires
    //
    //
    public static double claculMoyenne (double x, double y){
        return (x+y)/2;
    }

}
