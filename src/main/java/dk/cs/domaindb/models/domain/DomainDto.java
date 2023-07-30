package dk.cs.domaindb.models.domain;

import dk.cs.domaindb.models.enums.Category;
import dk.cs.domaindb.models.enums.Country;
import dk.cs.domaindb.models.enums.Source;
import dk.cs.domaindb.models.enums.Tag;

public class DomainDto {

    private Long domainID;
    private Country country;
    private Source source;
    private String name;
    private Integer domainRating;
    private Integer traffic;
    private Integer referringDomains;
    private Category category;
    private Tag tag;
    private Integer price;
    private Integer gamblingPrice;
    private String email;
    private String notes;

////////////////////////////////////////////////////////////////


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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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