// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.outputs;

import com.pulumi.alicloud.vpc.outputs.GetIpsecServersServer;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetIpsecServersResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    private @Nullable String ipsecServerName;
    private @Nullable String nameRegex;
    private List<String> names;
    private @Nullable String outputFile;
    private List<GetIpsecServersServer> servers;
    private @Nullable String vpnGatewayId;

    private GetIpsecServersResult() {}
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
    public Optional<String> ipsecServerName() {
        return Optional.ofNullable(this.ipsecServerName);
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
    public List<GetIpsecServersServer> servers() {
        return this.servers;
    }
    public Optional<String> vpnGatewayId() {
        return Optional.ofNullable(this.vpnGatewayId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIpsecServersResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<String> ids;
        private @Nullable String ipsecServerName;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        private List<GetIpsecServersServer> servers;
        private @Nullable String vpnGatewayId;
        public Builder() {}
        public Builder(GetIpsecServersResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.ipsecServerName = defaults.ipsecServerName;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
    	      this.servers = defaults.servers;
    	      this.vpnGatewayId = defaults.vpnGatewayId;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetIpsecServersResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            if (ids == null) {
              throw new MissingRequiredPropertyException("GetIpsecServersResult", "ids");
            }
            this.ids = ids;
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder ipsecServerName(@Nullable String ipsecServerName) {

            this.ipsecServerName = ipsecServerName;
            return this;
        }
        @CustomType.Setter
        public Builder nameRegex(@Nullable String nameRegex) {

            this.nameRegex = nameRegex;
            return this;
        }
        @CustomType.Setter
        public Builder names(List<String> names) {
            if (names == null) {
              throw new MissingRequiredPropertyException("GetIpsecServersResult", "names");
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
        public Builder servers(List<GetIpsecServersServer> servers) {
            if (servers == null) {
              throw new MissingRequiredPropertyException("GetIpsecServersResult", "servers");
            }
            this.servers = servers;
            return this;
        }
        public Builder servers(GetIpsecServersServer... servers) {
            return servers(List.of(servers));
        }
        @CustomType.Setter
        public Builder vpnGatewayId(@Nullable String vpnGatewayId) {

            this.vpnGatewayId = vpnGatewayId;
            return this;
        }
        public GetIpsecServersResult build() {
            final var _resultValue = new GetIpsecServersResult();
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.ipsecServerName = ipsecServerName;
            _resultValue.nameRegex = nameRegex;
            _resultValue.names = names;
            _resultValue.outputFile = outputFile;
            _resultValue.servers = servers;
            _resultValue.vpnGatewayId = vpnGatewayId;
            return _resultValue;
        }
    }
}