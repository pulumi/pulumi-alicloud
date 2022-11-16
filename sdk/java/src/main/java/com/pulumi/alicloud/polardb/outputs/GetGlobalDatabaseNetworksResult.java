// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.polardb.outputs;

import com.pulumi.alicloud.polardb.outputs.GetGlobalDatabaseNetworksNetwork;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetGlobalDatabaseNetworksResult {
    private final @Nullable String dbClusterId;
    private final @Nullable String description;
    private final @Nullable String gdnId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final List<String> ids;
    private final List<GetGlobalDatabaseNetworksNetwork> networks;
    private final @Nullable String outputFile;
    private final @Nullable Integer pageNumber;
    private final @Nullable Integer pageSize;
    private final @Nullable String status;

    @CustomType.Constructor
    private GetGlobalDatabaseNetworksResult(
        @CustomType.Parameter("dbClusterId") @Nullable String dbClusterId,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("gdnId") @Nullable String gdnId,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("networks") List<GetGlobalDatabaseNetworksNetwork> networks,
        @CustomType.Parameter("outputFile") @Nullable String outputFile,
        @CustomType.Parameter("pageNumber") @Nullable Integer pageNumber,
        @CustomType.Parameter("pageSize") @Nullable Integer pageSize,
        @CustomType.Parameter("status") @Nullable String status) {
        this.dbClusterId = dbClusterId;
        this.description = description;
        this.gdnId = gdnId;
        this.id = id;
        this.ids = ids;
        this.networks = networks;
        this.outputFile = outputFile;
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.status = status;
    }

    public Optional<String> dbClusterId() {
        return Optional.ofNullable(this.dbClusterId);
    }
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    public Optional<String> gdnId() {
        return Optional.ofNullable(this.gdnId);
    }
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
    public List<GetGlobalDatabaseNetworksNetwork> networks() {
        return this.networks;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public Optional<Integer> pageNumber() {
        return Optional.ofNullable(this.pageNumber);
    }
    public Optional<Integer> pageSize() {
        return Optional.ofNullable(this.pageSize);
    }
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGlobalDatabaseNetworksResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String dbClusterId;
        private @Nullable String description;
        private @Nullable String gdnId;
        private String id;
        private List<String> ids;
        private List<GetGlobalDatabaseNetworksNetwork> networks;
        private @Nullable String outputFile;
        private @Nullable Integer pageNumber;
        private @Nullable Integer pageSize;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGlobalDatabaseNetworksResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dbClusterId = defaults.dbClusterId;
    	      this.description = defaults.description;
    	      this.gdnId = defaults.gdnId;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.networks = defaults.networks;
    	      this.outputFile = defaults.outputFile;
    	      this.pageNumber = defaults.pageNumber;
    	      this.pageSize = defaults.pageSize;
    	      this.status = defaults.status;
        }

        public Builder dbClusterId(@Nullable String dbClusterId) {
            this.dbClusterId = dbClusterId;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder gdnId(@Nullable String gdnId) {
            this.gdnId = gdnId;
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
        public Builder networks(List<GetGlobalDatabaseNetworksNetwork> networks) {
            this.networks = Objects.requireNonNull(networks);
            return this;
        }
        public Builder networks(GetGlobalDatabaseNetworksNetwork... networks) {
            return networks(List.of(networks));
        }
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public Builder pageNumber(@Nullable Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Builder pageSize(@Nullable Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }        public GetGlobalDatabaseNetworksResult build() {
            return new GetGlobalDatabaseNetworksResult(dbClusterId, description, gdnId, id, ids, networks, outputFile, pageNumber, pageSize, status);
        }
    }
}