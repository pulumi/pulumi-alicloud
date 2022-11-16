// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.edas.outputs;

import com.pulumi.alicloud.edas.outputs.GetDeployGroupsGroup;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDeployGroupsResult {
    /**
     * @return The ID of the application that you want to deploy.
     * 
     */
    private final String appId;
    /**
     * @return A list of consumer group ids.
     * 
     */
    private final List<GetDeployGroupsGroup> groups;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final @Nullable String nameRegex;
    /**
     * @return A list of deploy group names.
     * 
     */
    private final List<String> names;
    private final @Nullable String outputFile;

    @CustomType.Constructor
    private GetDeployGroupsResult(
        @CustomType.Parameter("appId") String appId,
        @CustomType.Parameter("groups") List<GetDeployGroupsGroup> groups,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("nameRegex") @Nullable String nameRegex,
        @CustomType.Parameter("names") List<String> names,
        @CustomType.Parameter("outputFile") @Nullable String outputFile) {
        this.appId = appId;
        this.groups = groups;
        this.id = id;
        this.nameRegex = nameRegex;
        this.names = names;
        this.outputFile = outputFile;
    }

    /**
     * @return The ID of the application that you want to deploy.
     * 
     */
    public String appId() {
        return this.appId;
    }
    /**
     * @return A list of consumer group ids.
     * 
     */
    public List<GetDeployGroupsGroup> groups() {
        return this.groups;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    /**
     * @return A list of deploy group names.
     * 
     */
    public List<String> names() {
        return this.names;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDeployGroupsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String appId;
        private List<GetDeployGroupsGroup> groups;
        private String id;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDeployGroupsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.groups = defaults.groups;
    	      this.id = defaults.id;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
        }

        public Builder appId(String appId) {
            this.appId = Objects.requireNonNull(appId);
            return this;
        }
        public Builder groups(List<GetDeployGroupsGroup> groups) {
            this.groups = Objects.requireNonNull(groups);
            return this;
        }
        public Builder groups(GetDeployGroupsGroup... groups) {
            return groups(List.of(groups));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
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
        }        public GetDeployGroupsResult build() {
            return new GetDeployGroupsResult(appId, groups, id, nameRegex, names, outputFile);
        }
    }
}