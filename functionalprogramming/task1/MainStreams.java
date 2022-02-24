package functionalprogramming.task1;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainStreams {
    public static void main(String[] args) {

        Video video1 = new Video("BreakingBad1", "BreakingBad1.com", VideoType.EPISODE);
        Video video2 = new Video("BreakingBad2", "BreakingBad2.com", VideoType.PREVIEW);
        Video video3 = new Video("BreakingBad3", "BreakingBad3.com", VideoType.PREVIEW);
        Video video4 = new Video("BreakingBad4", "BreakingBad4.com", VideoType.CLIP);
        Video video5 = new Video("BreakingBad5", "BreakingBad5.com", VideoType.CLIP);
        Video video6 = new Video("BreakingBad6", "BreakingBad6.com", VideoType.EPISODE);

        Episode episode1 = new Episode("BB_E1", 1, Arrays.asList(video1, video2));
        Episode episode2 = new Episode("BB_E2", 2, Arrays.asList(video3, video4));
        Episode episode3 = new Episode("BB_E3", 3, Arrays.asList(video5, video6));

        Season season1 = new Season("BB_S01", 1, Arrays.asList(episode1, episode2));
        Season season2 = new Season("BB_S02", 2, Arrays.asList(episode3));

        List<Season> seasons = Arrays.asList(season1, season2);


        //list of episodes
        System.out.println("\nlist of episodes");
        seasons.stream()
                .flatMap(s -> s.episodes.stream())
                .collect(Collectors.toList())
                .forEach(System.out::println);

        //list of videos
        System.out.println("\nlist of videos");
        seasons.stream()
                .flatMap(s -> s.episodes.stream())
                .flatMap(e -> e.videos.stream())
                .collect(Collectors.toList())
                .forEach(System.out::println);

        //list of seasons numbers
        System.out.println("\nlist of seasons numbers");
        seasons.stream()
                .map(s -> s.seasonNumber)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        //list of seasons names
        System.out.println("\nlist of seasons names");
        seasons.stream()
                .map(s -> s.seasonName)
                .collect(Collectors.toList())
                .forEach(System.out::println);


        //list of episodes names
        System.out.println("\nlist of episodes names");
        seasons.stream()
                .flatMap(s -> s.episodes.stream())
                .map(e -> e.episodeName)
                .collect(Collectors.toList())
                .forEach(System.out::println);


        //list of videos names
        System.out.println("\nlist of videos names");
        seasons.stream()
                .flatMap(s -> s.episodes.stream())
                .flatMap(e -> e.videos.stream())
                .map(v -> v.title)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        //list of videos urls
        System.out.println("\nlist of videos urls");
        seasons.stream()
                .flatMap(s -> s.episodes.stream())
                .flatMap(e -> e.videos.stream())
                .map(v -> v.url)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        //list of even episodes
        System.out.println("\nlist of even episodes");
        seasons.stream()
                .flatMap(s -> s.episodes.stream())
                .filter(e -> e.episodeNumber % 2 == 0)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        //list of even seasons
        System.out.println("\nlist of even seasons");
        seasons.stream()
                .filter(s -> s.seasonNumber % 2 == 0)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}

enum VideoType {
    CLIP, PREVIEW, EPISODE
}
class Video {
    public String title;
    public String url;
    public VideoType videoType;
    public Video(String title, String url, VideoType videoType) {
        this.title = title;
        this.url = url;
        this.videoType = videoType;
    }

    @Override
    public String toString() {
        return "Video{" +
                "title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", videoType=" + videoType +
                '}';
    }
}
class Episode {
    public String episodeName;
    public int episodeNumber;
    List<Video> videos;
    public Episode(String episodeName, int episodeNumber,
                   List<Video> videos) {
        this.episodeName = episodeName;
        this.episodeNumber = episodeNumber;
        this.videos = videos;
    }

    @Override
    public String toString() {
        return "Episode{" +
                "episodeName='" + episodeName + '\'' +
                ", episodeNumber=" + episodeNumber +
                ", videos=" + videos +
                '}';
    }
}
class Season {
    public String seasonName;
    public int seasonNumber;
    List<Episode> episodes;
    public Season(String seasonName, int seasonNumber,
                  List<Episode> episodes) {
        this.seasonName = seasonName;
        this.seasonNumber = seasonNumber;
        this.episodes = episodes;
    }

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonNumber=" + seasonNumber +
                ", episodes=" + episodes +
                '}';
    }
}
