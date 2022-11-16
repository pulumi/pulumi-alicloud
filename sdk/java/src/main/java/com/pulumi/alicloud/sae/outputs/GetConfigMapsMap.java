// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.sae.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetConfigMapsMap {
    /**
     * @return The first ID of the resource.
     * 
     */
    private final String configMapId;
    /**
     * @return The Creation Time of the ConfigMap.
     * 
     */
    private final String createTime;
    /**
     * @return ConfigMap instance data. The value&#39;s format is a `json` string
     * 
     */
    private final String data;
    /**
     * @return The Description of Config Map.
     * 
     */
    private final String description;
    /**
     * @return The ID of the Config Map.
     * 
     */
    private final String id;
    /**
     * @return ConfigMap instance name.
     * 
     */
    private final String name;
    /**
     * @return The NamespaceId of Config Maps.
     * 
     */
    private final String namespaceId;

    @CustomType.Constructor
    private GetConfigMapsMap(
        @CustomType.Parameter("configMapId") String configMapId,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("data") String data,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("namespaceId") String namespaceId) {
        this.configMapId = configMapId;
        this.createTime = createTime;
        this.data = data;
        this.description = description;
        this.id = id;
        this.name = name;
        this.namespaceId = namespaceId;
    }

    /**
     * @return The first ID of the resource.
     * 
     */
    public String configMapId() {
        return this.configMapId;
    }
    /**
     * @return The Creation Time of the ConfigMap.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return ConfigMap instance data. The value&#39;s format is a `json` string
     * 
     */
    public String data() {
        return this.data;
    }
    /**
     * @return The Description of Config Map.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The ID of the Config Map.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return ConfigMap instance name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The NamespaceId of Config Maps.
     * 
     */
    public String namespaceId() {
        return this.namespaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConfigMapsMap defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String configMapId;
        private String createTime;
        private String data;
        private String description;
        private String id;
        private String name;
        private String namespaceId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConfigMapsMap defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configMapId = defaults.configMapId;
    	      this.createTime = defaults.createTime;
    	      this.data = defaults.data;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.namespaceId = defaults.namespaceId;
        }

        public Builder configMapId(String configMapId) {
            this.configMapId = Objects.requireNonNull(configMapId);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder data(String data) {
            this.data = Objects.requireNonNull(data);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder namespaceId(String namespaceId) {
            this.namespaceId = Objects.requireNonNull(namespaceId);
            return this;
        }        public GetConfigMapsMap build() {
            return new GetConfigMapsMap(configMapId, createTime, data, description, id, name, namespaceId);
        }
    }
}