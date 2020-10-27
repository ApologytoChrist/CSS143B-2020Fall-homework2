package Problem3;

import java.util.UUID;

public abstract class Movie implements StoreMediaOperations {
    String rating;
    String title;
    UUID id;

    public Movie(String rating, String title) {
        this.id = UUID.randomUUID();
        this.rating = rating;
        this.title = title;
    }

    public Movie(Movie anotherMovie) {
        // homework
        this.title = anotherMovie.title;
        this.rating = anotherMovie.rating;
        this.id = anotherMovie.id;
    }

    @Override
    public boolean equals(Object obj) {
        // homework
        if(this.getClass() == obj.getClass()) {
            return this.id == ((Movie) obj).id;
        } else {
            return false;
        }
    }
}
