package day31_Constructors.HomeTask;

public class MovieObject {
    public static void main(String[] args) {


        Movie movie = new Movie("USA", "Journey to SDET:Cydeo Batch23",
                "Adventure,Thriller, Comedy", "10/25/2021", "Kuzzat Altay");
        String[] casts = {"Asiya", "Adam", "Muhtar", "Gulshen", "Dimo", "Elena", "Farya", "Ali"};

        movie.addCasts(casts);

        System.out.println(movie);

        }





       /* .2create a class called MovieObjects
        1. create an object of the movie:
        title: Journey to SDET: Cydeo Batch 23
        country: USA
        Genre: Adventure, Comedy, Thriller
        release date: 10/25/2021
        director: Kuzzat Altay
        Casts: Asiya, Adam, Muhtar and 5 more students from your group

        print the full info of the movie   */

    }

