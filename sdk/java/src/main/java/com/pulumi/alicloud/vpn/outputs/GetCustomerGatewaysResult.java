// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpn.outputs;

import com.pulumi.alicloud.vpn.outputs.GetCustomerGatewaysGateway;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetCustomerGatewaysResult {
    /**
     * @return A list of VPN customer gateways. Each element contains the following attributes:
     * 
     */
    private final List<GetCustomerGatewaysGateway> gateways;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final List<String> ids;
    private final @Nullable String nameRegex;
    private final List<String> names;
    private final @Nullable String outputFile;

    @CustomType.Constructor
    private GetCustomerGatewaysResult(
        @CustomType.Parameter("gateways") List<GetCustomerGatewaysGateway> gateways,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("nameRegex") @Nullable String nameRegex,
        @CustomType.Parameter("names") List<String> names,
        @CustomType.Parameter("outputFile") @Nullable String outputFile) {
        this.gateways = gateways;
        this.id = id;
        this.ids = ids;
        this.nameRegex = nameRegex;
        this.names = names;
        this.outputFile = outputFile;
    }

    /**
     * @return A list of VPN customer gateways. Each element contains the following attributes:
     * 
     */
    public List<GetCustomerGatewaysGateway> gateways() {
        return this.gateways;
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

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCustomerGatewaysResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetCustomerGatewaysGateway> gateways;
        private String id;
        private List<String> ids;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCustomerGatewaysResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gateways = defaults.gateways;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
        }

        public Builder gateways(List<GetCustomerGatewaysGateway> gateways) {
            this.gateways = Objects.requireNonNull(gateways);
            return this;
        }
        public Builder gateways(GetCustomerGatewaysGateway... gateways) {
            return gateways(List.of(gateways));
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
        }        public GetCustomerGatewaysResult build() {
            return new GetCustomerGatewaysResult(gateways, id, ids, nameRegex, names, outputFile);
        }
    }
}