// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.threatdetection.outputs;

import com.pulumi.alicloud.threatdetection.outputs.GetWebLockConfigsConfig;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetWebLockConfigsResult {
    /**
     * @return A list of Web Lock Config Entries. Each element contains the following attributes:
     * 
     */
    private List<GetWebLockConfigsConfig> configs;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return A list of Web Lock Config IDs.
     * 
     */
    private List<String> ids;
    private @Nullable String lang;
    private @Nullable String outputFile;
    private @Nullable Integer pageNumber;
    private @Nullable Integer pageSize;
    private @Nullable String remark;
    private @Nullable String sourceIp;
    private @Nullable String status;

    private GetWebLockConfigsResult() {}
    /**
     * @return A list of Web Lock Config Entries. Each element contains the following attributes:
     * 
     */
    public List<GetWebLockConfigsConfig> configs() {
        return this.configs;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of Web Lock Config IDs.
     * 
     */
    public List<String> ids() {
        return this.ids;
    }
    public Optional<String> lang() {
        return Optional.ofNullable(this.lang);
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
    public Optional<String> remark() {
        return Optional.ofNullable(this.remark);
    }
    public Optional<String> sourceIp() {
        return Optional.ofNullable(this.sourceIp);
    }
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebLockConfigsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetWebLockConfigsConfig> configs;
        private String id;
        private List<String> ids;
        private @Nullable String lang;
        private @Nullable String outputFile;
        private @Nullable Integer pageNumber;
        private @Nullable Integer pageSize;
        private @Nullable String remark;
        private @Nullable String sourceIp;
        private @Nullable String status;
        public Builder() {}
        public Builder(GetWebLockConfigsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configs = defaults.configs;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.lang = defaults.lang;
    	      this.outputFile = defaults.outputFile;
    	      this.pageNumber = defaults.pageNumber;
    	      this.pageSize = defaults.pageSize;
    	      this.remark = defaults.remark;
    	      this.sourceIp = defaults.sourceIp;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder configs(List<GetWebLockConfigsConfig> configs) {
            if (configs == null) {
              throw new MissingRequiredPropertyException("GetWebLockConfigsResult", "configs");
            }
            this.configs = configs;
            return this;
        }
        public Builder configs(GetWebLockConfigsConfig... configs) {
            return configs(List.of(configs));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetWebLockConfigsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            if (ids == null) {
              throw new MissingRequiredPropertyException("GetWebLockConfigsResult", "ids");
            }
            this.ids = ids;
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder lang(@Nullable String lang) {

            this.lang = lang;
            return this;
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
        public Builder remark(@Nullable String remark) {

            this.remark = remark;
            return this;
        }
        @CustomType.Setter
        public Builder sourceIp(@Nullable String sourceIp) {

            this.sourceIp = sourceIp;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {

            this.status = status;
            return this;
        }
        public GetWebLockConfigsResult build() {
            final var _resultValue = new GetWebLockConfigsResult();
            _resultValue.configs = configs;
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.lang = lang;
            _resultValue.outputFile = outputFile;
            _resultValue.pageNumber = pageNumber;
            _resultValue.pageSize = pageSize;
            _resultValue.remark = remark;
            _resultValue.sourceIp = sourceIp;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}
