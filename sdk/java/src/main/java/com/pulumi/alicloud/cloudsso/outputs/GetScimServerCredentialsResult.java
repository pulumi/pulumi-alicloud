// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cloudsso.outputs;

import com.pulumi.alicloud.cloudsso.outputs.GetScimServerCredentialsCredential;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetScimServerCredentialsResult {
    private List<GetScimServerCredentialsCredential> credentials;
    private String directoryId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    private @Nullable String outputFile;
    private @Nullable String status;

    private GetScimServerCredentialsResult() {}
    public List<GetScimServerCredentialsCredential> credentials() {
        return this.credentials;
    }
    public String directoryId() {
        return this.directoryId;
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
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetScimServerCredentialsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetScimServerCredentialsCredential> credentials;
        private String directoryId;
        private String id;
        private List<String> ids;
        private @Nullable String outputFile;
        private @Nullable String status;
        public Builder() {}
        public Builder(GetScimServerCredentialsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.credentials = defaults.credentials;
    	      this.directoryId = defaults.directoryId;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.outputFile = defaults.outputFile;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder credentials(List<GetScimServerCredentialsCredential> credentials) {
            if (credentials == null) {
              throw new MissingRequiredPropertyException("GetScimServerCredentialsResult", "credentials");
            }
            this.credentials = credentials;
            return this;
        }
        public Builder credentials(GetScimServerCredentialsCredential... credentials) {
            return credentials(List.of(credentials));
        }
        @CustomType.Setter
        public Builder directoryId(String directoryId) {
            if (directoryId == null) {
              throw new MissingRequiredPropertyException("GetScimServerCredentialsResult", "directoryId");
            }
            this.directoryId = directoryId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetScimServerCredentialsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            if (ids == null) {
              throw new MissingRequiredPropertyException("GetScimServerCredentialsResult", "ids");
            }
            this.ids = ids;
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
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
        public GetScimServerCredentialsResult build() {
            final var _resultValue = new GetScimServerCredentialsResult();
            _resultValue.credentials = credentials;
            _resultValue.directoryId = directoryId;
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.outputFile = outputFile;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}