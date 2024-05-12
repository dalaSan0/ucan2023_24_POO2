import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Movie> movies=setupMovies();
        String directorProcurado="Stanley Kubrick",quebraLinha="************";
        int duracaoProcurada=100;
        int opcao=0;
        Comparator<Movie> duracaoComparator=(Movie m1,Movie m2) ->{
            if(m1.getDuracaoEmMinutos() > m2.getDuracaoEmMinutos()) 
                return 1;
            if(m1.getDuracaoEmMinutos()== m2.getDuracaoEmMinutos())
                return 0;
            return -1;
        };
        Comparator<Movie> dataComparator=(Movie m1,Movie m2)->{
            if(m1.getAnoLancamento() < m2.getAnoLancamento())
                return 1;
            if(m1.getAnoLancamento() == m2.getAnoLancamento())
                return 0;
            return -1;
        };
        
        System.out.println("Quantidade de Filmes: "+movies.size());
        System.out.println(quebraLinha);
        System.out.println("Filmes do Director: "+directorProcurado+"\n");
        buscarFilmesDe(movies,directorProcurado);
        System.out.println(quebraLinha);
        System.out.println("Filmes com mais de "+duracaoProcurada+" Minutos"+"\n");
        buscarFilmesLongos(movies,duracaoProcurada);
        System.out.println(quebraLinha);
        System.out.println("Directores e seus Filmes\n");
        mapaDirectores(movies);
        System.out.println(quebraLinha);
        System.out.println("Filme Mais Longo\n");
        getFilmeMaisLongo(movies,duracaoComparator);
        System.out.println("Filme Mais Curto\n");
        getFilmeMaisCurto(movies,duracaoComparator);
        System.out.println(quebraLinha);
        System.out.println("Lista de Filmes por Data\n");
        sortFilmesData(movies,dataComparator);
    }
    public static void buscarFilmesDe(List<Movie> movies,String director){
        movies.stream().filter(movie -> movie.getDirector().equals(director))
                .forEach(System.out::println);
    }
    public static void buscarFilmesLongos(List<Movie> movies,int duracao){
        movies.stream().filter(movie -> movie.getDuracaoEmMinutos()>=duracao)
                .forEach(System.out::println);
    }
    public static void mapaDirectores(List<Movie> movies){
        String quebraLinha="------------";
        Map< String,List<Movie> > directores=movies.stream()
                .collect(Collectors.groupingBy(Movie::getDirector));
        
        directores.keySet().forEach(director->{
            System.out.println("Filmes de : "+director);
            directores.get(director).forEach(movie -> System.out.println("-"+movie.getTitulo()));
            System.out.println(quebraLinha);});
    }
    public static void getFilmeMaisLongo(List<Movie> movies,Comparator comparator){
        System.out.println(movies.stream().max(comparator).get());
    }
    public static void getFilmeMaisCurto(List<Movie> movies,Comparator comparator){
        System.out.println(movies.stream().min(comparator).get());
    }
    public static void sortFilmesData(List<Movie> movies,Comparator comparator){
        movies.stream().sorted(comparator).forEach(System.out::println);
    }
    public static List<Movie> setupMovies(){
        
        List<Movie> movies=new ArrayList<>();
        
        movies.add(new Movie("A Space Odyssey","Stanley Kubrick",139,1968));
        movies.add(new Movie("Naruto: The Last","Tsuneo Kobayashi",120,2014));
        movies.add(new Movie("Tonari no Totoro","Miyazakai Hayao",86,1988));
        movies.add(new Movie("Tenki no Ko","Makoto Shinkai",114,2019));
        movies.add(new Movie("The Killing","Stanley Kubrick",83,1956));
        movies.add(new Movie("Hotaru no Haka","Isao Takahata",89,1988));
        movies.add(new Movie("Uhinawareta Tou","Masahiko Murata",85,2010));
        movies.add(new Movie("Haaru no Ugoki Shiro","Miyazakai Hayao",119,2004));
        movies.add(new Movie("Summer Wars","Mamoru Hosoda",114,2009));
        movies.add(new Movie("The End of Envagelion","Wes Anderson",81,1997));
        movies.add(new Movie("Mononoke Hime","Miyazakai Hayao",133,1997));
        movies.add(new Movie("Kimi no na wa","Makoto Shinkai",107,2016));
        movies.add(new Movie("Akira","Katsuhiro Otomo",124,1988));
        movies.add(new Movie("Paths of Glory","Stanley Kubrick",86,1957));
        movies.add(new Movie("Toki o Kakeru Shoujo","Mamoru Hosoda",98,2006));
        movies.add(new Movie("One Piece: Z","Tatsuya Nagamine",107,2012));
        
        return movies;
    }
}
