package com.mobitribe.wheelsonfire.model;

import java.io.Serializable;
import java.util.List;

public class Product implements Serializable{

private Integer id;
private String name;
private String slug;
private String permalink;
private String date_created;
private String date_created_gmt;
private String date_modified;
private String date_modified_gmt;
private String type;
private String status;
private Boolean featured;
private String catalog_visibility;
private String description;
private String short_description;
private String sku;
private String price;
private String regular_price;
private String sale_price;
private Object date_on_sale_from;
private Object date_on_sale_from_gmt;
private Object date_on_sale_to;
private Object date_on_sale_to_gmt;
private String price_html;
private Boolean on_sale;
private Boolean purchasable;
private Integer total_sales;
private Boolean virtual;
private Boolean downloadable;
private List<Object> downloads = null;
private Integer download_limit;
private Integer download_expiry;
private String external_url;
private String button_text;
private String tax_status;
private String tax_class;
private Boolean manage_stock;
private Object stock_quantity;
private Boolean in_stock;
private String backorders;
private Boolean backorders_allowed;
private Boolean backordered;
private Boolean sold_individually;
private String weight;
private Dimensions dimensions;
private Boolean shipping_required;
private Boolean shipping_taxable;
private String shipping_class;
private Integer shipping_class_id;
private Boolean reviews_allowed;
private String average_rating;
private Integer rating_count;
private List<Integer> related_ids = null;
private List<Object> upsell_ids = null;
private List<Object> cross_sell_ids = null;
private Integer parent_id;
private String purchase_note;
private List<Category> categories = null;
private List<Object> tags = null;
private List<Image> images = null;
private List<Attribute> attributes = null;
private List<Object> default_attributes = null;
private List<Object> variations = null;
private List<Object> grouped_products = null;
private Integer menu_order;
private List<Object> meta_data = null;
private Links _links;

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

public String getPermalink() {
return permalink;
}

public void setPermalink(String permalink) {
this.permalink = permalink;
}

public String getDate_created() {
return date_created;
}

public void setDate_created(String date_created) {
this.date_created = date_created;
}

public String getDate_created_gmt() {
return date_created_gmt;
}

public void setDate_created_gmt(String date_created_gmt) {
this.date_created_gmt = date_created_gmt;
}

public String getDate_modified() {
return date_modified;
}

public void setDate_modified(String date_modified) {
this.date_modified = date_modified;
}

public String getDate_modified_gmt() {
return date_modified_gmt;
}

public void setDate_modified_gmt(String date_modified_gmt) {
this.date_modified_gmt = date_modified_gmt;
}

public String getType() {
return type;
}

public void setType(String type) {
this.type = type;
}

public String getStatus() {
return status;
}

public void setStatus(String status) {
this.status = status;
}

public Boolean getFeatured() {
return featured;
}

public void setFeatured(Boolean featured) {
this.featured = featured;
}

public String getCatalog_visibility() {
return catalog_visibility;
}

public void setCatalog_visibility(String catalog_visibility) {
this.catalog_visibility = catalog_visibility;
}

public String getDescription() {
return description;
}

public void setDescription(String description) {
this.description = description;
}

public String getShort_description() {
return short_description;
}

public void setShort_description(String short_description) {
this.short_description = short_description;
}

public String getSku() {
return sku;
}

public void setSku(String sku) {
this.sku = sku;
}

public String getPrice() {
return price;
}

public void setPrice(String price) {
this.price = price;
}

public String getRegular_price() {
return regular_price;
}

public void setRegular_price(String regular_price) {
this.regular_price = regular_price;
}

public String getSale_price() {
return sale_price;
}

public void setSale_price(String sale_price) {
this.sale_price = sale_price;
}

public Object getDate_on_sale_from() {
return date_on_sale_from;
}

public void setDate_on_sale_from(Object date_on_sale_from) {
this.date_on_sale_from = date_on_sale_from;
}

public Object getDate_on_sale_from_gmt() {
return date_on_sale_from_gmt;
}

public void setDate_on_sale_from_gmt(Object date_on_sale_from_gmt) {
this.date_on_sale_from_gmt = date_on_sale_from_gmt;
}

public Object getDate_on_sale_to() {
return date_on_sale_to;
}

public void setDate_on_sale_to(Object date_on_sale_to) {
this.date_on_sale_to = date_on_sale_to;
}

public Object getDate_on_sale_to_gmt() {
return date_on_sale_to_gmt;
}

public void setDate_on_sale_to_gmt(Object date_on_sale_to_gmt) {
this.date_on_sale_to_gmt = date_on_sale_to_gmt;
}

public String getPrice_html() {
return price_html;
}

public void setPrice_html(String price_html) {
this.price_html = price_html;
}

public Boolean getOn_sale() {
return on_sale;
}

public void setOn_sale(Boolean on_sale) {
this.on_sale = on_sale;
}

public Boolean getPurchasable() {
return purchasable;
}

public void setPurchasable(Boolean purchasable) {
this.purchasable = purchasable;
}

public Integer getTotal_sales() {
return total_sales;
}

public void setTotal_sales(Integer total_sales) {
this.total_sales = total_sales;
}

public Boolean getVirtual() {
return virtual;
}

public void setVirtual(Boolean virtual) {
this.virtual = virtual;
}

public Boolean getDownloadable() {
return downloadable;
}

public void setDownloadable(Boolean downloadable) {
this.downloadable = downloadable;
}

public List<Object> getDownloads() {
return downloads;
}

public void setDownloads(List<Object> downloads) {
this.downloads = downloads;
}

public Integer getDownload_limit() {
return download_limit;
}

public void setDownload_limit(Integer download_limit) {
this.download_limit = download_limit;
}

public Integer getDownload_expiry() {
return download_expiry;
}

public void setDownload_expiry(Integer download_expiry) {
this.download_expiry = download_expiry;
}

public String getExternal_url() {
return external_url;
}

public void setExternal_url(String external_url) {
this.external_url = external_url;
}

public String getButton_text() {
return button_text;
}

public void setButton_text(String button_text) {
this.button_text = button_text;
}

public String getTax_status() {
return tax_status;
}

public void setTax_status(String tax_status) {
this.tax_status = tax_status;
}

public String getTax_class() {
return tax_class;
}

public void setTax_class(String tax_class) {
this.tax_class = tax_class;
}

public Boolean getManage_stock() {
return manage_stock;
}

public void setManage_stock(Boolean manage_stock) {
this.manage_stock = manage_stock;
}

public Object getStock_quantity() {
return stock_quantity;
}

public void setStock_quantity(Object stock_quantity) {
this.stock_quantity = stock_quantity;
}

public Boolean getIn_stock() {
return in_stock;
}

public void setIn_stock(Boolean in_stock) {
this.in_stock = in_stock;
}

public String getBackorders() {
return backorders;
}

public void setBackorders(String backorders) {
this.backorders = backorders;
}

public Boolean getBackorders_allowed() {
return backorders_allowed;
}

public void setBackorders_allowed(Boolean backorders_allowed) {
this.backorders_allowed = backorders_allowed;
}

public Boolean getBackordered() {
return backordered;
}

public void setBackordered(Boolean backordered) {
this.backordered = backordered;
}

public Boolean getSold_individually() {
return sold_individually;
}

public void setSold_individually(Boolean sold_individually) {
this.sold_individually = sold_individually;
}

public String getWeight() {
return weight;
}

public void setWeight(String weight) {
this.weight = weight;
}

public Dimensions getDimensions() {
return dimensions;
}

public void setDimensions(Dimensions dimensions) {
this.dimensions = dimensions;
}

public Boolean getShipping_required() {
return shipping_required;
}

public void setShipping_required(Boolean shipping_required) {
this.shipping_required = shipping_required;
}

public Boolean getShipping_taxable() {
return shipping_taxable;
}

public void setShipping_taxable(Boolean shipping_taxable) {
this.shipping_taxable = shipping_taxable;
}

public String getShipping_class() {
return shipping_class;
}

public void setShipping_class(String shipping_class) {
this.shipping_class = shipping_class;
}

public Integer getShipping_class_id() {
return shipping_class_id;
}

public void setShipping_class_id(Integer shipping_class_id) {
this.shipping_class_id = shipping_class_id;
}

public Boolean getReviews_allowed() {
return reviews_allowed;
}

public void setReviews_allowed(Boolean reviews_allowed) {
this.reviews_allowed = reviews_allowed;
}

public String getAverage_rating() {
return average_rating;
}

public void setAverage_rating(String average_rating) {
this.average_rating = average_rating;
}

public Integer getRating_count() {
return rating_count;
}

public void setRating_count(Integer rating_count) {
this.rating_count = rating_count;
}

public List<Integer> getRelated_ids() {
return related_ids;
}

public void setRelated_ids(List<Integer> related_ids) {
this.related_ids = related_ids;
}

public List<Object> getUpsell_ids() {
return upsell_ids;
}

public void setUpsell_ids(List<Object> upsell_ids) {
this.upsell_ids = upsell_ids;
}

public List<Object> getCross_sell_ids() {
return cross_sell_ids;
}

public void setCross_sell_ids(List<Object> cross_sell_ids) {
this.cross_sell_ids = cross_sell_ids;
}

public Integer getParent_id() {
return parent_id;
}

public void setParent_id(Integer parent_id) {
this.parent_id = parent_id;
}

public String getPurchase_note() {
return purchase_note;
}

public void setPurchase_note(String purchase_note) {
this.purchase_note = purchase_note;
}

public List<Category> getCategories() {
return categories;
}

public void setCategories(List<Category> categories) {
this.categories = categories;
}

public List<Object> getTags() {
return tags;
}

public void setTags(List<Object> tags) {
this.tags = tags;
}

public List<Image> getImages() {
return images;
}

public void setImages(List<Image> images) {
this.images = images;
}

public List<Attribute> getAttributes() {
return attributes;
}

public void setAttributes(List<Attribute> attributes) {
this.attributes = attributes;
}

public List<Object> getDefault_attributes() {
return default_attributes;
}

public void setDefault_attributes(List<Object> default_attributes) {
this.default_attributes = default_attributes;
}

public List<Object> getVariations() {
return variations;
}

public void setVariations(List<Object> variations) {
this.variations = variations;
}

public List<Object> getGrouped_products() {
return grouped_products;
}

public void setGrouped_products(List<Object> grouped_products) {
this.grouped_products = grouped_products;
}

public Integer getMenu_order() {
return menu_order;
}

public void setMenu_order(Integer menu_order) {
this.menu_order = menu_order;
}

public List<Object> getMeta_data() {
return meta_data;
}

public void setMeta_data(List<Object> meta_data) {
this.meta_data = meta_data;
}

public Links get_links() {
return _links;
}

public void set_links(Links _links) {
this._links = _links;
}

