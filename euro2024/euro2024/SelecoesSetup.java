package euro2024;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public final class SelecoesSetup {
    
    private List<Selecao> selecoes;
    private List<String> selecoesNomes;
    private List<Pessoa> treinadores;
    private List<Estadio> estadios;
    private List<Cidade> cidades;
    
    public SelecoesSetup(){
        selecoes=new ArrayList<>();
        selecoesNomes=new ArrayList<>();
        treinadores=new ArrayList<>();
        estadios=new ArrayList<>();
        cidades=new ArrayList<>();
        
        setupGeral();
    }
    
    public void setupGeral(){
        setupTreinadores();
        setupSelecoes();
        setupEstadios();
        
        for(int i=0;i<24;i++){
            selecoes.add(new Selecao(selecoesNomes.get(i),treinadores.get(i)));
            treinadores.get(i).setSelecao(selecoes.get(i)); 
        }
        setupJogadores();
    }

    public List<Selecao> getSelecoes() {
        return selecoes;
    }
    
    public void setupSelecoes(){
        selecoesNomes=Arrays.asList
        ("Alemanha","Escocia","Hungria","Suica",
        "Albania","Croacia","Espanha","Italia",
        "Dinamarca","Eslovenia","Inglaterra","Servia",
        "Austria","Franca","Holanda","Polonia",
        "Belgica","Eslovenia","Romenia","Ucrania",
        "Georgia","Portugal","Republic Checa","Turquia");
    }
    public void setupTreinadores(){
        treinadores.add(new Pessoa("Julian","Nagelsman",37));
        treinadores.add(new Pessoa("Steve","Clark",37));
        treinadores.add(new Pessoa("Marco","Rossi",37,"Italia"));
        treinadores.add(new Pessoa("Murat","Yakin",37));
        treinadores.add(new Pessoa("Sylvio","Junior",37,"Brasil"));
        treinadores.add(new Pessoa("Zlato","Dalic",37));
        treinadores.add(new Pessoa("Luis","de La Fuente",37));
        treinadores.add(new Pessoa("Luciano","Spalleti",37));
        treinadores.add(new Pessoa("Kasper","Hjumland",37));
        treinadores.add(new Pessoa("Matjaz","Kek",37));
        treinadores.add(new Pessoa("Gareth","Southgate",37));
        treinadores.add(new Pessoa("Dragan","Stojkovic",37));
        treinadores.add(new Pessoa("Ralf","Rangnick",37,"Alemanha"));
        treinadores.add(new Pessoa("Didier","Dechamps",37));
        treinadores.add(new Pessoa("Ronald","Koeman",37));
        treinadores.add(new Pessoa("Michal","Probierz",37));
        treinadores.add(new Pessoa("Domenico","Tedesco",37,"Alemanha"));
        treinadores.add(new Pessoa("FJulianrancesco","Calzona",37,"Italia"));
        treinadores.add(new Pessoa("Edward","Iordanescu",37));
        treinadores.add(new Pessoa("Sergiy","Rebrov",37));
        treinadores.add(new Pessoa("Willy","Sagnol",37,"Franca"));
        treinadores.add(new Pessoa("Roberto","Martinez",37,"Espanha"));
        treinadores.add(new Pessoa("Ivan","Hasek",37));
        treinadores.add(new Pessoa("Vincenzo","Montella",37,"Italia"));
    }
    public void setupJogadores(){
        int indice=0;
        String posGK="GK",posDF="DF",posME="ME",posAT="AT";
        
        List<Jogador> alemanha=Arrays.asList
        (new Jogador("Manuel","Neuer",27,selecoes.get(indice),posGK),
         new Jogador("Antonio","Rudiger",27,selecoes.get(indice),posDF),
         new Jogador("David","Raum",27,selecoes.get(indice),posDF),
         new Jogador("Jonathan","Tah",27,selecoes.get(indice),posDF),
         new Jogador("Robin","Koch",27,selecoes.get(indice),posDF),
         new Jogador("Ilkay","Gundogan",27,selecoes.get(indice),posME),
         new Jogador("Toni","Kross",27,selecoes.get(indice),posME),
         new Jogador("Florian","Wirtz",27,selecoes.get(indice),posME),
         new Jogador("Leroy","Sane",27,selecoes.get(indice),posAT),
         new Jogador("Thomas","Muller",27,selecoes.get(indice),posAT),
         new Jogador("Niclas","Fullkburg",27,selecoes.get(indice),posAT)
        );
        selecoes.get(indice++).addElenco(alemanha); 
        
        List<Jogador> escocia=Arrays.asList
        (new Jogador("Angus","Gun",27,selecoes.get(indice),posGK),
         new Jogador("Greg","Taylor",27,selecoes.get(indice),posDF),
         new Jogador("Jack","Hendry",27,selecoes.get(indice),posDF),
         new Jogador("Andrew","Robertson",27,selecoes.get(indice),posDF),
         new Jogador("Scott","Mckenna",27,selecoes.get(indice),posDF),
         new Jogador("Scott","Mctominay",27,selecoes.get(indice),posME),
         new Jogador("Ryan","Christie",27,selecoes.get(indice),posME),
         new Jogador("John","Mcginn",27,selecoes.get(indice),posME),
         new Jogador("Che","Adams",27,selecoes.get(indice),posAT),
         new Jogador("Lweis","Morgan",27,selecoes.get(indice),posAT),
         new Jogador("Lawrence","Shankland",27,selecoes.get(indice),posAT)
        );
        selecoes.get(indice++).addElenco(escocia);
        
        List<Jogador> hungria=Arrays.asList
        (new Jogador("Peter","Gulacsi",27,selecoes.get(indice),posGK),
         new Jogador("Milos","Kerkez",27,selecoes.get(indice),posDF),
         new Jogador("Attila","Szalai",27,selecoes.get(indice),posDF),
         new Jogador("Vilmos","Orban",27,selecoes.get(indice),posDF),
         new Jogador("Loic","Nego",27,selecoes.get(indice),posDF),
         new Jogador("Dominik","Szobolai",27,selecoes.get(indice),posME),
         new Jogador("Daniel","Gazdag",27,selecoes.get(indice),posME),
         new Jogador("Krisztofer","Horvath",27,selecoes.get(indice),posME),
         new Jogador("Roland","Sallai",27,selecoes.get(indice),posAT),
         new Jogador("Martin","Adam",27,selecoes.get(indice),posAT),
         new Jogador("Barnabas","Varga",27,selecoes.get(indice),posAT)
        );
        selecoes.get(indice++).addElenco(hungria);
        
        List<Jogador> suica=Arrays.asList
        (new Jogador("Yan","Sommer",27,selecoes.get(indice),posGK),
         new Jogador("Fabian","Schar",27,selecoes.get(indice),posDF),
         new Jogador("Ricardo","Rodriguez",27,selecoes.get(indice),posDF),
         new Jogador("Manuel","Akanji",27,selecoes.get(indice),posDF),
         new Jogador("Nico","Elvedi",27,selecoes.get(indice),posDF),
         new Jogador("Granit","Xhaka",27,selecoes.get(indice),posME),
         new Jogador("Remo","Freuler",27,selecoes.get(indice),posME),
         new Jogador("Denis","Zakaria",27,selecoes.get(indice),posME),
         new Jogador("Dan","Ndoye",27,selecoes.get(indice),posAT),
         new Jogador("Breel","Embolo",27,selecoes.get(indice),posAT),
         new Jogador("Noah","Okafor",27,selecoes.get(indice),posAT)
        );
        selecoes.get(indice++).addElenco(suica);
        
        List<Jogador> albania=Arrays.asList
        (new Jogador("Etrit","Berisha",27,selecoes.get(indice),posGK),
         new Jogador("Ivan","Balliu",27,selecoes.get(indice),posDF),
         new Jogador("Enea","Mihaj",27,selecoes.get(indice),posDF),
         new Jogador("Mario","Mihaj",27,selecoes.get(indice),posDF),
         new Jogador("Berat","Djimsiti",27,selecoes.get(indice),posDF),
         new Jogador("Ernest","Muci",27,selecoes.get(indice),posME),
         new Jogador("Kristjan","Asllani",27,selecoes.get(indice),posME),
         new Jogador("Klaus","Gjasula",27,selecoes.get(indice),posME),
         new Jogador("Rey","Manaj",27,selecoes.get(indice),posAT),
         new Jogador("Mirlind","Daku",27,selecoes.get(indice),posAT),
         new Jogador("Arber","Hoxha",27,selecoes.get(indice),posAT)
        );
        selecoes.get(indice++).addElenco(albania);
        
        List<Jogador> croacia=Arrays.asList
        (new Jogador("Dominik","Livakovic",27,selecoes.get(indice),posGK),
         new Jogador("Josko","Gvardiol",27,selecoes.get(indice),posDF),
         new Jogador("Domagoj","Vida",27,selecoes.get(indice),posDF),
         new Jogador("Borna","Sosa",27,selecoes.get(indice),posDF),
         new Jogador("Josip","Sutalo",27,selecoes.get(indice),posDF),
         new Jogador("Mateo","Kovacic",27,selecoes.get(indice),posME),
         new Jogador("Mario","Pasalic",27,selecoes.get(indice),posME),
         new Jogador("Luka","Modric",27,selecoes.get(indice),posME),
         new Jogador("Ivan","Perisic",27,selecoes.get(indice),posAT),
         new Jogador("Bruno","Petkovic",27,selecoes.get(indice),posAT),
         new Jogador("Andrej","Kramaric",27,selecoes.get(indice),posAT)
        );
        selecoes.get(indice++).addElenco(croacia);
        
        List<Jogador> espanha=Arrays.asList
        (new Jogador("Unai","Simon",27,selecoes.get(indice),posGK),
         new Jogador("Nacho","Fernandez",27,selecoes.get(indice),posDF),
         new Jogador("Alejandro","Grimaldo",27,selecoes.get(indice),posDF),
         new Jogador("Dani","Carvajal",27,selecoes.get(indice),posDF),
         new Jogador("Robin","Le Nornmand",27,selecoes.get(indice),posDF),
         new Jogador("Dani","Olmo",27,selecoes.get(indice),posME),
         new Jogador("Rodri","Cascante",27,selecoes.get(indice),posME),
         new Jogador("Pedri","Lopez",27,selecoes.get(indice),posME),
         new Jogador("Ferran","Torres",27,selecoes.get(indice),posAT),
         new Jogador("Alvaro","Morata",27,selecoes.get(indice),posAT),
         new Jogador("Lamine","Yamal",27,selecoes.get(indice),posAT)
        );
        selecoes.get(indice++).addElenco(espanha);
        
        List<Jogador> italia=Arrays.asList
        (new Jogador("Gianluiggi","Donnaruma",27,selecoes.get(indice),posGK),
         new Jogador("Alessandro","Bastoni",27,selecoes.get(indice),posDF),
         new Jogador("Giovanni","Di Lorenzo",27,selecoes.get(indice),posDF),
         new Jogador("Federico","Dimarco",27,selecoes.get(indice),posDF),
         new Jogador("Mateo","Darmian",27,selecoes.get(indice),posDF),
         new Jogador("Lorenzo","Pellegrini",27,selecoes.get(indice),posME),
         new Jogador("Nicolo","Barella",27,selecoes.get(indice),posME),
         new Jogador("Jorginho","Filho",27,selecoes.get(indice),posME),
         new Jogador("Federico","Chiesa",27,selecoes.get(indice),posAT),
         new Jogador("Gianluco","Scamacca",27,selecoes.get(indice),posAT),
         new Jogador("Mateo","Retegui",27,selecoes.get(indice),posAT)
        );
        selecoes.get(indice++).addElenco(italia);
        
        List<Jogador> dinamarca=Arrays.asList
        (new Jogador("Kasper","Schimeichel",27,selecoes.get(indice),posGK),
         new Jogador("Andreas","Christensen",27,selecoes.get(indice),posDF),
         new Jogador("Alexander","Bah",27,selecoes.get(indice),posDF),
         new Jogador("Simon","Kjaer",27,selecoes.get(indice),posDF),
         new Jogador("Joakim","Maehle",27,selecoes.get(indice),posDF),
         new Jogador("Pierre-Emile","Hojbjerg",27,selecoes.get(indice),posME),
         new Jogador("Christian","Eriksen",27,selecoes.get(indice),posME),
         new Jogador("Morten","Hjulmand",27,selecoes.get(indice),posME),
         new Jogador("Anders","Dreyer",27,selecoes.get(indice),posAT),
         new Jogador("Rasmus","Hojlund",27,selecoes.get(indice),posAT),
         new Jogador("Kasper","Dolberg",27,selecoes.get(indice),posAT)
        );
        selecoes.get(indice++).addElenco(dinamarca);
        
        List<Jogador> eslovenia=Arrays.asList
        (new Jogador("Jan","Oblack",27,selecoes.get(indice),posGK),
         new Jogador("Jaka","Bijol",27,selecoes.get(indice),posDF),
         new Jogador("Erik","Janza",27,selecoes.get(indice),posDF),
         new Jogador("Petar","Stojanovic",27,selecoes.get(indice),posDF),
         new Jogador("Miha","Blazic",27,selecoes.get(indice),posDF),
         new Jogador("Jon","Stankovic",27,selecoes.get(indice),posME),
         new Jogador("Tomi","Horvat",27,selecoes.get(indice),posME),
         new Jogador("Timi","Elsnik",27,selecoes.get(indice),posME),
         new Jogador("Andraz","Sporar",27,selecoes.get(indice),posAT),
         new Jogador("Zan","Celar",27,selecoes.get(indice),posAT),
         new Jogador("Benjamin","Sesko",27,selecoes.get(indice),posAT)
        );
        selecoes.get(indice++).addElenco(eslovenia);
        
        List<Jogador> inglaterra=Arrays.asList
        (new Jogador("Jordan","Pickford",27,selecoes.get(indice),posGK),
         new Jogador("Trent","Alexander-Arnold",27,selecoes.get(indice),posDF),
         new Jogador("Kyle","Walker",27,selecoes.get(indice),posDF),
         new Jogador("John","Stones",27,selecoes.get(indice),posDF),
         new Jogador("Lewis","Dunk",27,selecoes.get(indice),posDF),
         new Jogador("Declan","Rice",27,selecoes.get(indice),posME),
         new Jogador("Cole","Palmer",27,selecoes.get(indice),posME),
         new Jogador("Jude","Bellingham",27,selecoes.get(indice),posME),
         new Jogador("Bukayo","Saka",27,selecoes.get(indice),posAT),
         new Jogador("Harry","Kane",27,selecoes.get(indice),posAT),
         new Jogador("Phil","Foden",27,selecoes.get(indice),posAT)
        );
        selecoes.get(indice++).addElenco(inglaterra);
        
        List<Jogador> servia=Arrays.asList
        (new Jogador("Pedrag","Rajkovic",27,selecoes.get(indice),posGK),
         new Jogador("Filip","Kostic",27,selecoes.get(indice),posDF),
         new Jogador("Nemanja","Gudelj",27,selecoes.get(indice),posDF),
         new Jogador("Strahinja","Pavlovic",27,selecoes.get(indice),posDF),
         new Jogador("Uros","Spajic",27,selecoes.get(indice),posDF),
         new Jogador("Sergej","Milinkovic-Savic",27,selecoes.get(indice),posME),
         new Jogador("Nemanja","Maksimovic",27,selecoes.get(indice),posME),
         new Jogador("Dusan","Tadic",27,selecoes.get(indice),posME),
         new Jogador("Luka","Jovic",27,selecoes.get(indice),posAT),
         new Jogador("Dusan","Vlahovic",27,selecoes.get(indice),posAT),
         new Jogador("Aleksandar","Mitrovic",27,selecoes.get(indice),posAT)
        );
        selecoes.get(indice++).addElenco(servia);
        
        List<Jogador> austria=Arrays.asList
        (new Jogador("Niklas","Hedl",27,selecoes.get(indice),posGK),
         new Jogador("Stefan","Posch",27,selecoes.get(indice),posDF),
         new Jogador("Kevin","Danso",27,selecoes.get(indice),posDF),
         new Jogador("Maximilian","Wober",27,selecoes.get(indice),posDF),
         new Jogador("Gernot","Trauner",27,selecoes.get(indice),posDF),
         new Jogador("Marcel","Sabitzer",27,selecoes.get(indice),posME),
         new Jogador("Floran","Kainz",27,selecoes.get(indice),posME),
         new Jogador("Konrad","Laimer",27,selecoes.get(indice),posME),
         new Jogador("Marko","Arnautovic",27,selecoes.get(indice),posAT),
         new Jogador("Patrick","Wimmer",27,selecoes.get(indice),posAT),
         new Jogador("Michael","Gregoritsch",27,selecoes.get(indice),posAT)
        );
        selecoes.get(indice++).addElenco(austria);
        
        List<Jogador> franca=Arrays.asList
        (new Jogador("Mike","Maignan",27,selecoes.get(indice),posGK),
         new Jogador("Theo","Hernandez",27,selecoes.get(indice),posDF),
         new Jogador("Ferland","Mendy",27,selecoes.get(indice),posDF),
         new Jogador("Ibrahima","Konate",27,selecoes.get(indice),posDF),
         new Jogador("William","Saliba",27,selecoes.get(indice),posDF),
         new Jogador("Aurelien","Tchouameni",27,selecoes.get(indice),posME),
         new Jogador("Eduardo","Camavinga",27,selecoes.get(indice),posME),
         new Jogador("Warren","Zaire-Emery",27,selecoes.get(indice),posME),
         new Jogador("Antoine","Griezmann",27,selecoes.get(indice),posAT),
         new Jogador("Kylian","Mbappe",27,selecoes.get(indice),posAT),
         new Jogador("Ousmane","Dembele",27,selecoes.get(indice),posAT)
        );
        selecoes.get(indice++).addElenco(franca);
        
        List<Jogador> holanda=Arrays.asList
        (new Jogador("Justin","Bijlow",27,selecoes.get(indice),posGK),
         new Jogador("Virgil","Van Dijk",27,selecoes.get(indice),posDF),
         new Jogador("Daley","Blind",27,selecoes.get(indice),posDF),
         new Jogador("Stefan","De Virj",27,selecoes.get(indice),posDF),
         new Jogador("Denzel","Dumfries",27,selecoes.get(indice),posDF),
         new Jogador("Ryan","Gravenberch",27,selecoes.get(indice),posME),
         new Jogador("Joey","Veerman",27,selecoes.get(indice),posME),
         new Jogador("Xavi","Simmons",27,selecoes.get(indice),posME),
         new Jogador("Cody","Gakpo",27,selecoes.get(indice),posAT),
         new Jogador("Memphis","Depay",27,selecoes.get(indice),posAT),
         new Jogador("Wout","Weghorst",27,selecoes.get(indice),posAT)
        );
        selecoes.get(indice++).addElenco(holanda);
        
        List<Jogador> polonia=Arrays.asList
        (new Jogador("Wojciech","Szczesny",27,selecoes.get(indice),posGK),
         new Jogador("Jakub","Kiwior",27,selecoes.get(indice),posDF),
         new Jogador("Przemyslaw","Frankoski",27,selecoes.get(indice),posDF),
         new Jogador("Pawel","Dawidowicz",27,selecoes.get(indice),posDF),
         new Jogador("Jan","Bednarek",27,selecoes.get(indice),posDF),
         new Jogador("Piotr","Zielinski",27,selecoes.get(indice),posME),
         new Jogador("Jakub","Moder",27,selecoes.get(indice),posME),
         new Jogador("Damian","Szymanski",27,selecoes.get(indice),posME),
         new Jogador("Karol","Swiderski",27,selecoes.get(indice),posAT),
         new Jogador("Michael","Skoras",27,selecoes.get(indice),posAT),
         new Jogador("Robert","Lewandoswki",27,selecoes.get(indice),posAT)
        );
        selecoes.get(indice++).addElenco(polonia);
        
        List<Jogador> belgica=Arrays.asList
        (new Jogador("Koen","Casteels",27,selecoes.get(indice),posGK),
         new Jogador("Jan","Vertonghen",27,selecoes.get(indice),posDF),
         new Jogador("Timothy","Castagne",27,selecoes.get(indice),posDF),
         new Jogador("Zeno","Debast",27,selecoes.get(indice),posDF),
         new Jogador("Thomas","Meunier",27,selecoes.get(indice),posDF),
         new Jogador("Axel","Wistel",27,selecoes.get(indice),posME),
         new Jogador("Kevin","De Bruyne",27,selecoes.get(indice),posME),
         new Jogador("Yuri","Tielemans",27,selecoes.get(indice),posME),
         new Jogador("Leandro","Trossard",27,selecoes.get(indice),posAT),
         new Jogador("Romelu","Lukaku",27,selecoes.get(indice),posAT),
         new Jogador("Jeremy","Doku",27,selecoes.get(indice),posAT)
        );
        selecoes.get(indice++).addElenco(belgica);
        
        List<Jogador> eslovaquia=Arrays.asList
        (new Jogador("Martin","Dubravka",27,selecoes.get(indice),posGK),
         new Jogador("Milan","Skriniar",27,selecoes.get(indice),posDF),
         new Jogador("Denis","Vavro",27,selecoes.get(indice),posDF),
         new Jogador("Sebastian","Kosa",27,selecoes.get(indice),posDF),
         new Jogador("Peter","Pekarik",27,selecoes.get(indice),posDF),
         new Jogador("Stanislav","Lobokta",27,selecoes.get(indice),posME),
         new Jogador("Ondrej","Duda",27,selecoes.get(indice),posME),
         new Jogador("Laszlo","Benes",27,selecoes.get(indice),posME),
         new Jogador("Lubomir","Tupta",27,selecoes.get(indice),posAT),
         new Jogador("Robert","Bozenik",27,selecoes.get(indice),posAT),
         new Jogador("Leo","Sauer",27,selecoes.get(indice),posAT)
        );
        selecoes.get(indice++).addElenco(eslovaquia);
        
        List<Jogador> romenia=Arrays.asList
        (new Jogador("Stefan","Tarnovanu",27,selecoes.get(indice),posGK),
         new Jogador("Andrei","Burca",27,selecoes.get(indice),posDF),
         new Jogador("Andrei","Ratju",27,selecoes.get(indice),posDF),
         new Jogador("Radu","Dragusin",27,selecoes.get(indice),posDF),
         new Jogador("Adrian","Rus",27,selecoes.get(indice),posDF),
         new Jogador("Razvan","Marin",27,selecoes.get(indice),posME),
         new Jogador("Alexandru","Cicaldau",27,selecoes.get(indice),posME),
         new Jogador("Ianis","Hagi",27,selecoes.get(indice),posME),
         new Jogador("Denis","Dragus",27,selecoes.get(indice),posAT),
         new Jogador("Georde","Puscas",27,selecoes.get(indice),posAT),
         new Jogador("Denis","Alibec",27,selecoes.get(indice),posAT)
        );
        selecoes.get(indice++).addElenco(romenia);
        
        List<Jogador> ucrania=Arrays.asList
        (new Jogador("Andriy","Lunin",27,selecoes.get(indice),posGK),
         new Jogador("Oleksandir","Zinchenko",27,selecoes.get(indice),posDF),
         new Jogador("Valery","Bondar",27,selecoes.get(indice),posDF),
         new Jogador("Vitali","Mykolenko",27,selecoes.get(indice),posDF),
         new Jogador("Illia","Zarbarny",27,selecoes.get(indice),posDF),
         new Jogador("Ruslan","Malinovskyi",27,selecoes.get(indice),posME),
         new Jogador("Serhiy","Sydorchuk",27,selecoes.get(indice),posME),
         new Jogador("Taras","Stepanenko",27,selecoes.get(indice),posME),
         new Jogador("Roman","Yaremchuk",27,selecoes.get(indice),posAT),
         new Jogador("Andriy","Yarmolenko",27,selecoes.get(indice),posAT),
         new Jogador("Artem","Dovbyk",27,selecoes.get(indice),posAT)
        );
        selecoes.get(indice++).addElenco(ucrania);
        
        List<Jogador> georgia=Arrays.asList
        (new Jogador("Giorgi","Mamardashvilli",27,selecoes.get(indice),posGK),
         new Jogador("Lasha","Dvali",27,selecoes.get(indice),posDF),
         new Jogador("Guram","Kashia",27,selecoes.get(indice),posDF),
         new Jogador("Giorgi","Gvelesiani",27,selecoes.get(indice),posDF),
         new Jogador("Giorgi","Chakvetadze",27,selecoes.get(indice),posDF),
         new Jogador("Nika","Kvirkvelia",27,selecoes.get(indice),posME),
         new Jogador("Giorgi","Kochorashvilli",27,selecoes.get(indice),posME),
         new Jogador("Gabriel","Sigua",27,selecoes.get(indice),posME),
         new Jogador("Zuriko","Davitashvilli",27,selecoes.get(indice),posAT),
         new Jogador("Giorgi","Kvilitaia",27,selecoes.get(indice),posAT),
         new Jogador("Khvicha","Kvaratskhelia",27,selecoes.get(indice),posAT)
        );
        selecoes.get(indice++).addElenco(georgia);
        
        List<Jogador> portgual=Arrays.asList
        (new Jogador("Diogo","Costa",27,selecoes.get(indice),posGK),
         new Jogador("Ruben","Dias",27,selecoes.get(indice),posDF),
         new Jogador("Silva","Antonio",27,selecoes.get(indice),posDF),
         new Jogador("Joao","Cancelo",27,selecoes.get(indice),posDF),
         new Jogador("Diogo","Dalot",27,selecoes.get(indice),posDF),
         new Jogador("Bruno","Fernandes",27,selecoes.get(indice),posME),
         new Jogador("Joao","Palhinha",27,selecoes.get(indice),posME),
         new Jogador("Bernardo","Silva",27,selecoes.get(indice),posME),
         new Jogador("Cristiano","Ronaldo",27,selecoes.get(indice),posAT),
         new Jogador("Rafael","Leao",27,selecoes.get(indice),posAT),
         new Jogador("Diogo","Jota",27,selecoes.get(indice),posAT)
        );
        selecoes.get(indice++).addElenco(portgual);
        
        List<Jogador> republicaCheca=Arrays.asList
        (new Jogador("Matej","Kovar",27,selecoes.get(indice),posGK),
         new Jogador("Vladimir","Coufal",27,selecoes.get(indice),posDF),
         new Jogador("Tomas","Holes",27,selecoes.get(indice),posDF),
         new Jogador("Robin","Hranac",27,selecoes.get(indice),posDF),
         new Jogador("David","Jurasek",27,selecoes.get(indice),posDF),
         new Jogador("Tomas","Soucek",27,selecoes.get(indice),posME),
         new Jogador("Pavel","Sulc",27,selecoes.get(indice),posME),
         new Jogador("Ondrej","Lingr",27,selecoes.get(indice),posME),
         new Jogador("Patrik","Schick",27,selecoes.get(indice),posAT),
         new Jogador("Adam","Hlozek",27,selecoes.get(indice),posAT),
         new Jogador("Vaclav","Cerny",27,selecoes.get(indice),posAT)
        );
        selecoes.get(indice++).addElenco(republicaCheca);
        
        List<Jogador> turquia=Arrays.asList
        (new Jogador("Ugurcan","Cakir",27,selecoes.get(indice),posGK),
         new Jogador("Zeki","Celik",27,selecoes.get(indice),posDF),
         new Jogador("Mert","Muldur",27,selecoes.get(indice),posDF),
         new Jogador("Ferdi","Kadioglu",27,selecoes.get(indice),posDF),
         new Jogador("Ahmetcan","Kaplan",27,selecoes.get(indice),posDF),
         new Jogador("Hakan","Calhanoglu",27,selecoes.get(indice),posME),
         new Jogador("Orkun","Kukcu",27,selecoes.get(indice),posME),
         new Jogador("Yusuf","Yazici",27,selecoes.get(indice),posME),
         new Jogador("Baris","Yilmaz",27,selecoes.get(indice),posAT),
         new Jogador("Yunus","Akgun",27,selecoes.get(indice),posAT),
         new Jogador("Cenk","Tosun",27,selecoes.get(indice),posAT)
        );
        selecoes.get(indice++).addElenco(turquia);
    }
    public void setupCidades(){
        cidades.add(new Cidade("Berlim",891.8));
        cidades.add(new Cidade("Colonia",405.2));
        cidades.add(new Cidade("Dortmund",280.7));
        cidades.add(new Cidade("Dusseldorf",217.0));
        cidades.add(new Cidade("Frankfurt",248.3));
        cidades.add(new Cidade("Gelsenkirchen",104.8));
        cidades.add(new Cidade("Hamburgo",755.0));
        cidades.add(new Cidade("Leipzig",297.6));
        cidades.add(new Cidade("Munique",310.4));
        cidades.add(new Cidade("Estugarda",207.4));
    }
    public void setupEstadios(){
        setupCidades();
        int i=0;
        estadios.add(new Estadio("Olimpico de Berlim",cidades.get(i++),71000));
        estadios.add(new Estadio("Estadio Colonia",cidades.get(i++),43000));
        estadios.add(new Estadio("Arena Dortmund BVB",cidades.get(i++),62000));
        estadios.add(new Estadio("Arena Dusseldorf",cidades.get(i++),47000));
        estadios.add(new Estadio("Arena Frankfurt",cidades.get(i++),47000));
        estadios.add(new Estadio("Arena AufSchalke",cidades.get(i++),50000));
        estadios.add(new Estadio("Estadio Volkspark Hamburg",cidades.get(i++),49000));
        estadios.add(new Estadio("Estadio Leipzig",cidades.get(i++),40000));
        estadios.add(new Estadio("Arena Futbol de Munique",cidades.get(i++),66000));
        estadios.add(new Estadio("Arena de Estugarda",cidades.get(i++),51000));
    }

    public List<Estadio> getEstadios() {
        return estadios;
    }
    
    public List<Pessoa> getTreinadores() {
        return treinadores;
    }

    public List<Cidade> getCidades() {
        return cidades;
    }
    
}
