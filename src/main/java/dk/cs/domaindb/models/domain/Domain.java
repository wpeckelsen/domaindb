package dk.cs.domaindb.models.domain;

import dk.cs.domaindb.models.enums.Category;
import dk.cs.domaindb.models.enums.Country;
import dk.cs.domaindb.models.enums.Source;
import dk.cs.domaindb.models.enums.Tag;
import jakarta.persistence.*;

@Entity
public class Domain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "domainid")
    private Long domainID;

    @Enumerated(EnumType.STRING)
    @Column(name = "country")
    private Country country;

    @Enumerated(EnumType.STRING)
    @Column(name = "source")
    private Source source;

    @Column(name = "url")
    private String url;

    @Column(name = "domainrating")
    private Integer domainRating;

    @Column(name = "traffic")
    private Integer traffic;

    @Column(name = "referringdomains")
    private Integer referringDomains;

    @Enumerated(EnumType.STRING)
    @Column(name = "category")
    private Category category;

    @Enumerated(EnumType.STRING)
    @Column(name = "tag")
    private Tag tag;

    @Column(name = "price")
    private Integer price;

    @Column(name = "gamblingprice")
    private Integer gamblingPrice;

    @Column(name = "email")
    private String email;

    @Column(name = "notes")
    private String notes;


////////////////////////////////////////////////////////////////////////////////


    public Long getDomainID() {
        return domainID;
    }

    public void setDomainID(Long domainID) {
        this.domainID = domainID;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String name) {
        this.url = name;
    }

    public Integer getDomainRating() {
        return domainRating;
    }

    public void setDomainRating(Integer domainRating) {
        this.domainRating = domainRating;
    }

    public Integer getTraffic() {
        return traffic;
    }

    public void setTraffic(Integer traffic) {
        this.traffic = traffic;
    }

    public Integer getReferringDomains() {
        return referringDomains;
    }

    public void setReferringDomains(Integer referringDomains) {
        this.referringDomains = referringDomains;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getGamblingPrice() {
        return gamblingPrice;
    }

    public void setGamblingPrice(Integer gamblingPrice) {
        this.gamblingPrice = gamblingPrice;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
