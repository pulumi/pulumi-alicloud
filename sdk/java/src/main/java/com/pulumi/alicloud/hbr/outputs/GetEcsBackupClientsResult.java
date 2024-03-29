// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.hbr.outputs;

import com.pulumi.alicloud.hbr.outputs.GetEcsBackupClientsClient;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetEcsBackupClientsResult {
    private List<GetEcsBackupClientsClient> clients;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    private @Nullable List<String> instanceIds;
    private @Nullable String outputFile;
    private @Nullable String status;

    private GetEcsBackupClientsResult() {}
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
    @CustomType.Builder
    public static final class Builder {
        private List<GetEcsBackupClientsClient> clients;
        private String id;
        private List<String> ids;
        private @Nullable List<String> instanceIds;
        private @Nullable String outputFile;
        private @Nullable String status;
        public Builder() {}
        public Builder(GetEcsBackupClientsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clients = defaults.clients;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.instanceIds = defaults.instanceIds;
    	      this.outputFile = defaults.outputFile;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder clients(List<GetEcsBackupClientsClient> clients) {
            if (clients == null) {
              throw new MissingRequiredPropertyException("GetEcsBackupClientsResult", "clients");
            }
            this.clients = clients;
            return this;
        }
        public Builder clients(GetEcsBackupClientsClient... clients) {
            return clients(List.of(clients));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetEcsBackupClientsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            if (ids == null) {
              throw new MissingRequiredPropertyException("GetEcsBackupClientsResult", "ids");
            }
            this.ids = ids;
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder instanceIds(@Nullable List<String> instanceIds) {

            this.instanceIds = instanceIds;
            return this;
        }
        public Builder instanceIds(String... instanceIds) {
            return instanceIds(List.of(instanceIds));
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {

            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {

            this.status = status;
            return this;
        }
        public GetEcsBackupClientsResult build() {
            final var _resultValue = new GetEcsBackupClientsResult();
            _resultValue.clients = clients;
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.instanceIds = instanceIds;
            _resultValue.outputFile = outputFile;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}
