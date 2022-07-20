package enums;

public enum Api {
    IMDB("https://imdb-api.com/en/API/Top250Movies/k..."),
    IMDB_MENOR("https://api.mocki.io/v2/549a5d8b/Top250Movies"),
    IMDB_MAIOR("https://mocki.io/v1/9a7c1ca9-29b4-4eb3-8306-1adb9d159060"),
    NASA("https://api.nasa.gov/planetary/apod?api_key=v4lsy5rPlChkGbjV9kCLVokIJE3Fr6Y99rYrPD5A&start_date=2022-06-10&end_date=2022-06-14"),
    NASA_MOCK("https://api.mocki.io/v2/549a5d8b/NASA-APOD");

    private final String url;

    Api(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
