package Aiswaryas;

public class PrinterMethods {

    int maxToner = 100;
    int maxPaper = 100;
    static int toner= 100;
    static int pageCount= 100;


    public void addToner(int toner) {
        if (toner <= maxToner)
            System.out.println("Toner : " + toner);
        else
                System.out.println("Too much toner added !!!");
        }

        public void addPages ( int pageCount){
            if (pageCount <= maxPaper)
                System.out.println("Pages : " + pageCount);
            else {
                System.out.println("Too many pages in paper tray!!! ");
            }
        }

        public void printSingle(int pageCount){
         //  System.out.println("Pages in Tray : " + pageCount);

            if (pageCount >= 1) {
                if (pageCount > toner) {
                    System.out.println("Can print only" + toner + "pages");
                    pageCount = toner;
                }
                toner = toner - pageCount;
            } else
                 System.out.println("Toner Level: " + toner);

    }

         public void printDouble(int pageCount){
            // System.out.println("Pages in Tray : " + pageCount);
            if(pageCount >= 1) {
                if (pageCount * 2 > toner) {
                    System.out.println("Can print only" + toner + "sides");
                    pageCount = toner / 2;
                }
                toner = toner - pageCount * 2;
            }
             System.out.println("Toner Level: " + toner);
         }

         public void printerSummary(){
             System.out.println("Toner Level: " + toner );
             System.out.println("Pages in Tray: " + pageCount);
         }

         public void checkToner(){
        if(toner<=5){
            System.out.println("Add Toner !!!");
        }
        else
            System.out.println("Toner Level: " + toner);
         }

}





