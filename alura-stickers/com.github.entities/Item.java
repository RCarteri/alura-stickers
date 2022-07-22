import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "rank",
    "title",
    "fullTitle",
    "year",
    "image",
    "crew",
    "imDbRating",
    "imDbRatingCount"
})
@Generated("jsonschema2pojo")
public class Item {

    @JsonProperty("id")
    private String id;
    @JsonProperty("rank")
    private String rank;
    @JsonProperty("title")
    private String title;
    @JsonProperty("fullTitle")
    private String fullTitle;
    @JsonProperty("year")
    private String year;
    @JsonProperty("image")
    private String image;
    @JsonProperty("crew")
    private String crew;
    @JsonProperty("imDbRating")
    private String imDbRating;
    @JsonProperty("imDbRatingCount")
    private String imDbRatingCount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("rank")
    public String getRank() {
        return rank;
    }

    @JsonProperty("rank")
    public void setRank(String rank) {
        this.rank = rank;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("fullTitle")
    public String getFullTitle() {
        return fullTitle;
    }

    @JsonProperty("fullTitle")
    public void setFullTitle(String fullTitle) {
        this.fullTitle = fullTitle;
    }

    @JsonProperty("year")
    public String getYear() {
        return year;
    }

    @JsonProperty("year")
    public void setYear(String year) {
        this.year = year;
    }

    @JsonProperty("image")
    public String getImage() {
        return image;
    }

    @JsonProperty("image")
    public void setImage(String image) {
        this.image = image;
    }

    @JsonProperty("crew")
    public String getCrew() {
        return crew;
    }

    @JsonProperty("crew")
    public void setCrew(String crew) {
        this.crew = crew;
    }

    @JsonProperty("imDbRating")
    public String getImDbRating() {
        return imDbRating;
    }

    @JsonProperty("imDbRating")
    public void setImDbRating(String imDbRating) {
        this.imDbRating = imDbRating;
    }

    @JsonProperty("imDbRatingCount")
    public String getImDbRatingCount() {
        return imDbRatingCount;
    }

    @JsonProperty("imDbRatingCount")
    public void setImDbRatingCount(String imDbRatingCount) {
        this.imDbRatingCount = imDbRatingCount;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Item.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("rank");
        sb.append('=');
        sb.append(((this.rank == null)?"<null>":this.rank));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("fullTitle");
        sb.append('=');
        sb.append(((this.fullTitle == null)?"<null>":this.fullTitle));
        sb.append(',');
        sb.append("year");
        sb.append('=');
        sb.append(((this.year == null)?"<null>":this.year));
        sb.append(',');
        sb.append("image");
        sb.append('=');
        sb.append(((this.image == null)?"<null>":this.image));
        sb.append(',');
        sb.append("crew");
        sb.append('=');
        sb.append(((this.crew == null)?"<null>":this.crew));
        sb.append(',');
        sb.append("imDbRating");
        sb.append('=');
        sb.append(((this.imDbRating == null)?"<null>":this.imDbRating));
        sb.append(',');
        sb.append("imDbRatingCount");
        sb.append('=');
        sb.append(((this.imDbRatingCount == null)?"<null>":this.imDbRatingCount));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.imDbRating == null)? 0 :this.imDbRating.hashCode()));
        result = ((result* 31)+((this.image == null)? 0 :this.image.hashCode()));
        result = ((result* 31)+((this.fullTitle == null)? 0 :this.fullTitle.hashCode()));
        result = ((result* 31)+((this.imDbRatingCount == null)? 0 :this.imDbRatingCount.hashCode()));
        result = ((result* 31)+((this.year == null)? 0 :this.year.hashCode()));
        result = ((result* 31)+((this.rank == null)? 0 :this.rank.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.crew == null)? 0 :this.crew.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Item) == false) {
            return false;
        }
        Item rhs = ((Item) other);
        return (((((((((((this.imDbRating == rhs.imDbRating)||((this.imDbRating!= null)&&this.imDbRating.equals(rhs.imDbRating)))&&((this.image == rhs.image)||((this.image!= null)&&this.image.equals(rhs.image))))&&((this.fullTitle == rhs.fullTitle)||((this.fullTitle!= null)&&this.fullTitle.equals(rhs.fullTitle))))&&((this.imDbRatingCount == rhs.imDbRatingCount)||((this.imDbRatingCount!= null)&&this.imDbRatingCount.equals(rhs.imDbRatingCount))))&&((this.year == rhs.year)||((this.year!= null)&&this.year.equals(rhs.year))))&&((this.rank == rhs.rank)||((this.rank!= null)&&this.rank.equals(rhs.rank))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.crew == rhs.crew)||((this.crew!= null)&&this.crew.equals(rhs.crew))));
    }

}
