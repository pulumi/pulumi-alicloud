// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.hbr.outputs;

import com.pulumi.alicloud.hbr.outputs.GetEcsBackupClientsClient;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetEcsBackupClientsResult {
    private final List<GetEcsBackupClientsClient> clients;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final List<String> ids;
    private final @Nullable List<String> instanceIds;
    private final @Nullable String outputFile;
    private final @Nullable String status;

    @CustomType.Constructor
    private GetEcsBackupClientsResult(
        @CustomType.Parameter("clients") List<GetEcsBackupClientsClient> clients,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("instanceIds") @Nullable List<String> instanceIds,
        @CustomType.Parameter("outputFile") @Nullable String outputFile,
        @CustomType.Parameter("status") @Nullable String status) {
        this.clients = clients;
        this.id = id;
        this.ids = ids;
        this.instanceIds = instanceIds;
        this.outputFile = outputFile;
        this.status = status;
    }

    public List<GetEcsBackupClientsClient> clients() {
        return this.clients;
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
    public List<String> instanceIds() {
        return this.instanceIds == null ? List.of() : this.instanceIds;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEcsBackupClientsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetEcsBackupClientsClient> clients;
        private String id;
        private List<String> ids;
        private @Nullable List<String> instanceIds;
        private @Nullable String outputFile;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEcsBackupClientsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clients = defaults.clients;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.instanceIds = defaults.instanceIds;
    	      this.outputFile = defaults.outputFile;
    	      this.status = defaults.status;
        }

        public Builder clients(List<GetEcsBackupClientsClient> clients) {
            this.clients = Objects.requireNonNull(clients);
            return this;
        }
        public Builder clients(GetEcsBackupClientsClient... clients) {
            return clients(List.of(clients));
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
        public Builder instanceIds(@Nullable List<String> instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }
        public Builder instanceIds(String... instanceIds) {
            return instanceIds(List.of(instanceIds));
        }
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }        public GetEcsBackupClientsResult build() {
            return new GetEcsBackupClientsResult(clients, id, ids, instanceIds, outputFile, status);
        }
    }
}