// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cloudstoragegateway.outputs;

import com.pulumi.alicloud.cloudstoragegateway.outputs.GetGatewaySmbUsersUser;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetGatewaySmbUsersResult {
    private String gatewayId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    private @Nullable String nameRegex;
    private @Nullable String outputFile;
    private List<GetGatewaySmbUsersUser> users;

    private GetGatewaySmbUsersResult() {}
    public String gatewayId() {
        return this.gatewayId;
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
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public List<GetGatewaySmbUsersUser> users() {
        return this.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGatewaySmbUsersResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String gatewayId;
        private String id;
        private List<String> ids;
        private @Nullable String nameRegex;
        private @Nullable String outputFile;
        private List<GetGatewaySmbUsersUser> users;
        public Builder() {}
        public Builder(GetGatewaySmbUsersResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gatewayId = defaults.gatewayId;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.nameRegex = defaults.nameRegex;
    	      this.outputFile = defaults.outputFile;
    	      this.users = defaults.users;
        }

        @CustomType.Setter
        public Builder gatewayId(String gatewayId) {
            if (gatewayId == null) {
              throw new MissingRequiredPropertyException("GetGatewaySmbUsersResult", "gatewayId");
            }
            this.gatewayId = gatewayId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetGatewaySmbUsersResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            if (ids == null) {
              throw new MissingRequiredPropertyException("GetGatewaySmbUsersResult", "ids");
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
        public Builder outputFile(@Nullable String outputFile) {

            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder users(List<GetGatewaySmbUsersUser> users) {
            if (users == null) {
              throw new MissingRequiredPropertyException("GetGatewaySmbUsersResult", "users");
            }
            this.users = users;
            return this;
        }
        public Builder users(GetGatewaySmbUsersUser... users) {
            return users(List.of(users));
        }
        public GetGatewaySmbUsersResult build() {
            final var _resultValue = new GetGatewaySmbUsersResult();
            _resultValue.gatewayId = gatewayId;
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.nameRegex = nameRegex;
            _resultValue.outputFile = outputFile;
            _resultValue.users = users;
            return _resultValue;
        }
    }
}