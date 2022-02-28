public class TestClass5026211102 {

    public static void main(String[] args){

        ComputeMethods5026211102 cm = new ComputeMethods5026211102();

	// celcius
        double celcius = cm.fToC(250);
        System.out.println("250 F = "+ celcius + " C");

	// hypotenuse
        double hypotenuse = cm.hypotenuse (9,17);
        System.out.println("Perhitungan phytagoras = " + hypotenuse);

	// rolldice
        int rollDice = cm.roll();
        System.out.println("Hasil Roll = " + rollDice);

    }
}