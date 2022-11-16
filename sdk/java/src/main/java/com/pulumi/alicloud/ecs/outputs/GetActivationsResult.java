// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.outputs;

import com.pulumi.alicloud.ecs.outputs.GetActivationsActivation;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetActivationsResult {
    private final List<GetActivationsActivation> activations;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final List<String> ids;
    private final @Nullable String instanceName;
    private final @Nullable String outputFile;
    private final @Nullable Integer pageNumber;
    private final @Nullable Integer pageSize;
    private final Integer totalCount;

    @CustomType.Constructor
    private GetActivationsResult(
        @CustomType.Parameter("activations") List<GetActivationsActivation> activations,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("instanceName") @Nullable String instanceName,
        @CustomType.Parameter("outputFile") @Nullable String outputFile,
        @CustomType.Parameter("pageNumber") @Nullable Integer pageNumber,
        @CustomType.Parameter("pageSize") @Nullable Integer pageSize,
        @CustomType.Parameter("totalCount") Integer totalCount) {
        this.activations = activations;
        this.id = id;
        this.ids = ids;
        this.instanceName = instanceName;
        this.outputFile = outputFile;
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.totalCount = totalCount;
    }

    public List<GetActivationsActivation> activations() {
        return this.activations;
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
    public Optional<String> instanceName() {
        return Optional.ofNullable(this.instanceName);
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
    public Integer totalCount() {
        return this.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetActivationsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetActivationsActivation> activations;
        private String id;
        private List<String> ids;
        private @Nullable String instanceName;
        private @Nullable String outputFile;
        private @Nullable Integer pageNumber;
        private @Nullable Integer pageSize;
        private Integer totalCount;

        public Builder() {
    	      // Empty
        }

        public Builder(GetActivationsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activations = defaults.activations;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.instanceName = defaults.instanceName;
    	      this.outputFile = defaults.outputFile;
    	      this.pageNumber = defaults.pageNumber;
    	      this.pageSize = defaults.pageSize;
    	      this.totalCount = defaults.totalCount;
        }

        public Builder activations(List<GetActivationsActivation> activations) {
            this.activations = Objects.requireNonNull(activations);
            return this;
        }
        public Builder activations(GetActivationsActivation... activations) {
            return activations(List.of(activations));
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
        public Builder instanceName(@Nullable String instanceName) {
            this.instanceName = instanceName;
            return this;
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
        public Builder totalCount(Integer totalCount) {
            this.totalCount = Objects.requireNonNull(totalCount);
            return this;
        }        public GetActivationsResult build() {
            return new GetActivationsResult(activations, id, ids, instanceName, outputFile, pageNumber, pageSize, totalCount);
        }
    }
}