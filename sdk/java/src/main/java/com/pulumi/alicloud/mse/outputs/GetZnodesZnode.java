// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.mse.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetZnodesZnode {
    /**
     * @return The ID of the Cluster.
     * 
     */
    private String clusterId;
    /**
     * @return The Node data.
     * 
     */
    private String data;
    /**
     * @return Node list information, the value is as follows:
     * 
     */
    private Boolean dir;
    /**
     * @return The ID of the Znode. The value formats as `&lt;cluster_id&gt;:&lt;path&gt;`.
     * 
     */
    private String id;
    /**
     * @return The Node path.
     * 
     */
    private String path;
    /**
     * @return The Node name.
     * 
     */
    private String znodeName;

    private GetZnodesZnode() {}
    /**
     * @return The ID of the Cluster.
     * 
     */
    public String clusterId() {
        return this.clusterId;
    }
    /**
     * @return The Node data.
     * 
     */
    public String data() {
        return this.data;
    }
    /**
     * @return Node list information, the value is as follows:
     * 
     */
    public Boolean dir() {
        return this.dir;
    }
    /**
     * @return The ID of the Znode. The value formats as `&lt;cluster_id&gt;:&lt;path&gt;`.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Node path.
     * 
     */
    public String path() {
        return this.path;
    }
    /**
     * @return The Node name.
     * 
     */
    public String znodeName() {
        return this.znodeName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetZnodesZnode defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String clusterId;
        private String data;
        private Boolean dir;
        private String id;
        private String path;
        private String znodeName;
        public Builder() {}
        public Builder(GetZnodesZnode defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterId = defaults.clusterId;
    	      this.data = defaults.data;
    	      this.dir = defaults.dir;
    	      this.id = defaults.id;
    	      this.path = defaults.path;
    	      this.znodeName = defaults.znodeName;
        }

        @CustomType.Setter
        public Builder clusterId(String clusterId) {
            if (clusterId == null) {
              throw new MissingRequiredPropertyException("GetZnodesZnode", "clusterId");
            }
            this.clusterId = clusterId;
            return this;
        }
        @CustomType.Setter
        public Builder data(String data) {
            if (data == null) {
              throw new MissingRequiredPropertyException("GetZnodesZnode", "data");
            }
            this.data = data;
            return this;
        }
        @CustomType.Setter
        public Builder dir(Boolean dir) {
            if (dir == null) {
              throw new MissingRequiredPropertyException("GetZnodesZnode", "dir");
            }
            this.dir = dir;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetZnodesZnode", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder path(String path) {
            if (path == null) {
              throw new MissingRequiredPropertyException("GetZnodesZnode", "path");
            }
            this.path = path;
            return this;
        }
        @CustomType.Setter
        public Builder znodeName(String znodeName) {
            if (znodeName == null) {
              throw new MissingRequiredPropertyException("GetZnodesZnode", "znodeName");
            }
            this.znodeName = znodeName;
            return this;
        }
        public GetZnodesZnode build() {
            final var _resultValue = new GetZnodesZnode();
            _resultValue.clusterId = clusterId;
            _resultValue.data = data;
            _resultValue.dir = dir;
            _resultValue.id = id;
            _resultValue.path = path;
            _resultValue.znodeName = znodeName;
            return _resultValue;
        }
    }
}
