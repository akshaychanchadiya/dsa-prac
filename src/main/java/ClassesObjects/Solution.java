package ClassesObjects;

public class Solution{
    String title;
    String artist;
    int listenerCount;

    Solution(String title, String artist){
        this.title=title;
        this.artist=artist;
        this.listenerCount=0;
    }

    int howMany (int newLis) {
        listenerCount = listenerCount + newLis;
        return listenerCount;
    }

    String getTitle () {
        return title;
    }

    String getArtist () {
        return artist;
    }


    public static void main(String[] args) {
        Solution soulMeetsBody = new Solution("Soul Meets Body", "Death Cab for Cutie");


        Solution hikaruNara = new Solution("Hikaru Nara", "Goose House");

        System.out.println(soulMeetsBody.getTitle());
        System.out.println(hikaruNara.getArtist());

        System.out.println(soulMeetsBody.howMany(10));
        System.out.println(hikaruNara.howMany(12));
    }
}
