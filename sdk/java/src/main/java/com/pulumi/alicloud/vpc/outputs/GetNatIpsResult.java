// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.outputs;

import com.pulumi.alicloud.vpc.outputs.GetNatIpsIp;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetNatIpsResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    private List<GetNatIpsIp> ips;
    private @Nullable String nameRegex;
    private List<String> names;
    private String natGatewayId;
    private @Nullable String natIpCidr;
    private @Nullable List<String> natIpIds;
    private @Nullable List<String> natIpNames;
    private @Nullable String outputFile;
    private @Nullable String status;

    private GetNatIpsResult() {}
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
    public List<GetNatIpsIp> ips() {
        return this.ips;
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    public List<String> names() {
        return this.names;
    }
    public String natGatewayId() {
        return this.natGatewayId;
    }
    public Optional<String> natIpCidr() {
        return Optional.ofNullable(this.natIpCidr);
    }
    public List<String> natIpIds() {
        return this.natIpIds == null ? List.of() : this.natIpIds;
    }
    public List<String> natIpNames() {
        return this.natIpNames == null ? List.of() : this.natIpNames;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNatIpsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<String> ids;
        private List<GetNatIpsIp> ips;
        private @Nullable String nameRegex;
        private List<String> names;
        private String natGatewayId;
        private @Nullable String natIpCidr;
        private @Nullable List<String> natIpIds;
        private @Nullable List<String> natIpNames;
        private @Nullable String outputFile;
        private @Nullable String status;
        public Builder() {}
        public Builder(GetNatIpsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.ips = defaults.ips;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.natGatewayId = defaults.natGatewayId;
    	      this.natIpCidr = defaults.natIpCidr;
    	      this.natIpIds = defaults.natIpIds;
    	      this.natIpNames = defaults.natIpNames;
    	      this.outputFile = defaults.outputFile;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetNatIpsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            if (ids == null) {
              throw new MissingRequiredPropertyException("GetNatIpsResult", "ids");
            }
            this.ids = ids;
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder ips(List<GetNatIpsIp> ips) {
            if (ips == null) {
              throw new MissingRequiredPropertyException("GetNatIpsResult", "ips");
            }
            this.ips = ips;
            return this;
        }
        public Builder ips(GetNatIpsIp... ips) {
            return ips(List.of(ips));
        }
        @CustomType.Setter
        public Builder nameRegex(@Nullable String nameRegex) {

            this.nameRegex = nameRegex;
            return this;
        }
        @CustomType.Setter
        public Builder names(List<String> names) {
            if (names == null) {
              throw new MissingRequiredPropertyException("GetNatIpsResult", "names");
            }
            this.names = names;
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }
        @CustomType.Setter
        public Builder natGatewayId(String natGatewayId) {
            if (natGatewayId == null) {
              throw new MissingRequiredPropertyException("GetNatIpsResult", "natGatewayId");
            }
            this.natGatewayId = natGatewayId;
            return this;
        }
        @CustomType.Setter
        public Builder natIpCidr(@Nullable String natIpCidr) {

            this.natIpCidr = natIpCidr;
            return this;
        }
        @CustomType.Setter
        public Builder natIpIds(@Nullable List<String> natIpIds) {

            this.natIpIds = natIpIds;
            return this;
        }
        public Builder natIpIds(String... natIpIds) {
            return natIpIds(List.of(natIpIds));
        }
        @CustomType.Setter
        public Builder natIpNames(@Nullable List<String> natIpNames) {

            this.natIpNames = natIpNames;
            return this;
        }
        public Builder natIpNames(String... natIpNames) {
            return natIpNames(List.of(natIpNames));
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {

            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {

            this.status = status;
            return this;
        }
        public GetNatIpsResult build() {
            final var _resultValue = new GetNatIpsResult();
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.ips = ips;
            _resultValue.nameRegex = nameRegex;
            _resultValue.names = names;
            _resultValue.natGatewayId = natGatewayId;
            _resultValue.natIpCidr = natIpCidr;
            _resultValue.natIpIds = natIpIds;
            _resultValue.natIpNames = natIpNames;
            _resultValue.outputFile = outputFile;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}