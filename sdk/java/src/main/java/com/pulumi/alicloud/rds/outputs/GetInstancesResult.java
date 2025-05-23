// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.rds.outputs;

import com.pulumi.alicloud.rds.outputs.GetInstancesInstance;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetInstancesResult {
    /**
     * @return `Standard` for standard access mode and `Safe` for high security access mode.
     * 
     */
    private @Nullable String connectionMode;
    /**
     * @return `Primary` for primary instance, `Readonly` for read-only instance, `Guard` for disaster recovery instance, and `Temp` for temporary instance.
     * 
     */
    private @Nullable String dbType;
    private @Nullable Boolean enableDetails;
    /**
     * @return Database type. Options are `MySQL`, `SQLServer`, `PostgreSQL`, `MariaDB`. If no value is specified, all types are returned.
     * 
     */
    private @Nullable String engine;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return A list of RDS instance IDs.
     * 
     */
    private List<String> ids;
    /**
     * @return A list of RDS instances. Each element contains the following attributes:
     * 
     */
    private List<GetInstancesInstance> instances;
    private @Nullable String nameRegex;
    /**
     * @return A list of RDS instance names.
     * 
     */
    private List<String> names;
    private @Nullable String outputFile;
    private @Nullable Integer pageNumber;
    private @Nullable Integer pageSize;
    /**
     * @return Status of the instance.
     * 
     */
    private @Nullable String status;
    private @Nullable Map<String,String> tags;
    private Integer totalCount;
    /**
     * @return ID of the VPC the instance belongs to.
     * 
     */
    private @Nullable String vpcId;
    /**
     * @return ID of the vSwitch the instance belongs to.
     * 
     */
    private @Nullable String vswitchId;

    private GetInstancesResult() {}
    /**
     * @return `Standard` for standard access mode and `Safe` for high security access mode.
     * 
     */
    public Optional<String> connectionMode() {
        return Optional.ofNullable(this.connectionMode);
    }
    /**
     * @return `Primary` for primary instance, `Readonly` for read-only instance, `Guard` for disaster recovery instance, and `Temp` for temporary instance.
     * 
     */
    public Optional<String> dbType() {
        return Optional.ofNullable(this.dbType);
    }
    public Optional<Boolean> enableDetails() {
        return Optional.ofNullable(this.enableDetails);
    }
    /**
     * @return Database type. Options are `MySQL`, `SQLServer`, `PostgreSQL`, `MariaDB`. If no value is specified, all types are returned.
     * 
     */
    public Optional<String> engine() {
        return Optional.ofNullable(this.engine);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of RDS instance IDs.
     * 
     */
    public List<String> ids() {
        return this.ids;
    }
    /**
     * @return A list of RDS instances. Each element contains the following attributes:
     * 
     */
    public List<GetInstancesInstance> instances() {
        return this.instances;
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    /**
     * @return A list of RDS instance names.
     * 
     */
    public List<String> names() {
        return this.names;
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
    /**
     * @return Status of the instance.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public Integer totalCount() {
        return this.totalCount;
    }
    /**
     * @return ID of the VPC the instance belongs to.
     * 
     */
    public Optional<String> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }
    /**
     * @return ID of the vSwitch the instance belongs to.
     * 
     */
    public Optional<String> vswitchId() {
        return Optional.ofNullable(this.vswitchId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstancesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String connectionMode;
        private @Nullable String dbType;
        private @Nullable Boolean enableDetails;
        private @Nullable String engine;
        private String id;
        private List<String> ids;
        private List<GetInstancesInstance> instances;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        private @Nullable Integer pageNumber;
        private @Nullable Integer pageSize;
        private @Nullable String status;
        private @Nullable Map<String,String> tags;
        private Integer totalCount;
        private @Nullable String vpcId;
        private @Nullable String vswitchId;
        public Builder() {}
        public Builder(GetInstancesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionMode = defaults.connectionMode;
    	      this.dbType = defaults.dbType;
    	      this.enableDetails = defaults.enableDetails;
    	      this.engine = defaults.engine;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.instances = defaults.instances;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
    	      this.pageNumber = defaults.pageNumber;
    	      this.pageSize = defaults.pageSize;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.totalCount = defaults.totalCount;
    	      this.vpcId = defaults.vpcId;
    	      this.vswitchId = defaults.vswitchId;
        }

        @CustomType.Setter
        public Builder connectionMode(@Nullable String connectionMode) {

            this.connectionMode = connectionMode;
            return this;
        }
        @CustomType.Setter
        public Builder dbType(@Nullable String dbType) {

            this.dbType = dbType;
            return this;
        }
        @CustomType.Setter
        public Builder enableDetails(@Nullable Boolean enableDetails) {

            this.enableDetails = enableDetails;
            return this;
        }
        @CustomType.Setter
        public Builder engine(@Nullable String engine) {

            this.engine = engine;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetInstancesResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            if (ids == null) {
              throw new MissingRequiredPropertyException("GetInstancesResult", "ids");
            }
            this.ids = ids;
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder instances(List<GetInstancesInstance> instances) {
            if (instances == null) {
              throw new MissingRequiredPropertyException("GetInstancesResult", "instances");
            }
            this.instances = instances;
            return this;
        }
        public Builder instances(GetInstancesInstance... instances) {
            return instances(List.of(instances));
        }
        @CustomType.Setter
        public Builder nameRegex(@Nullable String nameRegex) {

            this.nameRegex = nameRegex;
            return this;
        }
        @CustomType.Setter
        public Builder names(List<String> names) {
            if (names == null) {
              throw new MissingRequiredPropertyException("GetInstancesResult", "names");
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
        public Builder pageNumber(@Nullable Integer pageNumber) {

            this.pageNumber = pageNumber;
            return this;
        }
        @CustomType.Setter
        public Builder pageSize(@Nullable Integer pageSize) {

            this.pageSize = pageSize;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {

            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable Map<String,String> tags) {

            this.tags = tags;
            return this;
        }
        @CustomType.Setter
        public Builder totalCount(Integer totalCount) {
            if (totalCount == null) {
              throw new MissingRequiredPropertyException("GetInstancesResult", "totalCount");
            }
            this.totalCount = totalCount;
            return this;
        }
        @CustomType.Setter
        public Builder vpcId(@Nullable String vpcId) {

            this.vpcId = vpcId;
            return this;
        }
        @CustomType.Setter
        public Builder vswitchId(@Nullable String vswitchId) {

            this.vswitchId = vswitchId;
            return this;
        }
        public GetInstancesResult build() {
            final var _resultValue = new GetInstancesResult();
            _resultValue.connectionMode = connectionMode;
            _resultValue.dbType = dbType;
            _resultValue.enableDetails = enableDetails;
            _resultValue.engine = engine;
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.instances = instances;
            _resultValue.nameRegex = nameRegex;
            _resultValue.names = names;
            _resultValue.outputFile = outputFile;
            _resultValue.pageNumber = pageNumber;
            _resultValue.pageSize = pageSize;
            _resultValue.status = status;
            _resultValue.tags = tags;
            _resultValue.totalCount = totalCount;
            _resultValue.vpcId = vpcId;
            _resultValue.vswitchId = vswitchId;
            return _resultValue;
        }
    }
}
