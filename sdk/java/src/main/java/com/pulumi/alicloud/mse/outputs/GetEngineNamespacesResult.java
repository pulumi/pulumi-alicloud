// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.mse.outputs;

import com.pulumi.alicloud.mse.outputs.GetEngineNamespacesNamespace;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetEngineNamespacesResult {
    private @Nullable String acceptLanguage;
    private @Nullable String clusterId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    private @Nullable String instanceId;
    /**
     * @return A list of Mse Engine Namespaces. Each element contains the following attributes:
     * 
     */
    private List<GetEngineNamespacesNamespace> namespaces;
    private @Nullable String outputFile;

    private GetEngineNamespacesResult() {}
    public Optional<String> acceptLanguage() {
        return Optional.ofNullable(this.acceptLanguage);
    }
    public Optional<String> clusterId() {
        return Optional.ofNullable(this.clusterId);
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
    public Optional<String> instanceId() {
        return Optional.ofNullable(this.instanceId);
    }
    /**
     * @return A list of Mse Engine Namespaces. Each element contains the following attributes:
     * 
     */
    public List<GetEngineNamespacesNamespace> namespaces() {
        return this.namespaces;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEngineNamespacesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String acceptLanguage;
        private @Nullable String clusterId;
        private String id;
        private List<String> ids;
        private @Nullable String instanceId;
        private List<GetEngineNamespacesNamespace> namespaces;
        private @Nullable String outputFile;
        public Builder() {}
        public Builder(GetEngineNamespacesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceptLanguage = defaults.acceptLanguage;
    	      this.clusterId = defaults.clusterId;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.instanceId = defaults.instanceId;
    	      this.namespaces = defaults.namespaces;
    	      this.outputFile = defaults.outputFile;
        }

        @CustomType.Setter
        public Builder acceptLanguage(@Nullable String acceptLanguage) {

            this.acceptLanguage = acceptLanguage;
            return this;
        }
        @CustomType.Setter
        public Builder clusterId(@Nullable String clusterId) {

            this.clusterId = clusterId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetEngineNamespacesResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            if (ids == null) {
              throw new MissingRequiredPropertyException("GetEngineNamespacesResult", "ids");
            }
            this.ids = ids;
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder instanceId(@Nullable String instanceId) {

            this.instanceId = instanceId;
            return this;
        }
        @CustomType.Setter
        public Builder namespaces(List<GetEngineNamespacesNamespace> namespaces) {
            if (namespaces == null) {
              throw new MissingRequiredPropertyException("GetEngineNamespacesResult", "namespaces");
            }
            this.namespaces = namespaces;
            return this;
        }
        public Builder namespaces(GetEngineNamespacesNamespace... namespaces) {
            return namespaces(List.of(namespaces));
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {

            this.outputFile = outputFile;
            return this;
        }
        public GetEngineNamespacesResult build() {
            final var _resultValue = new GetEngineNamespacesResult();
            _resultValue.acceptLanguage = acceptLanguage;
            _resultValue.clusterId = clusterId;
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.instanceId = instanceId;
            _resultValue.namespaces = namespaces;
            _resultValue.outputFile = outputFile;
            return _resultValue;
        }
    }
}
