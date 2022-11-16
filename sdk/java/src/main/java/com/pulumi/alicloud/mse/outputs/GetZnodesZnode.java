// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.mse.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetZnodesZnode {
    /**
     * @return The ID of the Cluster.
     * 
     */
    private final String clusterId;
    /**
     * @return The Node data.
     * 
     */
    private final String data;
    /**
     * @return Node list information, the value is as follows:
     * 
     */
    private final Boolean dir;
    /**
     * @return The ID of the Znode. The value formats as `&lt;cluster_id&gt;:&lt;path&gt;`.
     * 
     */
    private final String id;
    /**
     * @return The Node path.
     * 
     */
    private final String path;
    /**
     * @return The Node name.
     * 
     */
    private final String znodeName;

    @CustomType.Constructor
    private GetZnodesZnode(
        @CustomType.Parameter("clusterId") String clusterId,
        @CustomType.Parameter("data") String data,
        @CustomType.Parameter("dir") Boolean dir,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("path") String path,
        @CustomType.Parameter("znodeName") String znodeName) {
        this.clusterId = clusterId;
        this.data = data;
        this.dir = dir;
        this.id = id;
        this.path = path;
        this.znodeName = znodeName;
    }

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

    public static final class Builder {
        private String clusterId;
        private String data;
        private Boolean dir;
        private String id;
        private String path;
        private String znodeName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetZnodesZnode defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterId = defaults.clusterId;
    	      this.data = defaults.data;
    	      this.dir = defaults.dir;
    	      this.id = defaults.id;
    	      this.path = defaults.path;
    	      this.znodeName = defaults.znodeName;
        }

        public Builder clusterId(String clusterId) {
            this.clusterId = Objects.requireNonNull(clusterId);
            return this;
        }
        public Builder data(String data) {
            this.data = Objects.requireNonNull(data);
            return this;
        }
        public Builder dir(Boolean dir) {
            this.dir = Objects.requireNonNull(dir);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public Builder znodeName(String znodeName) {
            this.znodeName = Objects.requireNonNull(znodeName);
            return this;
        }        public GetZnodesZnode build() {
            return new GetZnodesZnode(clusterId, data, dir, id, path, znodeName);
        }
    }
}