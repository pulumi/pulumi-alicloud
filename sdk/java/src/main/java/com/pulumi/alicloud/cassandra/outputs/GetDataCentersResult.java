// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cassandra.outputs;

import com.pulumi.alicloud.cassandra.outputs.GetDataCentersCenter;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDataCentersResult {
    /**
     * @return A list of Cassandra data centers. Its every element contains the following attributes:
     * 
     */
    private final List<GetDataCentersCenter> centers;
    /**
     * @return The ID of the Cassandra cluster.
     * 
     */
    private final String clusterId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return The list of Cassandra data center ids.
     * 
     */
    private final List<String> ids;
    private final @Nullable String nameRegex;
    /**
     * @return The name list of Cassandra data centers.
     * 
     */
    private final List<String> names;
    private final @Nullable String outputFile;

    @CustomType.Constructor
    private GetDataCentersResult(
        @CustomType.Parameter("centers") List<GetDataCentersCenter> centers,
        @CustomType.Parameter("clusterId") String clusterId,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("nameRegex") @Nullable String nameRegex,
        @CustomType.Parameter("names") List<String> names,
        @CustomType.Parameter("outputFile") @Nullable String outputFile) {
        this.centers = centers;
        this.clusterId = clusterId;
        this.id = id;
        this.ids = ids;
        this.nameRegex = nameRegex;
        this.names = names;
        this.outputFile = outputFile;
    }

    /**
     * @return A list of Cassandra data centers. Its every element contains the following attributes:
     * 
     */
    public List<GetDataCentersCenter> centers() {
        return this.centers;
    }
    /**
     * @return The ID of the Cassandra cluster.
     * 
     */
    public String clusterId() {
        return this.clusterId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The list of Cassandra data center ids.
     * 
     */
    public List<String> ids() {
        return this.ids;
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    /**
     * @return The name list of Cassandra data centers.
     * 
     */
    public List<String> names() {
        return this.names;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDataCentersResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetDataCentersCenter> centers;
        private String clusterId;
        private String id;
        private List<String> ids;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDataCentersResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.centers = defaults.centers;
    	      this.clusterId = defaults.clusterId;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
        }

        public Builder centers(List<GetDataCentersCenter> centers) {
            this.centers = Objects.requireNonNull(centers);
            return this;
        }
        public Builder centers(GetDataCentersCenter... centers) {
            return centers(List.of(centers));
        }
        public Builder clusterId(String clusterId) {
            this.clusterId = Objects.requireNonNull(clusterId);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder ids(List<String> ids) {
            this.ids = Objects.requireNonNull(ids);
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        public Builder nameRegex(@Nullable String nameRegex) {
            this.nameRegex = nameRegex;
            return this;
        }
        public Builder names(List<String> names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }        public GetDataCentersResult build() {
            return new GetDataCentersResult(centers, clusterId, id, ids, nameRegex, names, outputFile);
        }
    }
}