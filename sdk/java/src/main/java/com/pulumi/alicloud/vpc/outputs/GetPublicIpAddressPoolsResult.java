// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.outputs;

import com.pulumi.alicloud.vpc.outputs.GetPublicIpAddressPoolsPool;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPublicIpAddressPoolsResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    private @Nullable String isp;
    private @Nullable String nameRegex;
    private List<String> names;
    private @Nullable String outputFile;
    private List<GetPublicIpAddressPoolsPool> pools;
    private @Nullable List<String> publicIpAddressPoolIds;
    private @Nullable String publicIpAddressPoolName;
    private @Nullable String status;

    private GetPublicIpAddressPoolsResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<String> ids() {
        return this.ids;
    }
    public Optional<String> isp() {
        return Optional.ofNullable(this.isp);
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    public List<String> names() {
        return this.names;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public List<GetPublicIpAddressPoolsPool> pools() {
        return this.pools;
    }
    public List<String> publicIpAddressPoolIds() {
        return this.publicIpAddressPoolIds == null ? List.of() : this.publicIpAddressPoolIds;
    }
    public Optional<String> publicIpAddressPoolName() {
        return Optional.ofNullable(this.publicIpAddressPoolName);
    }
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPublicIpAddressPoolsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<String> ids;
        private @Nullable String isp;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        private List<GetPublicIpAddressPoolsPool> pools;
        private @Nullable List<String> publicIpAddressPoolIds;
        private @Nullable String publicIpAddressPoolName;
        private @Nullable String status;
        public Builder() {}
        public Builder(GetPublicIpAddressPoolsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.isp = defaults.isp;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
    	      this.pools = defaults.pools;
    	      this.publicIpAddressPoolIds = defaults.publicIpAddressPoolIds;
    	      this.publicIpAddressPoolName = defaults.publicIpAddressPoolName;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            this.ids = Objects.requireNonNull(ids);
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder isp(@Nullable String isp) {
            this.isp = isp;
            return this;
        }
        @CustomType.Setter
        public Builder nameRegex(@Nullable String nameRegex) {
            this.nameRegex = nameRegex;
            return this;
        }
        @CustomType.Setter
        public Builder names(List<String> names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder pools(List<GetPublicIpAddressPoolsPool> pools) {
            this.pools = Objects.requireNonNull(pools);
            return this;
        }
        public Builder pools(GetPublicIpAddressPoolsPool... pools) {
            return pools(List.of(pools));
        }
        @CustomType.Setter
        public Builder publicIpAddressPoolIds(@Nullable List<String> publicIpAddressPoolIds) {
            this.publicIpAddressPoolIds = publicIpAddressPoolIds;
            return this;
        }
        public Builder publicIpAddressPoolIds(String... publicIpAddressPoolIds) {
            return publicIpAddressPoolIds(List.of(publicIpAddressPoolIds));
        }
        @CustomType.Setter
        public Builder publicIpAddressPoolName(@Nullable String publicIpAddressPoolName) {
            this.publicIpAddressPoolName = publicIpAddressPoolName;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        public GetPublicIpAddressPoolsResult build() {
            final var o = new GetPublicIpAddressPoolsResult();
            o.id = id;
            o.ids = ids;
            o.isp = isp;
            o.nameRegex = nameRegex;
            o.names = names;
            o.outputFile = outputFile;
            o.pools = pools;
            o.publicIpAddressPoolIds = publicIpAddressPoolIds;
            o.publicIpAddressPoolName = publicIpAddressPoolName;
            o.status = status;
            return o;
        }
    }
}