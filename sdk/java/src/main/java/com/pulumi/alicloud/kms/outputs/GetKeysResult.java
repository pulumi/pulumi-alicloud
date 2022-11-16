// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.kms.outputs;

import com.pulumi.alicloud.kms.outputs.GetKeysKey;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetKeysResult {
    private final @Nullable String descriptionRegex;
    private final @Nullable Boolean enableDetails;
    private final @Nullable String filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return A list of KMS key IDs.
     * 
     */
    private final List<String> ids;
    /**
     * @return A list of KMS keys. Each element contains the following attributes:
     * 
     */
    private final List<GetKeysKey> keys;
    private final @Nullable String outputFile;
    /**
     * @return Status of the key. Possible values: `Enabled`, `Disabled` and `PendingDeletion`.
     * 
     */
    private final @Nullable String status;

    @CustomType.Constructor
    private GetKeysResult(
        @CustomType.Parameter("descriptionRegex") @Nullable String descriptionRegex,
        @CustomType.Parameter("enableDetails") @Nullable Boolean enableDetails,
        @CustomType.Parameter("filters") @Nullable String filters,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("keys") List<GetKeysKey> keys,
        @CustomType.Parameter("outputFile") @Nullable String outputFile,
        @CustomType.Parameter("status") @Nullable String status) {
        this.descriptionRegex = descriptionRegex;
        this.enableDetails = enableDetails;
        this.filters = filters;
        this.id = id;
        this.ids = ids;
        this.keys = keys;
        this.outputFile = outputFile;
        this.status = status;
    }

    public Optional<String> descriptionRegex() {
        return Optional.ofNullable(this.descriptionRegex);
    }
    public Optional<Boolean> enableDetails() {
        return Optional.ofNullable(this.enableDetails);
    }
    public Optional<String> filters() {
        return Optional.ofNullable(this.filters);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of KMS key IDs.
     * 
     */
    public List<String> ids() {
        return this.ids;
    }
    /**
     * @return A list of KMS keys. Each element contains the following attributes:
     * 
     */
    public List<GetKeysKey> keys() {
        return this.keys;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    /**
     * @return Status of the key. Possible values: `Enabled`, `Disabled` and `PendingDeletion`.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKeysResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String descriptionRegex;
        private @Nullable Boolean enableDetails;
        private @Nullable String filters;
        private String id;
        private List<String> ids;
        private List<GetKeysKey> keys;
        private @Nullable String outputFile;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetKeysResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.descriptionRegex = defaults.descriptionRegex;
    	      this.enableDetails = defaults.enableDetails;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.keys = defaults.keys;
    	      this.outputFile = defaults.outputFile;
    	      this.status = defaults.status;
        }

        public Builder descriptionRegex(@Nullable String descriptionRegex) {
            this.descriptionRegex = descriptionRegex;
            return this;
        }
        public Builder enableDetails(@Nullable Boolean enableDetails) {
            this.enableDetails = enableDetails;
            return this;
        }
        public Builder filters(@Nullable String filters) {
            this.filters = filters;
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
        public Builder keys(List<GetKeysKey> keys) {
            this.keys = Objects.requireNonNull(keys);
            return this;
        }
        public Builder keys(GetKeysKey... keys) {
            return keys(List.of(keys));
        }
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }        public GetKeysResult build() {
            return new GetKeysResult(descriptionRegex, enableDetails, filters, id, ids, keys, outputFile, status);
        }
    }
}