// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.outputs;

import com.pulumi.alicloud.ecs.outputs.GetEcsDeploymentSetsSet;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetEcsDeploymentSetsResult {
    private @Nullable String deploymentSetName;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    private @Nullable String nameRegex;
    private List<String> names;
    private @Nullable String outputFile;
    private List<GetEcsDeploymentSetsSet> sets;
    private @Nullable String strategy;

    private GetEcsDeploymentSetsResult() {}
    public Optional<String> deploymentSetName() {
        return Optional.ofNullable(this.deploymentSetName);
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
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    public List<String> names() {
        return this.names;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public List<GetEcsDeploymentSetsSet> sets() {
        return this.sets;
    }
    public Optional<String> strategy() {
        return Optional.ofNullable(this.strategy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEcsDeploymentSetsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String deploymentSetName;
        private String id;
        private List<String> ids;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        private List<GetEcsDeploymentSetsSet> sets;
        private @Nullable String strategy;
        public Builder() {}
        public Builder(GetEcsDeploymentSetsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deploymentSetName = defaults.deploymentSetName;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
    	      this.sets = defaults.sets;
    	      this.strategy = defaults.strategy;
        }

        @CustomType.Setter
        public Builder deploymentSetName(@Nullable String deploymentSetName) {

            this.deploymentSetName = deploymentSetName;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetEcsDeploymentSetsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            if (ids == null) {
              throw new MissingRequiredPropertyException("GetEcsDeploymentSetsResult", "ids");
            }
            this.ids = ids;
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder nameRegex(@Nullable String nameRegex) {

            this.nameRegex = nameRegex;
            return this;
        }
        @CustomType.Setter
        public Builder names(List<String> names) {
            if (names == null) {
              throw new MissingRequiredPropertyException("GetEcsDeploymentSetsResult", "names");
            }
            this.names = names;
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {

            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder sets(List<GetEcsDeploymentSetsSet> sets) {
            if (sets == null) {
              throw new MissingRequiredPropertyException("GetEcsDeploymentSetsResult", "sets");
            }
            this.sets = sets;
            return this;
        }
        public Builder sets(GetEcsDeploymentSetsSet... sets) {
            return sets(List.of(sets));
        }
        @CustomType.Setter
        public Builder strategy(@Nullable String strategy) {

            this.strategy = strategy;
            return this;
        }
        public GetEcsDeploymentSetsResult build() {
            final var _resultValue = new GetEcsDeploymentSetsResult();
            _resultValue.deploymentSetName = deploymentSetName;
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.nameRegex = nameRegex;
            _resultValue.names = names;
            _resultValue.outputFile = outputFile;
            _resultValue.sets = sets;
            _resultValue.strategy = strategy;
            return _resultValue;
        }
    }
}