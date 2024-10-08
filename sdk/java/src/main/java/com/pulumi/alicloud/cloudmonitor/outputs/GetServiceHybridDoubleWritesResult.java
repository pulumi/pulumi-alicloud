// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cloudmonitor.outputs;

import com.pulumi.alicloud.cloudmonitor.outputs.GetServiceHybridDoubleWritesHybridDoubleWrite;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetServiceHybridDoubleWritesResult {
    /**
     * @return A list of Hybrid Double Writes. Each element contains the following attributes:
     * 
     */
    private List<GetServiceHybridDoubleWritesHybridDoubleWrite> hybridDoubleWrites;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    /**
     * @return Target Namespace.
     * 
     */
    private @Nullable String namespace;
    private @Nullable String outputFile;
    /**
     * @return Source Namespace.
     * 
     */
    private @Nullable String sourceNamespace;
    /**
     * @return Source UserId.
     * 
     */
    private @Nullable String sourceUserId;
    /**
     * @return Target UserId.
     * 
     */
    private @Nullable String userId;

    private GetServiceHybridDoubleWritesResult() {}
    /**
     * @return A list of Hybrid Double Writes. Each element contains the following attributes:
     * 
     */
    public List<GetServiceHybridDoubleWritesHybridDoubleWrite> hybridDoubleWrites() {
        return this.hybridDoubleWrites;
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
    /**
     * @return Target Namespace.
     * 
     */
    public Optional<String> namespace() {
        return Optional.ofNullable(this.namespace);
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    /**
     * @return Source Namespace.
     * 
     */
    public Optional<String> sourceNamespace() {
        return Optional.ofNullable(this.sourceNamespace);
    }
    /**
     * @return Source UserId.
     * 
     */
    public Optional<String> sourceUserId() {
        return Optional.ofNullable(this.sourceUserId);
    }
    /**
     * @return Target UserId.
     * 
     */
    public Optional<String> userId() {
        return Optional.ofNullable(this.userId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceHybridDoubleWritesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetServiceHybridDoubleWritesHybridDoubleWrite> hybridDoubleWrites;
        private String id;
        private List<String> ids;
        private @Nullable String namespace;
        private @Nullable String outputFile;
        private @Nullable String sourceNamespace;
        private @Nullable String sourceUserId;
        private @Nullable String userId;
        public Builder() {}
        public Builder(GetServiceHybridDoubleWritesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hybridDoubleWrites = defaults.hybridDoubleWrites;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.namespace = defaults.namespace;
    	      this.outputFile = defaults.outputFile;
    	      this.sourceNamespace = defaults.sourceNamespace;
    	      this.sourceUserId = defaults.sourceUserId;
    	      this.userId = defaults.userId;
        }

        @CustomType.Setter
        public Builder hybridDoubleWrites(List<GetServiceHybridDoubleWritesHybridDoubleWrite> hybridDoubleWrites) {
            if (hybridDoubleWrites == null) {
              throw new MissingRequiredPropertyException("GetServiceHybridDoubleWritesResult", "hybridDoubleWrites");
            }
            this.hybridDoubleWrites = hybridDoubleWrites;
            return this;
        }
        public Builder hybridDoubleWrites(GetServiceHybridDoubleWritesHybridDoubleWrite... hybridDoubleWrites) {
            return hybridDoubleWrites(List.of(hybridDoubleWrites));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetServiceHybridDoubleWritesResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            if (ids == null) {
              throw new MissingRequiredPropertyException("GetServiceHybridDoubleWritesResult", "ids");
            }
            this.ids = ids;
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder namespace(@Nullable String namespace) {

            this.namespace = namespace;
            return this;
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {

            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder sourceNamespace(@Nullable String sourceNamespace) {

            this.sourceNamespace = sourceNamespace;
            return this;
        }
        @CustomType.Setter
        public Builder sourceUserId(@Nullable String sourceUserId) {

            this.sourceUserId = sourceUserId;
            return this;
        }
        @CustomType.Setter
        public Builder userId(@Nullable String userId) {

            this.userId = userId;
            return this;
        }
        public GetServiceHybridDoubleWritesResult build() {
            final var _resultValue = new GetServiceHybridDoubleWritesResult();
            _resultValue.hybridDoubleWrites = hybridDoubleWrites;
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.namespace = namespace;
            _resultValue.outputFile = outputFile;
            _resultValue.sourceNamespace = sourceNamespace;
            _resultValue.sourceUserId = sourceUserId;
            _resultValue.userId = userId;
            return _resultValue;
        }
    }
}
