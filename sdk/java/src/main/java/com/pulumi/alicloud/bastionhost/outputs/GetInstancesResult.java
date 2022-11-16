// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.bastionhost.outputs;

import com.pulumi.alicloud.bastionhost.outputs.GetInstancesInstance;
import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetInstancesResult {
    private final @Nullable String descriptionRegex;
    private final List<String> descriptions;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final List<String> ids;
    /**
     * @return A list of apis. Each element contains the following attributes:
     * 
     */
    private final List<GetInstancesInstance> instances;
    private final @Nullable String outputFile;
    /**
     * @return A map of tags assigned to the bastionhost instance.
     * 
     */
    private final @Nullable Map<String,Object> tags;

    @CustomType.Constructor
    private GetInstancesResult(
        @CustomType.Parameter("descriptionRegex") @Nullable String descriptionRegex,
        @CustomType.Parameter("descriptions") List<String> descriptions,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("instances") List<GetInstancesInstance> instances,
        @CustomType.Parameter("outputFile") @Nullable String outputFile,
        @CustomType.Parameter("tags") @Nullable Map<String,Object> tags) {
        this.descriptionRegex = descriptionRegex;
        this.descriptions = descriptions;
        this.id = id;
        this.ids = ids;
        this.instances = instances;
        this.outputFile = outputFile;
        this.tags = tags;
    }

    public Optional<String> descriptionRegex() {
        return Optional.ofNullable(this.descriptionRegex);
    }
    public List<String> descriptions() {
        return this.descriptions;
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
     * @return A list of apis. Each element contains the following attributes:
     * 
     */
    public List<GetInstancesInstance> instances() {
        return this.instances;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    /**
     * @return A map of tags assigned to the bastionhost instance.
     * 
     */
    public Map<String,Object> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstancesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String descriptionRegex;
        private List<String> descriptions;
        private String id;
        private List<String> ids;
        private List<GetInstancesInstance> instances;
        private @Nullable String outputFile;
        private @Nullable Map<String,Object> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstancesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.descriptionRegex = defaults.descriptionRegex;
    	      this.descriptions = defaults.descriptions;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.instances = defaults.instances;
    	      this.outputFile = defaults.outputFile;
    	      this.tags = defaults.tags;
        }

        public Builder descriptionRegex(@Nullable String descriptionRegex) {
            this.descriptionRegex = descriptionRegex;
            return this;
        }
        public Builder descriptions(List<String> descriptions) {
            this.descriptions = Objects.requireNonNull(descriptions);
            return this;
        }
        public Builder descriptions(String... descriptions) {
            return descriptions(List.of(descriptions));
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
        public Builder instances(List<GetInstancesInstance> instances) {
            this.instances = Objects.requireNonNull(instances);
            return this;
        }
        public Builder instances(GetInstancesInstance... instances) {
            return instances(List.of(instances));
        }
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public Builder tags(@Nullable Map<String,Object> tags) {
            this.tags = tags;
            return this;
        }        public GetInstancesResult build() {
            return new GetInstancesResult(descriptionRegex, descriptions, id, ids, instances, outputFile, tags);
        }
    }
}