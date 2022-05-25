package inheritance.Business;


import java.util.ArrayList;

public class Theater extends Business {

    ArrayList <String> nowShowing = new ArrayList<>();

    public Theater(String name) {
        super.name = name;
    }

    public void addMovies (String movieName) {
        if(!nowShowing.contains(movieName))
            nowShowing.add(movieName);
    }

    public void deleteMovie (String movieName) {
        if(nowShowing.contains(movieName))
            nowShowing.remove(movieName);
    }

    @Override
    public String toString() {
        return name;
    }

}
