public class Main {
    public static void main(String[] args) {
        Main Main=new Main();
        Main.Info();
    }
    private static void Info(){
         String [] country =new String[10];
        country[0]="Kazakhstan";
        country[1]="Uk";
        country[2]="Mexsico";
        country[3]="Kyrgistan";
        country[4]="Uzbekistan";
        country[5]="Iran";
        country[6]=" Sout Korea";
        country[7]="Tailand";
        country[8]="USA";
        country[9]="Brazil";
        long [] TheIncomeCountry={933774435L, 959896278L, 998467068L, 1712519146L, 952506736, 851576767, 768685047, 328726347, 278040057, 214969074};
        long [] Population={19169550L,1449070556L,37610000L,146267288L,321287000,203274458,27797000,1406497000,43131966,31521418};
        for ( int i = 0; i < 10;i++ )
        {
            System.out.println("Country: "+country[i]+
                    "\n The income of the country :"+TheIncomeCountry[i]+" $"+
                    "\n Population :"+Population[i]+" people");}
        System.out.println("+");

        for ( int i = 0;  i< 10; i++ )
        {
            System.out.println("Country: "+country[i]+
                    "\n GDP  : "+TheIncomeCountry[i]+" / "+Population[i]+" = "+TheIncomeCountry[i]/Population[i]+" $");}
    }
}