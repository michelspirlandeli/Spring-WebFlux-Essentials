package academy.devdojo.webflux.util;

import academy.devdojo.webflux.domain.Anime;

public class AnimeCreator {

    public static Anime createAnimeToBeSaved(){
        return Anime.builder()
                .name("Sensei data ken")
                .build();
    }

    public static Anime createValidAnime(){
        return Anime.builder()
                .id(1)
                .name("Sensei data ken")
                .build();
    }

    public static Anime createUpdateAnime(){
        return Anime.builder()
                .id(1)
                .name("Sensei data ken 2")
                .build();
    }
}
