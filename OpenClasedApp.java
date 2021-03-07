
import java.util.*;

public class OpenClasedApp {

    public OpenClasedApp() {
    }

    public static void main(String[] args) {
		Translator Tran = new Translator();
		
        System.out.println("El numero 4 en Decimal es" + tran.salute(new DecimalNumber()));
		System.out.println("El numero 4 en Maya es" + tran.salute(new MayaNumber()));
		System.out.println("El numero 4 en Egipcio es" + tran.salute(new EgipcioNumber()));
    }

}