import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataGenerator {
    Random random = new Random();

    private List<Person> lista = new ArrayList<>();

    private List<String> lista_imion = new
            FileToList("D:\\JetBrains\\Projects\\untitled1\\src\\listy\\name.txt").scan();
    private List<String> lista_nazwisk = new
            FileToList("D:\\JetBrains\\Projects\\untitled1\\src\\listy\\surname.txt").scan();
    private List<String> lista_miast = new
            FileToList("D:\\JetBrains\\Projects\\untitled1\\src\\listy\\city.txt").scan();
    private List<String> lista_ulic = new
            FileToList("D:\\JetBrains\\Projects\\untitled1\\src\\listy\\street.txt").scan();
    private List<String> lista_firm = new
            FileToList("D:\\JetBrains\\Projects\\untitled1\\src\\listy\\company.txt").scan();



    public List<Person> generatePeopleList(int n) {
        for (int i = 0; i < n; i++) {
            lista.add(generatePerson());
        }
        return lista;
    }

    public Person generatePerson(){
        int liczba = random.nextInt(0,21);
        String name1 = lista_imion.get(liczba);
        String surname1 = lista_nazwisk.get(liczba);

        Gender[] genders = Gender.values();
        String plec = genders[random.nextInt(genders.length)].toString();



        String rok = Integer.toString(random.nextInt(1960,2002));
        String zawod = "Na Rodzinie";
        Company firma = generateCompany();
        String zaraobki = Integer.toString(random.nextInt(5000,10001));
        Address adres = generateAddress();

        return new Person(name1, surname1, plec, rok, zawod, firma, zaraobki, adres);
    }

    private Company generateCompany(){
        int liczba = random.nextInt(0,21);
        String company_N = lista_firm.get(liczba);
        String rok_Z = Integer.toString(random.nextInt(1945,2020));
        return new Company(company_N, rok_Z);
    }

    private Address generateAddress(){
        int liczba = random.nextInt(0,21);
        String ulica = lista_ulic.get(liczba);
        String nr_Mieszkania = Integer.toString(random.nextInt(1,100));
        String nr_Domu = Integer.toString(random.nextInt(1,200));
        String kod_Pocztowy = Integer.toString(random.nextInt(20000,50000));
        String misto = lista_miast.get(liczba);
        String panstow = "Polska";

        return new Address(ulica, nr_Mieszkania, nr_Domu, kod_Pocztowy, misto, panstow);
    }

    public void wywietlLudzow() {
        for (Person ludz : lista) {
            System.out.println(ludz);
        }
    }
}