package com.mobitribe.wheelsonfire.model;


import java.util.List;

public class Category {

    private Integer id;
    private String name;
    private String slug;
    private Integer parent;
    private String description;
    private String display;
    private Image image;
    private Integer menuOrder;
    private Integer count;
    private Links links;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Integer getParent() {
        return parent;
    }

    public void setParent(Integer parent) {
        this.parent = parent;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Integer getMenuOrder() {
        return menuOrder;
    }

    public void setMenuOrder(Integer menuOrder) {
        this.menuOrder = menuOrder;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }


    public class Collection {

        private String href;

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

    }

    public class Image {

        private Integer id;
        private String dateCreated;
        private String dateCreatedGmt;
        private String dateModified;
        private String dateModifiedGmt;
        private String src;
        private String title;
        private String alt;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getDateCreated() {
            return dateCreated;
        }

        public void setDateCreated(String dateCreated) {
            this.dateCreated = dateCreated;
        }

        public String getDateCreatedGmt() {
            return dateCreatedGmt;
        }

        public void setDateCreatedGmt(String dateCreatedGmt) {
            this.dateCreatedGmt = dateCreatedGmt;
        }

        public String getDateModified() {
            return dateModified;
        }

        public void setDateModified(String dateModified) {
            this.dateModified = dateModified;
        }

        public String getDateModifiedGmt() {
            return dateModifiedGmt;
        }

        public void setDateModifiedGmt(String dateModifiedGmt) {
            this.dateModifiedGmt = dateModifiedGmt;
        }

        public String getSrc() {
            return src;
        }

        public void setSrc(String src) {
            this.src = src;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

    }

    public class Links {

        private List<Self> self = null;
        private List<Collection> collection = null;

        public List<Self> getSelf() {
            return self;
        }

        public void setSelf(List<Self> self) {
            this.self = self;
        }

        public List<Collection> getCollection() {
            return collection;
        }

        public void setCollection(List<Collection> collection) {
            this.collection = collection;
        }

    }
    public class Self {

        private String href;

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

    }
}