    public class Links implements Serializable{

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

    public class Self implements Serializable {

        private String href;

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

    }

    public class Image implements Serializable {

        private Integer id;
        private String date_created;
        private String date_created_gmt;
        private String date_modified;
        private String date_modified_gmt;
        private String src;
        private String name;
        private String alt;
        private Integer position;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getDate_created() {
            return date_created;
        }

        public void setDate_created(String date_created) {
            this.date_created = date_created;
        }

        public String getDate_created_gmt() {
            return date_created_gmt;
        }

        public void setDate_created_gmt(String date_created_gmt) {
            this.date_created_gmt = date_created_gmt;
        }

        public String getDate_modified() {
            return date_modified;
        }

        public void setDate_modified(String date_modified) {
            this.date_modified = date_modified;
        }

        public String getDate_modified_gmt() {
            return date_modified_gmt;
        }

        public void setDate_modified_gmt(String date_modified_gmt) {
            this.date_modified_gmt = date_modified_gmt;
        }

        public String getSrc() {
            return src;
        }

        public void setSrc(String src) {
            this.src = src;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public Integer getPosition() {
            return position;
        }

        public void setPosition(Integer position) {
            this.position = position;
        }

    }

    public class Attribute implements Serializable{

        private Integer id;
        private String name;
        private Integer position;
        private Boolean visible;
        private Boolean variation;
        private List<String> options = null;

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

        public Integer getPosition() {
            return position;
        }

        public void setPosition(Integer position) {
            this.position = position;
        }

        public Boolean getVisible() {
            return visible;
        }

        public void setVisible(Boolean visible) {
            this.visible = visible;
        }

        public Boolean getVariation() {
            return variation;
        }

        public void setVariation(Boolean variation) {
            this.variation = variation;
        }

        public List<String> getOptions() {
            return options;
        }

        public void setOptions(List<String> options) {
            this.options = options;
        }

    }


    public class Category implements Serializable {

        private Integer id;
        private String name;
        private String slug;

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

    }


    public class Collection implements Serializable{

        private String href;

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

    }


    public class Dimensions implements Serializable{

        private String length;
        private String width;
        private String height;

        public String getLength() {
            return length;
        }

        public void setLength(String length) {
            this.length = length;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

    }

}




