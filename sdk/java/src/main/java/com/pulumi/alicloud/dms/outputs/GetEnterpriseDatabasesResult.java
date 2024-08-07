// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dms.outputs;

import com.pulumi.alicloud.dms.outputs.GetEnterpriseDatabasesDatabase;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetEnterpriseDatabasesResult {
    /**
     * @return A list of Database Entries. Each element contains the following attributes:
     * 
     */
    private List<GetEnterpriseDatabasesDatabase> databases;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return A list of Database IDs.
     * 
     */
    private List<String> ids;
    /**
     * @return The instance ID of the target database.
     * 
     */
    private String instanceId;
    private @Nullable String nameRegex;
    private @Nullable String outputFile;

    private GetEnterpriseDatabasesResult() {}
    /**
     * @return A list of Database Entries. Each element contains the following attributes:
     * 
     */
    public List<GetEnterpriseDatabasesDatabase> databases() {
        return this.databases;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of Database IDs.
     * 
     */
    public List<String> ids() {
        return this.ids;
    }
    /**
     * @return The instance ID of the target database.
     * 
     */
    public String instanceId() {
        return this.instanceId;
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEnterpriseDatabasesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetEnterpriseDatabasesDatabase> databases;
        private String id;
        private List<String> ids;
        private String instanceId;
        private @Nullable String nameRegex;
        private @Nullable String outputFile;
        public Builder() {}
        public Builder(GetEnterpriseDatabasesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databases = defaults.databases;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.instanceId = defaults.instanceId;
    	      this.nameRegex = defaults.nameRegex;
    	      this.outputFile = defaults.outputFile;
        }

        @CustomType.Setter
        public Builder databases(List<GetEnterpriseDatabasesDatabase> databases) {
            if (databases == null) {
              throw new MissingRequiredPropertyException("GetEnterpriseDatabasesResult", "databases");
            }
            this.databases = databases;
            return this;
        }
        public Builder databases(GetEnterpriseDatabasesDatabase... databases) {
            return databases(List.of(databases));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetEnterpriseDatabasesResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            if (ids == null) {
              throw new MissingRequiredPropertyException("GetEnterpriseDatabasesResult", "ids");
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
              throw new MissingRequiredPropertyException("GetEnterpriseDatabasesResult", "instanceId");
            }
            this.instanceId = instanceId;
            return this;
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
        public GetEnterpriseDatabasesResult build() {
            final var _resultValue = new GetEnterpriseDatabasesResult();
            _resultValue.databases = databases;
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.instanceId = instanceId;
            _resultValue.nameRegex = nameRegex;
            _resultValue.outputFile = outputFile;
            return _resultValue;
        }
    }
}
