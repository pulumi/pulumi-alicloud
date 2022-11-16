// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.rocketmq.outputs;

import com.pulumi.alicloud.rocketmq.outputs.GetInstancesInstance;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetInstancesResult {
    private final @Nullable Boolean enableDetails;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return A list of instance IDs.
     * 
     */
    private final List<String> ids;
    /**
     * @return A list of instances. Each element contains the following attributes:
     * 
     */
    private final List<GetInstancesInstance> instances;
    private final @Nullable String nameRegex;
    /**
     * @return A list of instance names.
     * 
     */
    private final List<String> names;
    private final @Nullable String outputFile;
    /**
     * @return The status of the instance. Read [Fields in InstanceVO](https://www.alibabacloud.com/help/doc-detail/106351.html) for further details.
     * 
     */
    private final @Nullable Integer status;
    /**
     * @return A map of tags assigned to the Ons instance.
     * 
     */
    private final @Nullable Map<String,Object> tags;

    @CustomType.Constructor
    private GetInstancesResult(
        @CustomType.Parameter("enableDetails") @Nullable Boolean enableDetails,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("instances") List<GetInstancesInstance> instances,
        @CustomType.Parameter("nameRegex") @Nullable String nameRegex,
        @CustomType.Parameter("names") List<String> names,
        @CustomType.Parameter("outputFile") @Nullable String outputFile,
        @CustomType.Parameter("status") @Nullable Integer status,
        @CustomType.Parameter("tags") @Nullable Map<String,Object> tags) {
        this.enableDetails = enableDetails;
        this.id = id;
        this.ids = ids;
        this.instances = instances;
        this.nameRegex = nameRegex;
        this.names = names;
        this.outputFile = outputFile;
        this.status = status;
        this.tags = tags;
    }

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
     * @return A list of instance IDs.
     * 
     */
    public List<String> ids() {
        return this.ids;
    }
    /**
     * @return A list of instances. Each element contains the following attributes:
     * 
     */
    public List<GetInstancesInstance> instances() {
        return this.instances;
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    /**
     * @return A list of instance names.
     * 
     */
    public List<String> names() {
        return this.names;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    /**
     * @return The status of the instance. Read [Fields in InstanceVO](https://www.alibabacloud.com/help/doc-detail/106351.html) for further details.
     * 
     */
    public Optional<Integer> status() {
        return Optional.ofNullable(this.status);
    }
    /**
     * @return A map of tags assigned to the Ons instance.
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
        private @Nullable Boolean enableDetails;
        private String id;
        private List<String> ids;
        private List<GetInstancesInstance> instances;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        private @Nullable Integer status;
        private @Nullable Map<String,Object> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstancesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableDetails = defaults.enableDetails;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.instances = defaults.instances;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
        }

        public Builder enableDetails(@Nullable Boolean enableDetails) {
            this.enableDetails = enableDetails;
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
        public Builder instances(List<GetInstancesInstance> instances) {
            this.instances = Objects.requireNonNull(instances);
            return this;
        }
        public Builder instances(GetInstancesInstance... instances) {
            return instances(List.of(instances));
        }
        public Builder nameRegex(@Nullable String nameRegex) {
            this.nameRegex = nameRegex;
            return this;
        }
        public Builder names(List<String> names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public Builder status(@Nullable Integer status) {
            this.status = status;
            return this;
        }
        public Builder tags(@Nullable Map<String,Object> tags) {
            this.tags = tags;
            return this;
        }        public GetInstancesResult build() {
            return new GetInstancesResult(enableDetails, id, ids, instances, nameRegex, names, outputFile, status, tags);
        }
    }
}