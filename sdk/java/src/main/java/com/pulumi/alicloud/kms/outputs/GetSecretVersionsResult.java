// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.kms.outputs;

import com.pulumi.alicloud.kms.outputs.GetSecretVersionsVersion;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSecretVersionsResult {
    private @Nullable Boolean enableDetails;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return A list of Kms Secret Version ids.
     * 
     */
    private List<String> ids;
    private @Nullable String includeDeprecated;
    private @Nullable String outputFile;
    /**
     * @return The name of the secret.
     * 
     */
    private String secretName;
    private @Nullable String versionStage;
    /**
     * @return A list of KMS Secret Versions. Each element contains the following attributes:
     * 
     */
    private List<GetSecretVersionsVersion> versions;

    private GetSecretVersionsResult() {}
    public Optional<Boolean> enableDetails() {
        return Optional.ofNullable(this.enableDetails);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of Kms Secret Version ids.
     * 
     */
    public List<String> ids() {
        return this.ids;
    }
    public Optional<String> includeDeprecated() {
        return Optional.ofNullable(this.includeDeprecated);
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    /**
     * @return The name of the secret.
     * 
     */
    public String secretName() {
        return this.secretName;
    }
    public Optional<String> versionStage() {
        return Optional.ofNullable(this.versionStage);
    }
    /**
     * @return A list of KMS Secret Versions. Each element contains the following attributes:
     * 
     */
    public List<GetSecretVersionsVersion> versions() {
        return this.versions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecretVersionsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enableDetails;
        private String id;
        private List<String> ids;
        private @Nullable String includeDeprecated;
        private @Nullable String outputFile;
        private String secretName;
        private @Nullable String versionStage;
        private List<GetSecretVersionsVersion> versions;
        public Builder() {}
        public Builder(GetSecretVersionsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableDetails = defaults.enableDetails;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.includeDeprecated = defaults.includeDeprecated;
    	      this.outputFile = defaults.outputFile;
    	      this.secretName = defaults.secretName;
    	      this.versionStage = defaults.versionStage;
    	      this.versions = defaults.versions;
        }

        @CustomType.Setter
        public Builder enableDetails(@Nullable Boolean enableDetails) {

            this.enableDetails = enableDetails;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetSecretVersionsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            if (ids == null) {
              throw new MissingRequiredPropertyException("GetSecretVersionsResult", "ids");
            }
            this.ids = ids;
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder includeDeprecated(@Nullable String includeDeprecated) {

            this.includeDeprecated = includeDeprecated;
            return this;
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {

            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder secretName(String secretName) {
            if (secretName == null) {
              throw new MissingRequiredPropertyException("GetSecretVersionsResult", "secretName");
            }
            this.secretName = secretName;
            return this;
        }
        @CustomType.Setter
        public Builder versionStage(@Nullable String versionStage) {

            this.versionStage = versionStage;
            return this;
        }
        @CustomType.Setter
        public Builder versions(List<GetSecretVersionsVersion> versions) {
            if (versions == null) {
              throw new MissingRequiredPropertyException("GetSecretVersionsResult", "versions");
            }
            this.versions = versions;
            return this;
        }
        public Builder versions(GetSecretVersionsVersion... versions) {
            return versions(List.of(versions));
        }
        public GetSecretVersionsResult build() {
            final var _resultValue = new GetSecretVersionsResult();
            _resultValue.enableDetails = enableDetails;
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.includeDeprecated = includeDeprecated;
            _resultValue.outputFile = outputFile;
            _resultValue.secretName = secretName;
            _resultValue.versionStage = versionStage;
            _resultValue.versions = versions;
            return _resultValue;
        }
    }
}