package Aiswaryas;

public class HomeworkThree {

    public static void main(String[] args) {

        /** Convert Fahrenheit to Celsius
             cT=(pT-32)*5/9
        */
        double fTemp=50;
        double cTemp= (fTemp - 32)* 5/9;
        System.out.println(fTemp + " fahrenheit is equal to " + cTemp + " degree celsius.");

        /** Convert Fahrenheit to Kelvin
            kT=(fT+459.67)*5/9
         */
        fTemp=66;
        double kTemp=(fTemp+459.67)* 5/9;
        System.out.println(fTemp + " fahrenheit is equal to " + kTemp + " degree kelvin.");

        /** Convert Kelvin to Celsius
            cT=kT-273.15
         */
        kTemp=23;
        cTemp=kTemp-273.15;
        System.out.println(kTemp +" kelvin is equal to " + cTemp + " degree celsius.");

        /** Convert Kelvin to Fahrenheit
            fT=kT*(9/5)-459.67
         */
        kTemp=300;
        fTemp=(kTemp*9/5-459.67);
        System.out.println(kTemp + " kelvin is equal to " + fTemp + " degree fahrenheit.");

        /** Convert Celsius to Fahrenheit
            fT=cT*9/5+32
         */
        cTemp=32;
        fTemp=cTemp*9/5+32;
        System.out.println(cTemp + " celsius is equal to " + fTemp + " degree fahrenheit.");

        /** Convert Celcius to Kelvin
            kT=cT+273.15
         */
        cTemp=60;
        kTemp=cTemp+273.15;
        System.out.println(cTemp + " celsius is equal to " + kTemp + " degree kelvin.");

    }
}
