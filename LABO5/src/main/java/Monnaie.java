public class Monnaie {


        private final long sous;

        public long getSous(){
            return this.sous;
        }
        public Monnaie(long sous){
            this.sous = sous;
        }
        public Monnaie additionner(Monnaie autre){
            return new Monnaie (this.sous + autre.sous);
        }
        public Monnaie soustraire(Monnaie autre){
            return new Monnaie (this.sous - autre.sous);
        }
        public double pourcentage(double taux){
            return (this.sous * taux / 100);
        }
        public String toString(){
            String decimales = this.sous % 100 < 10 ? "0" + this.sous % 100 : String.valueOf(this.sous %100);
            return (this.sous / 100 + "," + decimales + "$");
        }

}
