// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.actiontrail.outputs;

import com.pulumi.alicloud.actiontrail.outputs.GetConsumerGroupsGroup;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetConsumerGroupsResult {
    private @Nullable String consumerIdRegex;
    private List<String> consumerIds;
    /**
     * @return A list of consumer group. Each element contains the following attributes:
     * 
     */
    private List<GetConsumerGroupsGroup> groups;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    /**
     * @return The instance_id of the instance.
     * 
     */
    private String instanceId;
    /**
     * @return A list of consumer group names.
     * 
     */
    private List<String> names;
    private @Nullable String outputFile;

    private GetConsumerGroupsResult() {}
    public Optional<String> consumerIdRegex() {
        return Optional.ofNullable(this.consumerIdRegex);
    }
    public List<String> consumerIds() {
        return this.consumerIds;
    }
    /**
     * @return A list of consumer group. Each element contains the following attributes:
     * 
     */
    public List<GetConsumerGroupsGroup> groups() {
        return this.groups;
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
     * @return The instance_id of the instance.
     * 
     */
    public String instanceId() {
        return this.instanceId;
    }
    /**
     * @return A list of consumer group names.
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

    public static Builder builder(GetConsumerGroupsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String consumerIdRegex;
        private List<String> consumerIds;
        private List<GetConsumerGroupsGroup> groups;
        private String id;
        private List<String> ids;
        private String instanceId;
        private List<String> names;
        private @Nullable String outputFile;
        public Builder() {}
        public Builder(GetConsumerGroupsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consumerIdRegex = defaults.consumerIdRegex;
    	      this.consumerIds = defaults.consumerIds;
    	      this.groups = defaults.groups;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.instanceId = defaults.instanceId;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
        }

        @CustomType.Setter
        public Builder consumerIdRegex(@Nullable String consumerIdRegex) {

            this.consumerIdRegex = consumerIdRegex;
            return this;
        }
        @CustomType.Setter
        public Builder consumerIds(List<String> consumerIds) {
            if (consumerIds == null) {
              throw new MissingRequiredPropertyException("GetConsumerGroupsResult", "consumerIds");
            }
            this.consumerIds = consumerIds;
            return this;
        }
        public Builder consumerIds(String... consumerIds) {
            return consumerIds(List.of(consumerIds));
        }
        @CustomType.Setter
        public Builder groups(List<GetConsumerGroupsGroup> groups) {
            if (groups == null) {
              throw new MissingRequiredPropertyException("GetConsumerGroupsResult", "groups");
            }
            this.groups = groups;
            return this;
        }
        public Builder groups(GetConsumerGroupsGroup... groups) {
            return groups(List.of(groups));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetConsumerGroupsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            if (ids == null) {
              throw new MissingRequiredPropertyException("GetConsumerGroupsResult", "ids");
            }
            this.ids = ids;
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder instanceId(String instanceId) {
            if (instanceId == null) {
              throw new MissingRequiredPropertyException("GetConsumerGroupsResult", "instanceId");
            }
            this.instanceId = instanceId;
            return this;
        }
        @CustomType.Setter
        public Builder names(List<String> names) {
            if (names == null) {
              throw new MissingRequiredPropertyException("GetConsumerGroupsResult", "names");
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
        public GetConsumerGroupsResult build() {
            final var _resultValue = new GetConsumerGroupsResult();
            _resultValue.consumerIdRegex = consumerIdRegex;
            _resultValue.consumerIds = consumerIds;
            _resultValue.groups = groups;
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.instanceId = instanceId;
            _resultValue.names = names;
            _resultValue.outputFile = outputFile;
            return _resultValue;
        }
    }
}
