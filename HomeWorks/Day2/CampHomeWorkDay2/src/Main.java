
public class Main {

	public static void main(String[] args) {
		Camp camp1 = new Camp(1,"Yazýlým Geliþtirici Yetiþtirme Kampý","C# + ANGULAR","Ücretsiz");
		Camp camp2 = new Camp(2,"Yazýlým Geliþtirici Yetiþtirme Kampý","JAVA + REACT","Ücretsiz");
		Camp camp3 = new Camp(3,"Programlamaya Giriþ için Temel Kurs","C#,PYTHON,JAVA","Ücretsiz");

		Camp[] camps  = {camp1,camp2,camp3};
		
		for(Camp camp : camps) {
			System.out.println(camp.name);
		}
		
		System.out.println();
		
		Tab tab1 = new Tab(1,"Kampa Hazýrlýk");
		Tab tab2 = new Tab(2,"Sýk Sorulan Sorular");
		Tab tab3 = new Tab(3,"Giriþ Yap");
		Tab tab4 = new Tab(4,"Kayýt Ol");
		
		Tab[] tabs = {tab1,tab2,tab3,tab4};
		
		for(Tab tab : tabs) {
			System.out.println(tab.name);
		}
		
		System.out.println();
		
		TabManager tabManager = new TabManager();
		tabManager.UserSignUp(tab4);
		tabManager.UserSignIn(tab3);
	}

}
