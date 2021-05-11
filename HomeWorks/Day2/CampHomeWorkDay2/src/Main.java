
public class Main {

	public static void main(String[] args) {
		Camp camp1 = new Camp(1,"Yaz�l�m Geli�tirici Yeti�tirme Kamp�","C# + ANGULAR","�cretsiz");
		Camp camp2 = new Camp(2,"Yaz�l�m Geli�tirici Yeti�tirme Kamp�","JAVA + REACT","�cretsiz");
		Camp camp3 = new Camp(3,"Programlamaya Giri� i�in Temel Kurs","C#,PYTHON,JAVA","�cretsiz");

		Camp[] camps  = {camp1,camp2,camp3};
		
		for(Camp camp : camps) {
			System.out.println(camp.name);
		}
		
		System.out.println();
		
		Tab tab1 = new Tab(1,"Kampa Haz�rl�k");
		Tab tab2 = new Tab(2,"S�k Sorulan Sorular");
		Tab tab3 = new Tab(3,"Giri� Yap");
		Tab tab4 = new Tab(4,"Kay�t Ol");
		
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
